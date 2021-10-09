package com.example.tiictactoegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class SplashScreenActivity extends AppCompatActivity {
    private static final Integer HANDLER_TIME = 3000;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=this;
        setContentView(R.layout.activity_splash_screen);
                new Handler(Looper.getMainLooper()).postDelayed(() -> {
            finish();
            startActivity(new Intent(context, HomeActivity.class));
        }, HANDLER_TIME);

}
}