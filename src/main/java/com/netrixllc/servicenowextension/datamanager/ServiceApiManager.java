package com.netrixllc.servicenowextension.datamanager;

import com.netrixllc.servicenowextension.BuildConfig;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceApiManager {
    /**
     * For returning a Service now instance equipped with the BaseURL
     * @return
     */
    public static Retrofit serviceNowApi() {
        return new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
