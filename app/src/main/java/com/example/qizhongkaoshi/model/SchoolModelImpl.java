package com.example.qizhongkaoshi.model;

import com.example.qizhongkaoshi.bean.DataDb;
import com.example.qizhongkaoshi.callback.SchoolCallBack;
import com.example.qizhongkaoshi.utlis.Utils;

import java.util.List;

public class SchoolModelImpl implements SchoolModel {

    @Override
    public void getData(SchoolCallBack callBack) {
        List<DataDb> query = Utils.getUtils().query();
        if (query.size()>0 && query != null){
            callBack.onSeccoss(query);
        }else {
            callBack.onFails("查询失败");
        }
    }
}
