package com.example.pritamchakraborty.finalmovieapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private static final String TAG = MainActivity.class.getSimpleName();

    private ImageView img_identification;
    private ImageView img_productivity;
    private ImageView img_education;
    private ImageView img_agriculture;
    private ImageView img_energy;
    private ImageView img_social;
    private ImageView img_ministry;
    private ImageView img_communication;
    private ImageView img_buisness;
    private ImageView img_knowledge;
    private ImageView img_finance;
    private ImageView img_travel;
    private ImageView img_lifestyle;
    private ImageView img_news;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_identification = (ImageView)findViewById(R.id.identification);
        img_agriculture = (ImageView)findViewById(R.id.agriculture);
        img_productivity = (ImageView)findViewById(R.id.productivity);
        img_buisness = (ImageView)findViewById(R.id.buisness);
        img_communication = (ImageView)findViewById(R.id.communication);
        img_education = (ImageView)findViewById(R.id.education);
        img_finance = (ImageView)findViewById(R.id.finance);
        img_knowledge = (ImageView)findViewById(R.id.knowledge);
        img_lifestyle = (ImageView)findViewById(R.id.lifestyle);
        img_social = (ImageView)findViewById(R.id.social);
        img_ministry = (ImageView)findViewById(R.id.ministry);
        img_news = (ImageView)findViewById(R.id.news);
        img_travel = (ImageView)findViewById(R.id.travel);
        img_energy = (ImageView)findViewById(R.id.energy);

        img_identification.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(),
                        IdentificationActivity.class);
                startActivity(mainIntent);
            }
        });

        img_agriculture.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(),
                        AgricultureActivity.class);
                startActivity(mainIntent);
            }
        });

        img_productivity.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(),
                        ProductivityActivity.class);
                startActivity(mainIntent);
            }
        });

        img_buisness.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(),
                        BuisnessActivity.class);
                startActivity(mainIntent);
            }
        });

        img_communication.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(),
                        CommunicationActivity.class);
                startActivity(mainIntent);
            }
        });

        img_education.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(),
                        EducationActivity.class);
                startActivity(mainIntent);
            }
        });

        img_finance.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(),
                        FinanceActivity.class);
                startActivity(mainIntent);
            }
        });

        img_knowledge.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(),
                        KnowledgeActivity.class);
                startActivity(mainIntent);
            }
        });

        img_lifestyle.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(),
                        LifestyleActivity.class);
                startActivity(mainIntent);
            }
        });

        img_social.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(),
                        SocialActivity.class);
                startActivity(mainIntent);
            }
        });

        img_ministry.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(),
                        MinistryActivity.class);
                startActivity(mainIntent);
            }
        });

        img_news.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(),
                        NewsActivity.class);
                startActivity(mainIntent);
            }
        });

        img_travel.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(),
                        TravelActivity.class);
                startActivity(mainIntent);
            }
        });

        img_energy.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(),
                        EnergyActivity.class);
                startActivity(mainIntent);
            }
        });




    }
}