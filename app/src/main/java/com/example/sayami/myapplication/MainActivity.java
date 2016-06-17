package com.example.sayami.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;



public class MainActivity extends AppCompatActivity implements TopFragment.TopSectionListener {


    @Override
    public void createMeme(String top, String bottom) {
        BottomFragment BotFrag = (BottomFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        BotFrag.SetMemeText(top ,bottom);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
