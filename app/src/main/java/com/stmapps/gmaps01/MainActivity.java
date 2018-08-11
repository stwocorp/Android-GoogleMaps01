package com.stmapps.gmaps01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPlaces, btnMaps, btnNow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlaces = (Button) findViewById(R.id.btnPlaces);
        btnMaps = (Button) findViewById(R.id.btnMaps);
        btnNow = (Button) findViewById(R.id.btnNow);

        btnPlaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MapsActivity1.class);
                startActivity(intent);
            }
        });

    }
}
