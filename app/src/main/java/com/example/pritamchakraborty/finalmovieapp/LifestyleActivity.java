package com.example.pritamchakraborty.finalmovieapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class LifestyleActivity extends AppCompatActivity {

    private ImageView nation_health;
    private ImageView mini_youth;
    private ImageView dep_water;
    private ImageView niftem;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifestyle);

        nation_health = (ImageView)findViewById(R.id.umang);
        mini_youth = (ImageView)findViewById(R.id.bhim_upo);
        dep_water = (ImageView)findViewById(R.id.indian_post);
        niftem = (ImageView)findViewById(R.id.income_tax);

        nation_health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://nhp.gov.in"));
                startActivity(intent);
            }
        });

        mini_youth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://yas.nic.in"));
                startActivity(intent);
            }
        });

        dep_water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https:/mowr.gov.in"));
                startActivity(intent);
            }
        });

        niftem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://mofpi.nic.in"));
                startActivity(intent);
            }
        });



    }
}
