package com.example.pritamchakraborty.finalmovieapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class EnergyActivity extends AppCompatActivity {

    private ImageView dep_atomic;
    private ImageView mini_power;
    private ImageView mini_coal;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy);

        dep_atomic = (ImageView)findViewById(R.id.dep_of_atomic);
        mini_power = (ImageView)findViewById(R.id.mini_power);
        mini_coal = (ImageView)findViewById(R.id.mini_coal);

        dep_atomic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://dae.nic.in"));
                startActivity(intent);
            }
        });

        mini_power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://powermin.gov.in"));
                startActivity(intent);
            }
        });

        mini_coal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://coal.nic.in"));
                startActivity(intent);
            }
        });


    }
}
