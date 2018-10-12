package com.example.okheart.appandroidlevel3.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.okheart.appandroidlevel3.R;

import java.util.ArrayList;
import java.util.List;


public class ListItemAdapter extends RecyclerView.Adapter<ListItemAdapter.ItemHolder> {

    private List<String> itemList = new ArrayList<>();

    public void setItem(ArrayList<String> item){
    itemList.clear();
    itemList.addAll(item);
    notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ListItemAdapter.ItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ItemHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_list_view, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ListItemAdapter.ItemHolder itemHolder, int i) {
        itemHolder.itemListName.setText(itemList.get(i));
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    static class ItemHolder extends RecyclerView.ViewHolder{

        private TextView itemListName;

        ItemHolder(@NonNull View view) {
            super(view);
            itemListName = view.findViewById(R.id.tv_list_item_view);
        }

    }

}
