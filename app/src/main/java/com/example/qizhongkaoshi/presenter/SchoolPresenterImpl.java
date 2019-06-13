package com.example.qizhongkaoshi.presenter;

import android.widget.ScrollView;

import com.example.qizhongkaoshi.bean.DataDb;
import com.example.qizhongkaoshi.callback.SchoolCallBack;
import com.example.qizhongkaoshi.model.SchoolModel;
import com.example.qizhongkaoshi.view.SchoolView;

import java.util.List;

public class SchoolPresenterImpl implements SchoolPresenter, SchoolCallBack {
    private SchoolModel schoolModel;
    private SchoolView schoolView;

    public SchoolPresenterImpl(SchoolModel schoolModel, SchoolView schoolView) {
        this.schoolModel = schoolModel;
        this.schoolView = schoolView;
    }

    @Override
    public void getData() {
        schoolModel.getData(this);

    }

    @Override
    public void onSeccoss(List<DataDb> list) {
        schoolView.onSeccoss(list);
    }

    @Override
    public void onFails(String msg) {
        schoolView.onFails(msg);
    }
}
