package com.example.projetointegradoriv_a.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.projetointegradoriv_a.R;
import com.example.projetointegradoriv_a.activity.PartidaActivity;
import com.example.projetointegradoriv_a.classes.Partida;


import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RodadaAdapter extends RecyclerView.Adapter<RodadaAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";


    Context context;
    List<Partida> partidaList;


    public RodadaAdapter(Context context, List<Partida> partidaList) {
        this.context = context;
        this.partidaList = partidaList;

    }

    public void setPartidaList(List<Partida> partidaList){
        this.partidaList = partidaList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_partidas_para_rodada,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.nameLocal.setText(partidaList.get(position).getNomeLocal().toString());
        holder.nameVisitante.setText(partidaList.get(position).getNomeVisitante().toString());

        Glide.with(context).load(partidaList.get(position).getUrlBrasaoLocal()).apply(RequestOptions.centerCropTransform()).into(holder.brasaoLocal);
        Glide.with(context).load(partidaList.get(position).getUrlBrasaoVisitante()).apply(RequestOptions.centerCropTransform()).into(holder.brasaoVisitante);

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = partidaList.get(position).getIdPartida();
                Intent intent = new Intent(context, PartidaActivity.class);
                intent.addFlags((Intent.FLAG_ACTIVITY_NEW_TASK));
                intent.putExtra("id", ""+id);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        if(partidaList != null){
            return partidaList.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        TextView nameLocal;
        TextView nameVisitante;
        CircleImageView brasaoLocal;
        CircleImageView brasaoVisitante;
        RelativeLayout parentLayout;


        public ViewHolder(View itemView){

            super(itemView);
            nameLocal = itemView.findViewById(R.id.time_local);
            nameVisitante = itemView.findViewById(R.id.time_visitante);

            brasaoLocal = itemView.findViewById(R.id.brasao_local);
            brasaoVisitante = itemView.findViewById(R.id.brasao_visitante);

            parentLayout = itemView.findViewById(R.id.parent_layout);

        }

    }
}
