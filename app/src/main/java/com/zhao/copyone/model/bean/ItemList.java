package com.zhao.copyone.model.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 39424 on 2017/4/4.
 */

public class ItemList {
    private int res;

    private List<ContentListBean> data;

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public List<ContentListBean> getData() {
        return data;
    }

    public void setData(List<ContentListBean> data) {
        this.data = data;
    }
}
