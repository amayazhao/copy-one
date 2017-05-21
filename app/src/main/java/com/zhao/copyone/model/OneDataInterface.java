package com.zhao.copyone.model;

import com.zhao.copyone.model.bean.DayInfo;
import com.zhao.copyone.model.bean.ItemList;
import com.zhao.copyone.model.bean.ListInfo;

import io.reactivex.Observable;

/**
 * Created by 39424 on 2017/3/12.
 */

public interface OneDataInterface {
    Observable<ListInfo> getListInfo();
    Observable<DayInfo> getDayInfo(String dayId);
    Observable<ItemList> getItemList(String type);
}
