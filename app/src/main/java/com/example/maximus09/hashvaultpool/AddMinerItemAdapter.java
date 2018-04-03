package com.example.maximus09.hashvaultpool;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class AddMinerItemAdapter extends RecyclerView.Adapter<AddMinerItemAdapter.ViewHolder> {

    private List<AddMinerListItem> listItems;
    private Context mContext;

    public AddMinerItemAdapter(List<AddMinerListItem> listItems, Context mContext) {
        this.listItems = listItems;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.add_miner_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final AddMinerListItem addMinerListItem = listItems.get(position);
        holder.textTitle.setText(addMinerListItem.getTitle());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textTitle;
        public ViewHolder(View itemView) {
            super(itemView);
            textTitle = (TextView)itemView.findViewById(R.id.text_pull_internet_address);
        }
    }


}
