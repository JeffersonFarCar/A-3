package com.example.jeffersonfarfan.dream;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    ImageButton btn1, btn2, btn3, btn4, btn5, btn6;
    View vista;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        vista = inflater.inflate(R.layout.fragment_home, container, false);

        btn1 = (ImageButton)vista.findViewById(R.id.robot);
        btn2 = (ImageButton)vista.findViewById(R.id.sleep);
        btn3 = (ImageButton)vista.findViewById(R.id.suzy);
        btn4 = (ImageButton)vista.findViewById(R.id.lee);
        btn5 = (ImageButton)vista.findViewById(R.id.bts);
        btn6 = (ImageButton)vista.findViewById(R.id.shinee);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), robot.class);
                startActivityForResult(intent,0);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), sleep.class);
                startActivityForResult(intent,0);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Suzy.class);
                startActivityForResult(intent,0);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Lee.class);
                startActivityForResult(intent,0);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), BTS.class);
                startActivityForResult(intent,0);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Shinee.class);
                startActivityForResult(intent,0);
            }
        });

        return vista;
    }
}
