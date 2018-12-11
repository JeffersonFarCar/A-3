package com.example.jeffersonfarfan.dream;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Cuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta);
    }
    public void onClick(View view){
        Intent miIntent=new Intent(Cuenta.this,Index.class);
        startActivity(miIntent);
    }
}
