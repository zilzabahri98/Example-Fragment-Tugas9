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

public class FragmentGrid extends Fragment {
    private RecyclerView rvGrid;
    private ArrayList<singer> list = new ArrayList<>();

    public FragmentGrid() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_grid, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvGrid = view.findViewById(R.id.rv_grid);
        list.addAll(singerdata.getListData());
        showDataGrid();
    }

    private void showDataGrid() {
        rvGrid.setLayoutManager(new LinearLayoutManager(getContext()));
        GridSingerAdapter gridSingerAdapter = new GridSingerAdapter(list);
        rvGrid.setAdapter(gridSingerAdapter);
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
