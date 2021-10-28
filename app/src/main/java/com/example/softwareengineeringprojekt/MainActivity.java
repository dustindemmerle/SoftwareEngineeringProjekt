package com.example.softwareengineeringprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton neuesZertifikat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        neuesZertifikat = (ImageButton) findViewById(R.id.informationButton);
        neuesZertifikat.setOnClickListener(v -> openInformation());

    }
    public void openInformation(){
        Intent intent = new Intent(this, information.class);
        startActivity(intent);
    }
}