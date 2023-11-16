package com.example.apidigimon2;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.squareup.picasso.Picasso;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DigimonAdap extends RecyclerView.Adapter<DigimonHolder> {

    private Context contexto;
    private List<DigimonHolder> digimon;

    public DigimonAdap(Context contexto, List<DigimonHolder>digimon){
        this.contexto = contexto;
        this.digimon = digimon;
    }

    @NonNull
    @Override
    public DigimonHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DigimonHolder(LayoutInflater.from(contexto).inflate(R.layout.i_digimon,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DigimonHolder holder, int position) {
        holder.getTitle().setText(digimon.get(position).getTitle());
        holder.getdesc().setText(digimon.get(position).getdesc());
        Picasso.get().load(digimon.get(position).getThumbnailUrl()).into(holder.getImage());


    }

    @Override
    public int getItemCount() {
        return digimon.size();
    }
}
