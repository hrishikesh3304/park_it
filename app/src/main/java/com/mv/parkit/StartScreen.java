package com.mv.parkit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class StartScreen extends AppCompatActivity {

    CardView getStartedCardView;
    Intent myIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        getStartedCardView = findViewById(R.id.getStartedCardView);
        getStartedCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sh = getSharedPreferences("MySharedPref", Context.MODE_PRIVATE);
                long loggedIn = sh.getLong("LoggedIn", -1);
                if(loggedIn == -1){
                    myIntent = new Intent(StartScreen.this, LoginActivity.class);
                }
                else{
                    myIntent = new Intent(StartScreen.this, MainMapsActivity.class);
                    myIntent.putExtra("newLogin", false);
                }
                StartScreen.this.startActivity(myIntent);
                finish();
            }
        });
    }
}