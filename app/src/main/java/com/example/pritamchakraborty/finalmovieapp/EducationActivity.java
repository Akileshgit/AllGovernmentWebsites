package com.example.pritamchakraborty.finalmovieapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class EducationActivity extends AppCompatActivity {

    private ImageView indian_navy;
    private ImageView swayam;
    private ImageView diksha;
    private ImageView studyinindia;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        indian_navy = (ImageView)findViewById(R.id.indian_navy);
        swayam = (ImageView)findViewById(R.id.swayam);
        diksha = (ImageView)findViewById(R.id.diksha);
        studyinindia = (ImageView)findViewById(R.id.studyinindia);

        indian_navy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://indiannavy.nic.in"));
                startActivity(intent);
            }
        });

        swayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://swayam.gov.in"));
                startActivity(intent);
            }
        });

        diksha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://diksha.gov.in"));
                startActivity(intent);
            }
        });

        studyinindia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://studyinindia/gov.in"));
                startActivity(intent);
            }
        });

    }
}
