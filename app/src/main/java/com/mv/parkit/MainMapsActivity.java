package com.mv.parkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainMapsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_maps);

        Bundle extras = getIntent().getExtras();
        Toast.makeText(this, "New Login : " + extras.getBoolean("newLogin", false), Toast.LENGTH_SHORT).show();
    }
}