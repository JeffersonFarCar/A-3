package com.example.jeffersonfarfan.dream;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Celebridades extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celebridades);
        ImageButton btn1, btn2;
        Button btn3, btn4;


        btn2 = (ImageButton) findViewById(R.id.suzy1);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Suzy .class);
                startActivityForResult(intent,0);
            }
        });
    }
}
