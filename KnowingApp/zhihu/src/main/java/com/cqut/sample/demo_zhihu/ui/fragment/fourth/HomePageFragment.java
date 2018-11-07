package com.cqut.sample.demo_zhihu.ui.fragment.fourth;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.cqut.fragmentation.SupportFragment;
import com.cqut.sample.R;
import com.cqut.sample.demo_zhihu.ui.fragment.first.child.DetailFragment;
import com.cqut.sample.demo_zhihu.ui.fragment.third.ColleageFragment;



public class HomePageFragment extends SupportFragment {
    private static final String ARG_TYPE = "arg_type";
    String TextContent ="Colleage";
    private String mTitle;

    public static HomePageFragment newInstance(String title) {

        Bundle args = new Bundle();
        args.putString(ARG_TYPE, title);
        HomePageFragment fragment = new HomePageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    @Override
    public void onStart() {
        super.onStart();
        View view = getActivity().findViewById(R.id.notice_set);
        view.setOnClickListener(new android.view.View.OnClickListener(){
        public void onClick(android.view.View v) {
            getFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.container, new text1()).commit();
        }
        });
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_notice, container, false);
        return view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ImageView imageView = getActivity().findViewById(R.id.notice_set);
        imageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),setting.class);
                startActivity(intent);
            }
        });

    }

}
