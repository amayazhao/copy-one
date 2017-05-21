package com.zhao.copyone.model.impl;

import com.zhao.copyone.model.OneDataInterface;
import com.zhao.copyone.model.bean.DayInfo;
import com.zhao.copyone.model.bean.ItemList;
import com.zhao.copyone.model.bean.ListInfo;
import com.zhao.copyone.network.Network;

import io.reactivex.Observable;

/**
 * Created by 39424 on 2017/3/12.
 */

public class OneDataRepository implements OneDataInterface {
    /**
     * 单例化
     */
    private static OneDataRepository oneDataRepository;

    static {
        oneDataRepository = new OneDataRepository();
    }

    public static OneDataRepository getInstance(){
        return oneDataRepository;
    }

    @Override
    public Observable<ListInfo> getListInfo() {
        //todo
        return Network.getOneApiClient().getListInfo();
    }

    @Override
    public Observable<DayInfo> getDayInfo(String dayId) {
        return Network.getOneApiClient().getDayInfo(dayId);
    }

    @Override
    public Observable<ItemList> getItemList(String type) {
        return Network.getOneApiClient().getItemList(type);
    }
}
