package com.example.jeffersonfarfan.dream;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import java.security.KeyPair;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoriasFragment extends Fragment {

    ImageButton btn1, btn2, btn3, btn4, btn5, btn6;

    View vista;

    public CategoriasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_categorias, container, false);

        btn4 = (ImageButton) vista.findViewById(R.id.celebridad2);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Lee.class);
                startActivityForResult(intent, 0);
            }
        });
        btn6 = (ImageButton)vista.findViewById(R.id.kpop2);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Shinee.class);
                startActivityForResult(intent, 0);
            }
        });

        btn1 = (ImageButton)vista.findViewById(R.id.doramas1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), robot.class);
                startActivityForResult(intent, 0);
            }
        });
        btn2 = (ImageButton)vista.findViewById(R.id.doramas2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), sleep.class);
                startActivityForResult(intent, 0);
            }
        });
        btn3 = (ImageButton)vista.findViewById(R.id.celebridad1);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Suzy.class);
                startActivityForResult(intent, 0);
            }
        });

        return vista;
    }

}
