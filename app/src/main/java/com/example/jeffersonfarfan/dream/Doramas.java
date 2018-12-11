package com.example.jeffersonfarfan.dream;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Doramas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doramas);

        ImageButton btn = (ImageButton) findViewById(R.id.imnotarobot);
        ImageButton btn1 = (ImageButton) findViewById(R.id.whileyouaresleeping);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intet = new Intent(v.getContext(), robot.class);
                startActivityForResult(intet, 0);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), sleep.class);
                startActivityForResult(intent, 0);
            }
        });
    }
    public void onClick(View view){
        Intent miIntent=new Intent(Doramas.this,Index.class);
        startActivity(miIntent);
    }

}
