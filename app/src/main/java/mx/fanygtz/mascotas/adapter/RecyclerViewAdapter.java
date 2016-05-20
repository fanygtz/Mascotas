package mx.fanygtz.mascotas.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import mx.fanygtz.mascotas.poyo.Mascotas;
import mx.fanygtz.mascotas.R;

/**
 * Created by FGutierrez on 2016/05/09.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MascotaViewHolder> {
    private ArrayList<Mascotas> Mascota;
    private Activity activity;
    public RecyclerViewAdapter(ArrayList<Mascotas> Mascota, Activity activity){
        this.Mascota = Mascota;
        this.activity = activity;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);
        return new MascotaViewHolder(v);
    }


    @Override
    public void onBindViewHolder(final MascotaViewHolder holder, final int position) {
        final Mascotas registro = Mascota.get(position);
        holder.nombre.setText(registro.getName());
        holder.rating.setText(String.valueOf(registro.getContador()));
        holder.idFoto.setImageResource(registro.getIdFoto());
        //String count = "" + Mascota.get(position).getContador();
        //holder.nombre.setText(Mascota.get(position).getName());
        //holder.rating.setText(count);
        //holder.idFoto.setImageResource(Mascota.get(position).getIdFoto());
        holder.btnContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MascotaViewHolder h = holder;
                registro.setContador(registro.getContador() + 1);
                h.rating.setText(String.valueOf(Mascota.get(position).getContador()));
                //h.rating.setText(String.valueOf(1 + Integer.parseInt(holder.rating.getText().toString())));
                //Toast.makeText(activity, "Mi Favorito es : " + Mascota.get(position).getName(),
                //        Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return Mascota.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{
        TextView nombre;
        TextView rating;
        ImageView idFoto;
        ImageButton btnContador;
        MascotaViewHolder(View itemView){
            super(itemView);
            nombre = (TextView)itemView.findViewById(R.id.tvNombre);
            idFoto = (ImageView)itemView.findViewById(R.id.ivFoto);
            rating = (TextView)itemView.findViewById(R.id.tvRating);
            btnContador=(ImageButton)itemView.findViewById(R.id.btnContador);


        }
    }


}
