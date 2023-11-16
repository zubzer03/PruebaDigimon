package com.example.apidigimon2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvm;
    private List<DigimonHolder> digimon;
    public static String apiUrl = "https://digimon-api.vercel.app/api/digimon";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvm = findViewById(R.id.rcvm);
        rcvm.setLayoutManager(newLinearLayoutManager(this));

        RetrofitIns.getInstance().getDigimonApiService().getDigimon().enqueue(new Callback<List<DigimonHolder>>() {
            @Override
            public void onResponse(Call<List<DigimonHolder>> call, Response<List<DigimonHolder>> response) {
                digimon = response.body();
                rcvm.setAdapter(newDigimonAdap(getApplicationContext(),digimon));
            }

            @Override
            public void onFailure(Call<List<DigimonHolder>> call, Throwable t) {
                int error = Log.e("Error");
            }
        });
    }
}