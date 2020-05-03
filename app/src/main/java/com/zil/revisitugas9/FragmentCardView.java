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

import java.util.ArrayList;


public class FragmentCardView extends Fragment {
    private RecyclerView rvCardview;
    private ArrayList<singer> list = new ArrayList<>();

    public FragmentCardView() {
        // Required empty public constructor
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_card_view, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvCardview = view.findViewById(R.id.rv_cardview);
        list.addAll(singerdata.getListData());
        showDataCardview();
    }

    private void showDataCardview() {
        rvCardview.setLayoutManager(new LinearLayoutManager(getContext()));
        CardViewSingerAdapter cardViewSingerAdapter = new CardViewSingerAdapter(list);
        rvCardview.setAdapter(cardViewSingerAdapter);
    }
}
