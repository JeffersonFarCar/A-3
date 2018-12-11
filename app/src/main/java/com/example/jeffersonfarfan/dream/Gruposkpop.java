package com.example.jeffersonfarfan.dream;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Gruposkpop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gruposkpop);

        ImageButton btn = (ImageButton) findViewById(R.id.shinee1);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Shinee.class);
                startActivityForResult(intent, 0);
            }
        });


        ImageButton btn2= (ImageButton)findViewById(R.id.bts1);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),BTS.class);
                startActivityForResult(intent, 0);
            }
        });
        Button btn3 = (Button)findViewById(R.id.bts2);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), BTS.class);
                startActivityForResult(intent,0);
            }
        });
    }
}
