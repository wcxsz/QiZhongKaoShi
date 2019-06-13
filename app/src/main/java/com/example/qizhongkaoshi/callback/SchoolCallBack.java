package com.example.qizhongkaoshi.callback;

import com.example.qizhongkaoshi.bean.DataDb;

import java.util.List;

public interface SchoolCallBack {
    void onSeccoss(List<DataDb> list);
    void onFails(String msg);
}
