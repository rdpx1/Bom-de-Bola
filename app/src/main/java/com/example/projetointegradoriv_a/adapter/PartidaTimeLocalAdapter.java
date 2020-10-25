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
import com.example.projetointegradoriv_a.classes.JogadoresLocal;
import com.example.projetointegradoriv_a.classes.Partida;
import com.example.projetointegradoriv_a.classes.PartidaInfo;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PartidaTimeLocalAdapter extends RecyclerView.Adapter<PartidaTimeLocalAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    Context context;
    List<JogadoresLocal> jogadoresLocalList;


    public PartidaTimeLocalAdapter(Context context, List<JogadoresLocal> jogadoresLocalList) {
        this.context = context;
        this.jogadoresLocalList = jogadoresLocalList;

    }

    public void setLocalList(List<JogadoresLocal> jogadoresLocalList){
        this.jogadoresLocalList = jogadoresLocalList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_jogadores_local,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.nameLocal.setText(jogadoresLocalList.get(position).getNome().toString());
        holder.numeroLocal.setText(jogadoresLocalList.get(position).getCamisa().toString());


    }

    @Override
    public int getItemCount() {
        if(jogadoresLocalList != null){
            return jogadoresLocalList.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        TextView nameLocal;
        TextView numeroLocal;
        RelativeLayout parentLayout;


        public ViewHolder(View itemView){

            super(itemView);
            nameLocal = itemView.findViewById(R.id.nome_jogador);
            numeroLocal = itemView.findViewById(R.id.numero_jogador);
            parentLayout = itemView.findViewById(R.id.parent_layout);

        }

    }
}
