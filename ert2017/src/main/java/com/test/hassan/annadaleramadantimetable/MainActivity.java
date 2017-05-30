package com.test.hassan.annadaleramadantimetable;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {


    Button home_bttn;
    Button calendar_bttn;
    Button about_bttn;
    Button info_bttn;

    TextView header;
    TextView sehri;
    TextView sunrise;
    TextView zuhr;
    TextView asr;
    TextView iftar;
    TextView isha;

    TextView test;

    String annandale = "annadale";
    String central = "central";

    private AdView mAdView;

    LayoutInflater inflater;
    ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        vp = (ViewPager) findViewById(R.id.viewPager);
        SwipeAdapter swipeAdapter = new SwipeAdapter(getSupportFragmentManager());
        vp.setAdapter(swipeAdapter);

//        Context context = getApplicationContext();
//        CharSequence text = "- Swipe to see times for other mosques -";
//        int duration = Toast.LENGTH_LONG;
//
//        Toast toast = Toast.makeText(context, text, duration);
//        toast.show();

        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                // show toast 2.
                Context context = getApplicationContext();
                CharSequence text = "- Swipe to see times for other mosques -";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        }, 3000);

        calendar_bttn = (Button)findViewById(R.id.calendar);
        calendar_bttn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        CalendarMain.class);
                startActivity(myIntent);
            }
        });

        about_bttn = (Button) findViewById(R.id.about_us);
        about_bttn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        Masjids.class);
                startActivity(myIntent);
            }
        });

        info_bttn = (Button) findViewById(R.id.info);
        info_bttn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        Info.class);
                startActivity(myIntent);
            }
        });


        // Bundle extras = getIntent().getExtras();


    }


    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Exit")
                .setMessage("Are you sure?")
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        finish();
                    }
                }).setNegativeButton("no", null).show();
    }
}
