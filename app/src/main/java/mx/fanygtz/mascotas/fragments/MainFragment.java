package mx.fanygtz.mascotas.fragments;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import mx.fanygtz.mascotas.R;
import mx.fanygtz.mascotas.adapter.RecyclerViewAdapter;
import mx.fanygtz.mascotas.poyo.Mascotas;


public class MainFragment extends Fragment {
    ArrayList<Mascotas> mascotaList;// Información.
    RecyclerView rv;
    RecyclerViewAdapter rAdapter;
    RecyclerView.LayoutManager lmanager;


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        inicializarMascotas();
        rv = (RecyclerView) v.findViewById(R.id.rv);
        //rv.setHasFixedSize(true);
        lmanager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        rv.setLayoutManager(lmanager);
        inicializaAdapter();
        return v;
    }
    private void inicializaAdapter(){
        rAdapter = new RecyclerViewAdapter(mascotaList,getActivity());
        rv.setAdapter(rAdapter);
    }

    private void inicializarMascotas(){
        mascotaList = new ArrayList<>();
        mascotaList.add(new Mascotas("Lulu", R.drawable.cachorro2, 0));
        mascotaList.add(new Mascotas("Copito", R.drawable.conejito2, 0));
        mascotaList.add(new Mascotas("Anubi",R.drawable.minino2,0));
        mascotaList.add(new Mascotas("Dumas", R.drawable.baby_elephant_clipart_29, 0));
        mascotaList.add(new Mascotas("Barry", R.drawable.tigre2, 0));
    }



}
