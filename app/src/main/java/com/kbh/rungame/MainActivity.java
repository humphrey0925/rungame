package com.kbh.rungame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

public class MainActivity extends AppCompatActivity {
    public Button master,attender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        master=(Button)findViewById(R.id.master);
        attender=(Button)findViewById(R.id.attend);
        master.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Master_setroom();
            }
        });
    }
    public void Master_setroom() {
        Intent intent = new Intent();
        intent.setClass(this,Master_setroom.class);
        startActivity(intent);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync((OnMapReadyCallback) this);
    }

}

