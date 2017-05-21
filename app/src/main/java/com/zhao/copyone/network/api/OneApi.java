package com.zhao.copyone.network.api;

import com.zhao.copyone.model.bean.DayInfo;
import com.zhao.copyone.model.bean.EssayDetail;
import com.zhao.copyone.model.bean.ItemList;
import com.zhao.copyone.model.bean.ListInfo;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by 39424 on 2017/3/11.
 */

public interface OneApi {
    @GET("onelist/idlist/")
    Observable<ListInfo> getListInfo();
    @GET("onelist/{dayId}/0")
    Observable<DayInfo> getDayInfo(@Path("dayId")String id);
    @GET("channel/{type}/more/0")
    Observable<ItemList> getItemList(@Path("type") String listType);
    @GET("essay/{readId}")
    Observable<EssayDetail> getEssayDetail(@Path("readId") String id);
}
