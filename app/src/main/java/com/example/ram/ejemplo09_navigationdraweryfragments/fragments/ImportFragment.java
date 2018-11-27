package com.example.ram.ejemplo09_navigationdraweryfragments.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.ram.ejemplo09_navigationdraweryfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImportFragment extends Fragment {

    private Context contexto;

    private ImageView imageView;

    private Button btnCharles, btnLobezno;

    public ImportFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_import, container, false);

        imageView = rootView.findViewById(R.id.ivImagen);
        btnCharles = rootView.findViewById(R.id.btnImagenCharles);
        btnLobezno = rootView.findViewById(R.id.btnImagenLobezno);

        btnLobezno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.wolverine);
            }
        });

        btnCharles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.charles);
            }
        });

        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        contexto = context;
    }
}
