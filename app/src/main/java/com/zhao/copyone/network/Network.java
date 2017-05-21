package com.zhao.copyone.network;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.zhao.copyone.network.api.OneApi;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 39424 on 2017/3/11.
 */

public class Network {
    private static OkHttpClient mOkHttpClient = new OkHttpClient();
    private static GsonConverterFactory gsonConverterFactory = GsonConverterFactory.create();
    private static RxJava2CallAdapterFactory rxJava2CallAdapterFactory = RxJava2CallAdapterFactory.create();
    private static OneApi oneApi;

    public static OneApi getOneApiClient(){
        if(oneApi==null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://v3.wufazhuce.com:8000/api/")
                    .client(mOkHttpClient)
                    .addConverterFactory(gsonConverterFactory)
                    .addCallAdapterFactory(rxJava2CallAdapterFactory)
                    .build();
            oneApi = retrofit.create(OneApi.class);
        }
        return oneApi;
    }
}
