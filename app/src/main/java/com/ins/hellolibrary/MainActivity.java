package com.ins.hellolibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ins.helloworld.HelloworldAct;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HelloworldAct.publishLOG();
    }
}
