package com.example.jeffersonfarfan.dream;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

    View vista;
    Button btn1, btn2, btn3, btn4, btn5, btn6;

    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_perfil, container, false);

        btn1 = (Button)vista.findViewById(R.id.premium);
        btn2 = (Button)vista.findViewById(R.id.traducir);
        btn3 = (Button)vista.findViewById(R.id.tendencias);
        btn4 = (Button)vista.findViewById(R.id.usuarios);
        btn5 = (Button)vista.findViewById(R.id.traducciones);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Premium.class);
                startActivityForResult(intent, 0);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Formulario_Traduccion.class);
                startActivityForResult(intent, 0);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Tendencias.class);
                startActivityForResult(intent,0);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Usuarios.class);
                startActivityForResult(intent, 0);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Traduccion_Index.class);
                startActivityForResult(intent, 0);
            }
        });

        return vista;
    }

}
