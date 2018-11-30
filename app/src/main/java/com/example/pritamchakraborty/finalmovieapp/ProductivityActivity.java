package com.example.pritamchakraborty.finalmovieapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ProductivityActivity extends AppCompatActivity {

    private ImageView img_isro;
    private ImageView img_mini_tex;
    private ImageView img_dep_sci;
    private ImageView img_icar;
    private ImageView img_bef;
    private ImageView img_make_india;
    private ImageView img_ncbi;
    private ImageView img_know_india;
    private ImageView img_digitalIndia;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productivity);

        img_isro = (ImageView)findViewById(R.id.isro);
        img_mini_tex = (ImageView)findViewById(R.id.mini_text);
        img_dep_sci = (ImageView)findViewById(R.id.dep_of_sci);
        img_icar = (ImageView)findViewById(R.id.icar);
        img_bef = (ImageView)findViewById(R.id.brand_eq_found);
        img_make_india = (ImageView)findViewById(R.id.make_in_india);
        img_ncbi = (ImageView)findViewById(R.id.nation_bio_tech);
        img_know_india = (ImageView)findViewById(R.id.know_india);
        img_digitalIndia = (ImageView)findViewById(R.id.digital_india);


        img_isro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://isro.gov.in"));
                startActivity(intent);
            }
        });

        img_mini_tex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://texmin.nic.in"));
                startActivity(intent);
            }
        });

        img_dep_sci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://dst.gov.in"));
                startActivity(intent);
            }
        });

        img_icar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://lib.icar.gov.in"));
                startActivity(intent);
            }
        });

        img_bef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://ibef.gov"));
                startActivity(intent);
            }
        });

        img_make_india.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://makeindia.com/home"));
                startActivity(intent);
            }
        });

        img_ncbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://digilocker.gov.in"));
                startActivity(intent);
            }
        });

        img_know_india.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://knowindia.gov.in"));
                startActivity(intent);
            }
        });

        img_digitalIndia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://digitalindia.gov.in"));
                startActivity(intent);
            }
        });

    }
}
