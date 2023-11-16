package com.example.apidigimon2;

import static com.example.apidigimon2.MainActivity.apiUrl;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitIns {
    public static RetrofitIns instance;
    private DigimonApiService digimonApiService;

    RetrofitIns(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(apiUrl).addConverterFactory(GsonConverterFactory.create()).build();
        digimonApiService = retrofit.create(DigimonApiService.class);
    }
    public static RetrofitIns getInstance(){
        if (instance == null){
            instance = new RetrofitIns();

        }
        return instance;
    }
    public DigimonApiService getDigimonApiService(){
        return digimonApiService
    }

}
