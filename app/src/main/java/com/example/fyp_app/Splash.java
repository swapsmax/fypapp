package com.example.fyp_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {
    LauncherManager launcherManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        launcherManager = new LauncherManager(this);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                if (launcherManager.isFirstTime()){
                    launcherManager.setFirstLaunch(false);
                    startActivity(new Intent(getApplicationContext(),Slider.class));
                }
                else {
                    startActivity(new Intent(getApplicationContext(),RegisterActivity.class));
                }
            }
        }, 2000);
    }
}