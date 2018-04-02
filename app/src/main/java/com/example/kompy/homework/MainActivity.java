package com.example.kompy.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton DennisRitchieImageButton= (ImageButton)findViewById(R.id.MacalistairRitchieImage);
        ImageButton TimBernersLeeImageButton= (ImageButton)findViewById(R.id.TimBernersLeeImage);
        ImageButton EdsgerDijkstraImageButton= (ImageButton)findViewById(R.id.EdsgerDijkstraImage);

        DennisRitchieImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Toast.makeText(getApplicationContext(),getString(R.string.dennis_ritchies_brainy_Quote),Toast.LENGTH_LONG).show();
            }
        });

        TimBernersLeeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),getString(R.string.tim_berners_brainy_quote),Toast.LENGTH_LONG).show();
            }
        });

        EdsgerDijkstraImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),getString(R.string.edsger_dijkstra_brainy_quote),Toast.LENGTH_LONG).show();
            }
        });

    }


}
