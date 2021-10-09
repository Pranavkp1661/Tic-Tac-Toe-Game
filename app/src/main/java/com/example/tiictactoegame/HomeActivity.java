package com.example.tiictactoegame;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    Button btSinglePlayer;
    Button btMultiPlayer;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        context=this;
        btMultiPlayer=findViewById(R.id.btMultiPlayer);
        btSinglePlayer=findViewById(R.id.btSinglePlayer);
        btMultiPlayer.setOnClickListener(view -> {
            startActivity(new Intent(context,GameSingleActivity.class));
        });
        btSinglePlayer.setOnClickListener(view -> {
            startActivity(new Intent(context,GameTwoActivity.class));
        });
    }
}