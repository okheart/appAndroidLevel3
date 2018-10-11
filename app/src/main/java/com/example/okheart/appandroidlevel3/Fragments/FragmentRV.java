package com.example.okheart.appandroidlevel3.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.okheart.appandroidlevel3.R;
import com.example.okheart.appandroidlevel3.adapters.ListItemAdapter;

import java.util.ArrayList;

public class FragmentRV extends Fragment {

    public FragmentRV(){
    }

    public static FragmentRV newInstance(){
        return new FragmentRV();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_rv, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rv = view.findViewById(R.id.rv_list_item);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        ListItemAdapter listItemAdapter = new ListItemAdapter();
        rv.setAdapter(listItemAdapter);


        // создание листа для проверки адаптера
        ArrayList<String> mList = new ArrayList<>();
        for (int i = 1; i < 5; i++){
            mList.add("Item " +i);
        }

        listItemAdapter.setItem(mList);
    }
}
