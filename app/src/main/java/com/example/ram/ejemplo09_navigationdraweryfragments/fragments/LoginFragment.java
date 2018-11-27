package com.example.ram.ejemplo09_navigationdraweryfragments.fragments;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ram.ejemplo09_navigationdraweryfragments.MainActivity;
import com.example.ram.ejemplo09_navigationdraweryfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {
private EditText editTextUser, editTextPassword;
private Button btnLogin;
private Context contexto2;
    public LoginFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_import, container, false);
        // Inflate the layout for this fragment
         inflater.inflate(R.layout.fragment_login, container, false);
        editTextUser = rootView.findViewById(R.id.etUser);
        editTextPassword = rootView.findViewById(R.id.etPassword);
        btnLogin = rootView.findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextUser.equals("progresa@progresa.com") && editTextPassword.equals("progresa")){

                }else{
                    Toast.makeText(getActivity(), "Usuario incorrecto, vuelva a intentar", Toast.LENGTH_SHORT).show();
                }
            }
        });

    return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        contexto2 = context;
    }


}
