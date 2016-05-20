package mx.fanygtz.mascotas.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import mx.fanygtz.mascotas.R;
import mx.fanygtz.mascotas.adapter.PerfilAdapter;
import mx.fanygtz.mascotas.poyo.Mascotas;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {
    ArrayList<Mascotas> mascotaList;// Información.
    RecyclerView rv;
    PerfilAdapter rAdapter;
    RecyclerView.LayoutManager lmanager;

    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);
        inicializarMascotas();
        rv = (RecyclerView) v.findViewById(R.id.rvPerfil);
        //rv.setHasFixedSize(true);
        lmanager = new GridLayoutManager(getActivity(),3);
        rv.setLayoutManager(lmanager);
        inicializaAdapter();
        return v;

    }
    private void inicializaAdapter(){
        rAdapter = new PerfilAdapter(mascotaList,getActivity());
        rv.setAdapter(rAdapter);
    }

    private void inicializarMascotas(){
        mascotaList = new ArrayList<>();
        mascotaList.add(new Mascotas("Barry", R.drawable.tigre2, 5));
        mascotaList.add(new Mascotas("Barry", R.drawable.tigre2, 8));
        mascotaList.add(new Mascotas("Barry", R.drawable.tigre2, 3));
        mascotaList.add(new Mascotas("Barry", R.drawable.tigre2, 9));
        mascotaList.add(new Mascotas("Barry", R.drawable.tigre2, 6));
        mascotaList.add(new Mascotas("Barry", R.drawable.tigre2, 2));
        mascotaList.add(new Mascotas("Barry", R.drawable.tigre2, 5));
        mascotaList.add(new Mascotas("Barry", R.drawable.tigre2, 3));
        mascotaList.add(new Mascotas("Barry", R.drawable.tigre2, 0));
        mascotaList.add(new Mascotas("Barry", R.drawable.tigre2, 1));

    }

}
