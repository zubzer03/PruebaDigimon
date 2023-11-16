package com.example.apidigimon2;
import  com.example.apidigimon2.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DigimonHolder extends RecyclerView.ViewHolder{

    private TextView title;
    private TextView desc;
    private ImageView image;

    public DigimonHolder(@NonNull View itemView) {
        super(itemView);
        title=itemView.findViewById(R.id.title);
        desc=itemView.findViewById(R.id.desc);
        image=itemView.findViewById(R.id.image);
    }
    public TextView getTitle(){
        return title;
    }
    public TextView getdesc(){
        return desc;
    }
    public ImageView getImage(){
        return image;
    }
}
