package com.example.maximus09.hashvaultpool;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toolbar;

import com.balysv.materialmenu.MaterialMenuDrawable;


public class FragmentMain extends Fragment implements View.OnClickListener {

    public FragmentMain(){}

    private TextView text;

    Toolbar toolbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        setHasOptionsMenu(true);

        ((MainActivity)getActivity()).materialMenu.animateIconState(MaterialMenuDrawable.IconState.BURGER);

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        text = (TextView) view.findViewById(R.id.fragment_text);
        view.findViewById(R.id.fab).setOnClickListener(this);

        toolbar = (Toolbar)view.findViewById(R.id.toolbar);

        return view;
    }

    @Override
    public void onResume() {
        ((MainActivity) getActivity()).setToolbarTitle(R.string.app_name);
        super.onResume();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.fab:
               ((MainActivity) getActivity()).showFragment(new FragmentAdd());
               ((MainActivity) getActivity()).setToolbarTitle(R.string.addNewMiner);
               break;
        }

    }

}