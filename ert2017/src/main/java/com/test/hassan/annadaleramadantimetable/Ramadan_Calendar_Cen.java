package com.test.hassan.annadaleramadantimetable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by Hassan on 28-May-17.
 */

public class Ramadan_Calendar_Cen extends AppCompatActivity {

    Button home_bttn;
    //Button calendar_bttn;
    Button about_bttn;
    Button info_bttn;

    Button day1;
    Button day2;
    Button day3;
    Button day4;
    Button day5;
    Button day6;
    Button day7;
    Button day8;
    Button day9;
    Button day10;
    Button day11;
    Button day12;
    Button day13;
    Button day14;
    Button day15;
    Button day16;
    Button day17;
    Button day18;
    Button day19;
    Button day20;
    Button day21;
    Button day22;
    Button day23;
    Button day24;
    Button day25;
    Button day26;
    Button day27;
    Button day28;
    Button day29;
    Button day30;
    Button day31;

    TextView header;
    TextView sehri;
    TextView sunrise;
    TextView zuhr;
    TextView asr;
    TextView iftar;
    TextView isha;
    TextView cal_title;

    LayoutInflater inflater;
    ViewPager vp;

    private AdView mAdView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.calendar_layout);

        cal_title = (TextView)  findViewById(R.id.cal_title);
        cal_title.setText("Central Ramadan Calendar 2017");


        // Intent intent = getIntent();
        // String mosque = intent.getStringExtra("mosque");

//        Bundle extras = getIntent().getExtras();
//        if (extras != null) {
//            String result = extras.getString("annandale");
//            System.out.println("yeah"+result);
//        }


        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        day1 = (Button) findViewById(R.id.day_1);
        day2 = (Button) findViewById(R.id.day_2);
        day3 = (Button) findViewById(R.id.day_3);
        day4 = (Button) findViewById(R.id.day_4);
        day5 = (Button) findViewById(R.id.day_5);
        day6 = (Button) findViewById(R.id.day_6);
        day7 = (Button) findViewById(R.id.day_7);
        day8 = (Button) findViewById(R.id.day_8);
        day9 = (Button) findViewById(R.id.day_9);
        day10 = (Button) findViewById(R.id.day_10);
        day11 = (Button) findViewById(R.id.day_11);
        day12 = (Button) findViewById(R.id.day_12);
        day13 = (Button) findViewById(R.id.day_13);
        day14 = (Button) findViewById(R.id.day_14);
        day15 = (Button) findViewById(R.id.day_15);
        day16 = (Button) findViewById(R.id.day_16);
        day17 = (Button) findViewById(R.id.day_17);
        day18 = (Button) findViewById(R.id.day_18);
        day19 = (Button) findViewById(R.id.day_19);
        day20 = (Button) findViewById(R.id.day_20);
        day21 = (Button) findViewById(R.id.day_21);
        day22 = (Button) findViewById(R.id.day_22);
        day23 = (Button) findViewById(R.id.day_23);
        day24 = (Button) findViewById(R.id.day_24);
        day25 = (Button) findViewById(R.id.day_25);
        day26 = (Button) findViewById(R.id.day_26);
        day27 = (Button) findViewById(R.id.day_27);
        day28 = (Button) findViewById(R.id.day_28);
        day29 = (Button) findViewById(R.id.day_29);
        day30 = (Button) findViewById(R.id.day_30);

        //   if(mosque.equalsIgnoreCase("annandale")) {
        day1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "27 MAY"); //Your id
                b.putString("mosque", "annandale");
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "28 MAY"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "29 MAY"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "30 MAY"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "31 MAY"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "01 JUNE"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "02 JUNE"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "03 JUNE"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "04 JUNE"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "05 JUNE"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "06 JUNE"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "07 JUNE"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "08 JUNE"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "09 JUNE"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "10 JUNE"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "11 JUNE"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "12 JUNE"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "13 JUNE"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "14 JUNE"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "15 JUNE"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "16 JUNE"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "17 JUNE"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "18 JUNE"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "19 JUNE"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });

        day25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Day1_Central.class);
                Bundle b = new Bundle();
                b.putString("date", "20 JUNE"); //Your id
                myIntent.putExtras(b); //Put your id to your next Intent
                startActivity(myIntent);
            }
        });


        home_bttn = (Button) findViewById(R.id.home);
        home_bttn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        MainActivity.class);
                startActivity(myIntent);
            }
        });

        about_bttn = (Button) findViewById(R.id.about_us);
        about_bttn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Masjids.class);
                startActivity(myIntent);
            }
        });

        info_bttn = (Button) findViewById(R.id.info);
        info_bttn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Ramadan_Calendar_Cen.this,
                        Info.class);

                startActivity(myIntent);
            }
        });
        // }
    }
}
