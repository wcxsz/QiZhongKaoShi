package com.example.qizhongkaoshi.view;

import com.example.qizhongkaoshi.bean.DataDb;

import java.util.List;

public interface SchoolView {
    void onSeccoss(List<DataDb> list);
    void onFails(String msg);
}
