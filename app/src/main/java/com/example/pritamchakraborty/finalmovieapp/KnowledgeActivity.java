package com.example.pritamchakraborty.finalmovieapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class KnowledgeActivity extends AppCompatActivity {

    private ImageView data_gov;
    private ImageView nation_dig;
    private ImageView mhrd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowledge);

        data_gov = (ImageView)findViewById(R.id.umang);
        nation_dig = (ImageView)findViewById(R.id.bhim_upo);
        mhrd = (ImageView)findViewById(R.id.indian_post);

        data_gov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://data.gov.in"));
                startActivity(intent);
            }
        });

        nation_dig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://ndl.iitkgp.ac.in"));
                startActivity(intent);
            }
        });

        mhrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://mhrd.gov.in/digital-library"));
                startActivity(intent);
            }
        });
    }
}
