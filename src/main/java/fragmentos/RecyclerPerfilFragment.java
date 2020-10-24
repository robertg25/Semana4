package com.example.petagramtabs.fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.petagramtabs.MascotasPerfil;
import com.example.petagramtabs.R;
import com.example.petagramtabs.adapter.AdapterMascotasPerfil;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RecyclerPerfilFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RecyclerPerfilFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    ArrayList<MascotasPerfil> listMascota;

    RecyclerView recyclerMascotas;
    public RecyclerPerfilFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RecyclerdosFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RecyclerPerfilFragment newInstance(String param1, String param2) {
        RecyclerPerfilFragment fragment = new RecyclerPerfilFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v  = inflater.inflate(R.layout.fragment_recycler_perfil, container, false);

        listMascota = new ArrayList<>();
        recyclerMascotas = (RecyclerView)  v.findViewById(R.id.recyclerid2);
        recyclerMascotas.setLayoutManager(new GridLayoutManager(getContext(), 3));

        llenarpersonajes();

        AdapterMascotasPerfil adapter = new AdapterMascotasPerfil(listMascota);
        recyclerMascotas.setAdapter(adapter);


        return v;
    }
    private void llenarpersonajes() {
        listMascota.add(new MascotasPerfil("5",R.drawable.img1));
        listMascota.add(new MascotasPerfil("0",R.drawable.img1));
        listMascota.add(new MascotasPerfil("3",R.drawable.img1));
        listMascota.add(new MascotasPerfil("10",R.drawable.img1));
        listMascota.add(new MascotasPerfil("2",R.drawable.img1));
        listMascota.add(new MascotasPerfil("3",R.drawable.img1));
        listMascota.add(new MascotasPerfil("1",R.drawable.img1));
        listMascota.add(new MascotasPerfil("7",R.drawable.img1));
        listMascota.add(new MascotasPerfil("4",R.drawable.img1));
        listMascota.add(new MascotasPerfil("8",R.drawable.img1));
        listMascota.add(new MascotasPerfil("6",R.drawable.img1));
        listMascota.add(new MascotasPerfil("1",R.drawable.img1));
    }
}