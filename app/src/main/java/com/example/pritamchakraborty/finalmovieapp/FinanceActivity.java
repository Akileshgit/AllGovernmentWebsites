package com.example.pritamchakraborty.finalmovieapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class FinanceActivity extends AppCompatActivity {

    private ImageView umang;
    private ImageView bhim_upi;
    private ImageView indian_post;
    private ImageView income_tax;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finance);

        umang = (ImageView)findViewById(R.id.umang);
        bhim_upi = (ImageView)findViewById(R.id.bhim_upo);
        indian_post = (ImageView)findViewById(R.id.indian_post);
        income_tax = (ImageView)findViewById(R.id.income_tax);

        umang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://web.umang.gov.in/web/#/"));
                startActivity(intent);
            }
        });

        bhim_upi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://bhimupi.gov.in"));
                startActivity(intent);
            }
        });

        indian_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.indiapost.gov.in/VAS/Pages/IndiaPostHome.aspx?Device=desk"));
                startActivity(intent);
            }
        });

        income_tax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.incometaxindia.gov.in/pages/default.aspx"));
                startActivity(intent);
            }
        });


    }
}
