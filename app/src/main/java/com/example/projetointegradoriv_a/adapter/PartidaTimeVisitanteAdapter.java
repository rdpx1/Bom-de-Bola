package com.example.projetointegradoriv_a.adapter;

import android.content.Context;
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
import com.example.projetointegradoriv_a.classes.JogadoresVisitante;
import com.example.projetointegradoriv_a.classes.Partida;
import com.example.projetointegradoriv_a.classes.PartidaInfo;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PartidaTimeVisitanteAdapter extends RecyclerView.Adapter<PartidaTimeVisitanteAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    Context context;
    List<JogadoresVisitante> jogadoresVisitanteList;


    public PartidaTimeVisitanteAdapter(Context context, List<JogadoresVisitante> jogadoresVisitanteList) {
        this.context = context;
        this.jogadoresVisitanteList = jogadoresVisitanteList;

    }

    public void setVisitanteList(List<JogadoresVisitante> jogadoresVisitanteList){
        this.jogadoresVisitanteList =jogadoresVisitanteList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_jogadores_visitante,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.nameVisitante.setText(jogadoresVisitanteList.get(position).getNome().toString());
        holder.numeroVisitante.setText(jogadoresVisitanteList.get(position).getCamisa().toString());

    }

    @Override
    public int getItemCount() {
        if(jogadoresVisitanteList != null){
            return jogadoresVisitanteList.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        TextView nameVisitante;
        TextView numeroVisitante;
        RelativeLayout parentLayout;


        public ViewHolder(View itemView){

            super(itemView);
            nameVisitante = itemView.findViewById(R.id.nome_jogador_visitante);
            numeroVisitante = itemView.findViewById(R.id.numero_jogador_visitante);
            parentLayout = itemView.findViewById(R.id.parent_layout);

        }

    }
}
