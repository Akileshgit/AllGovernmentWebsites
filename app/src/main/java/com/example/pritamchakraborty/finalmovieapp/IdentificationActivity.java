package com.example.pritamchakraborty.finalmovieapp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class IdentificationActivity extends AppCompatActivity {

    private ImageView img_aadhar;
    private ImageView img_min_aff;
    private ImageView img_indane;
    private ImageView img_ecourts;
    private ImageView img_e_gov;
    private ImageView img_digi_locker;
    private ImageView img_passport;
    private ImageView img_digi_sevak;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identification);

        img_aadhar = (ImageView)findViewById(R.id.aadhar);
        img_min_aff = (ImageView)findViewById(R.id.mini_aff);
        img_indane = (ImageView)findViewById(R.id.indane);
        img_ecourts = (ImageView)findViewById(R.id.ecourt);
        img_e_gov = (ImageView)findViewById(R.id.e_gov);
        img_digi_locker = (ImageView)findViewById(R.id.digilocker);
        img_passport = (ImageView)findViewById(R.id.passport);
        img_digi_sevak = (ImageView)findViewById(R.id.digisevak);

        img_aadhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://uidai.gov.in"));
                startActivity(intent);
            }
        });

        img_min_aff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://mea.gov.in"));
                startActivity(intent);
            }
        });

        img_indane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://indane.co.in"));
                startActivity(intent);
            }
        });

        img_ecourts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://ecourts.gov.in/ecourts_home"));
                startActivity(intent);
            }
        });

        img_e_gov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://apps.nic.in"));
                startActivity(intent);
            }
        });

        img_e_gov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://apps.nic.in"));
                startActivity(intent);
            }
        });

        img_digi_locker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://digilocker.gov.in"));
                startActivity(intent);
            }
        });

        img_passport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://portal2.passportindia.gov.in/"));
                startActivity(intent);
            }
        });

        img_digi_sevak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://digisevak.gov.in/"));
                startActivity(intent);
            }
        });
    }
}
