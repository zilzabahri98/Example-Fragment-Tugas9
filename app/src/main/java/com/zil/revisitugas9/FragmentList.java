package com.zil.revisitugas9;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class FragmentList extends Fragment {
    private RecyclerView rvList;
    private ArrayList<singer> list = new ArrayList<>();

    public FragmentList() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvList = view.findViewById(R.id.rv_list);
        list.addAll(singerdata.getListData());
        showDataList();
    }

    private void showDataList() {
        rvList.setLayoutManager(new LinearLayoutManager(getContext()));
        ListSingerAdapter listSingerAdapter = new ListSingerAdapter(list);
        rvList.setAdapter(listSingerAdapter);

        listSingerAdapter.setOnItemClickCallback(new ListSingerAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(singer singer) {
                Toast.makeText(getContext(), "Kamu memilih " + singer.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}