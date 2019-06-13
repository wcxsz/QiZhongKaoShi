package com.example.qizhongkaoshi.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class DataDb {
    @Id (autoincrement = true)
    private Long id;
    private String title;
    private String type;
    private String url;
    private String img;
    @Generated(hash = 1639822242)
    public DataDb(Long id, String title, String type, String url, String img) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.url = url;
        this.img = img;
    }
    @Generated(hash = 149697833)
    public DataDb() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getUrl() {
        return this.url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getImg() {
        return this.img;
    }
    public void setImg(String img) {
        this.img = img;
    }

}
