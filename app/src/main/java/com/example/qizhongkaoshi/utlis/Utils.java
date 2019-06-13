package com.example.qizhongkaoshi.utlis;

import com.example.qizhongkaoshi.base.BaseApp;
import com.example.qizhongkaoshi.bean.DataDb;
import com.example.qizhongkaoshi.dao.DaoMaster;
import com.example.qizhongkaoshi.dao.DaoSession;
import com.example.qizhongkaoshi.dao.DataDbDao;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    private volatile static Utils utils;
    private  DataDbDao dataDbDao;

    private Utils(){

        /*DaoSession daoSession = DaoMaster.newDevSession(BaseApp.getBaseApp(), "data.db");
        dataDbDao = daoSession.getDataDbDao();*/
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(BaseApp.getBaseApp(), "data.db");
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDatabase());
        DaoSession daoSession = daoMaster.newSession();
        dataDbDao = daoSession.getDataDbDao();
    }

    public static Utils getUtils() {
        if (utils == null){
            synchronized (Utils.class){
                if (utils == null){
                    utils = new Utils();
                }
            }
        }
        return utils;
    }
    public boolean has(ArrayList<DataDb> list){
        if (list.size()>0 && list != null){
            return true;
        }
        return false;
    }
    public void insert(ArrayList<DataDb> list){

           dataDbDao.insertOrReplaceInTx(list);

    }
    public List<DataDb> query(){
        return dataDbDao.queryBuilder().list();
    }
}
