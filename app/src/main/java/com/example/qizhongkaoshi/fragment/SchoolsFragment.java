package com.example.qizhongkaoshi.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qizhongkaoshi.R;
import com.example.qizhongkaoshi.adapter.RlvAdapter;
import com.example.qizhongkaoshi.bean.DataDb;
import com.example.qizhongkaoshi.model.SchoolModelImpl;
import com.example.qizhongkaoshi.presenter.SchoolPresenter;
import com.example.qizhongkaoshi.presenter.SchoolPresenterImpl;
import com.example.qizhongkaoshi.utlis.Utils;
import com.example.qizhongkaoshi.view.SchoolView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SchoolsFragment extends Fragment implements SchoolView {


    private View view;
    private RecyclerView rlv;
    private ArrayList<DataDb> dataDbs;
    private RlvAdapter adapter;

    public SchoolsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_schools, container, false);

        initView(inflate);
        return inflate;
    }

    private void initData() {
        ArrayList<DataDb> dataDbs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            dataDbs.add(new DataDb(null,"标题标题标题标题","内容内容内容内容内容","http://www.wanandroid.com/blog/show/2609","https://www.wanandroid.com/resources/image/pc/default_project_img.jpg"));
            Utils.getUtils().insert(dataDbs);
        }
    }

    private void initView(View inflate) {
        initData();
        rlv = (RecyclerView) inflate.findViewById(R.id.rlv);
        dataDbs = new ArrayList<>();
        initData2();
        rlv.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new RlvAdapter(dataDbs, getContext());
        rlv.setAdapter(adapter);
    }

    private void initData2() {
        SchoolPresenter presenter = new SchoolPresenterImpl(new SchoolModelImpl(),this);
        presenter.getData();
    }

    @Override
    public void onSeccoss(List<DataDb> list) {
        dataDbs.addAll(list);
       /* adapter.setDataDbs(dataDbs);
        adapter.notifyDataSetChanged();*/
    }

    @Override
    public void onFails(String msg) {

    }
}
