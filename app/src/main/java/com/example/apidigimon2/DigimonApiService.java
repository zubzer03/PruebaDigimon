package com.example.apidigimon2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.*;


public interface DigimonApiService {


    @GET("digimon")
    Call <List<DigimonHolder>>getDigimon();

}
