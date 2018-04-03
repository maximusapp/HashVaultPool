package com.example.maximus09.hashvaultpool;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.balysv.materialmenu.MaterialMenuDrawable;

import java.util.ArrayList;
import java.util.List;


public class FragmentAdd extends Fragment {

    private TextView text;
    private RecyclerView recyclerView;
    private AddMinerItemAdapter addMinerItemAdapter;
    private List<AddMinerListItem>addMinerListItems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add, container, false);

        text = (TextView)view.findViewById(R.id.textAddFragment);

        ((MainActivity)getActivity()).materialMenu.animateIconState(MaterialMenuDrawable.IconState.X);

        recyclerView = (RecyclerView)view.findViewById(R.id.recyclerViewAddPage);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        addMinerListItems = new ArrayList<>();
        addMinerListItems.add(new AddMinerListItem("ETH Ethermine.org"));
        addMinerListItems.add(new AddMinerListItem("ETH Ethpool.org"));
        addMinerListItems.add(new AddMinerListItem("ETH Nanopool.org"));
        addMinerListItems.add(new AddMinerListItem("ETC Ethermine.org"));
        addMinerListItems.add(new AddMinerListItem("ETC Nanopool.org"));
        addMinerListItems.add(new AddMinerListItem("ZEC Flypool.org"));
        addMinerListItems.add(new AddMinerListItem("ZEC Nanopool.org"));
        addMinerListItems.add(new AddMinerListItem("SC Nanopool.org"));
        addMinerListItems.add(new AddMinerListItem("XMR Nanopool.org"));
        addMinerListItems.add(new AddMinerListItem("PASC Nanopool.org"));
        addMinerListItems.add(new AddMinerListItem("ETN Nanopool.org"));

        addMinerItemAdapter = new AddMinerItemAdapter(addMinerListItems, view.getContext());
        recyclerView.setAdapter(addMinerItemAdapter);

        return view;
    }


}
