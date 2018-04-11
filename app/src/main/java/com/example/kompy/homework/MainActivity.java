package com.example.kompy.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton macalistairRitchieImage, timBernersLeeImage, edsgerDijkstraImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUI();

        this.macalistairRitchieImage.setOnClickListener(this);
        this.timBernersLeeImage.setOnClickListener(this);
        this.edsgerDijkstraImage.setOnClickListener(this);
    }

    private void setupUI(){


        this.macalistairRitchieImage = (ImageButton) findViewById(R.id.macalistairRitchieImage);
        timBernersLeeImage = (ImageButton) findViewById(R.id.timBernersLeeImage);
        edsgerDijkstraImage = (ImageButton) findViewById(R.id.edsgerDijkstraImage);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case(R.id.macalistairRitchieImage):

                        Toast.makeText(getApplicationContext(), getString(R.string.dennis_ritchies_brainy_Quote), Toast.LENGTH_LONG).show();

             break;
            case (R.id.timBernersLeeImage) :

                        Toast.makeText(getApplicationContext(),getString(R.string.tim_berners_brainy_quote),Toast.LENGTH_LONG).show();

             break;
            case (R.id.edsgerDijkstraImage):

                        Toast.makeText(getApplicationContext(),getString(R.string.edsger_dijkstra_brainy_quote),Toast.LENGTH_LONG).show();

             break;
        };
    }



}

