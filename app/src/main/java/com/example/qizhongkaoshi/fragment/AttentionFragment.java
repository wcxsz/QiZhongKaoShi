package com.example.qizhongkaoshi.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qizhongkaoshi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttentionFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_attention, container, false);
        return inflate;
    }

}
