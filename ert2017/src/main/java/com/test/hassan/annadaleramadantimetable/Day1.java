package com.test.hassan.annadaleramadantimetable;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by Hassan on 23-May-17.
 */

public class Day1 extends AppCompatActivity {

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

    private AdView mAdView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.day_1_layout);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        header = (TextView) findViewById(R.id.header1);
        sehri = (TextView) findViewById(R.id.fajr_time1);
        sunrise = (TextView) findViewById(R.id.sunrise1);
        zuhr = (TextView) findViewById(R.id.zuhr_time1);
        asr = (TextView) findViewById(R.id.asr_time1);
        iftar = (TextView) findViewById(R.id.magrhib_time1);
        isha = (TextView) findViewById(R.id.isha_time1);

        Intent intent = getIntent();
        String param = intent.getExtras().getString("date");

        DatabaseOperations db = new DatabaseOperations(this);
      //  db.clearDatabase("timetable");

        Cursor res = db.getDay(param);
        if(res.getCount() == 0){
            Log.d("Error:", "No result found");
            return;
        }
        StringBuffer buffer = new StringBuffer();
        while(res.moveToNext()){
            buffer.append("Sehri: "+res.getString(3)+"\n"+
                     "Sunrise: "+res.getString(4)+"\n"+
                    "Zuhr: "+res.getString(5)+"\n"+
                    "Asr: "+res.getString(6)+"\n"+
                    "Iftar: "+res.getString(7)+"\n"+
                    "Isha: "+res.getString(8)+"\n");

            //String value= res.getString(res.getColumnIndex("ID"));

            header.setText("Ramadan "+ res.getString(0)+", "+res.getString(1)+" "+res.getString(2));
            sehri.setText(res.getString(3));
            sunrise.setText(res.getString(4));
            zuhr.setText(res.getString(5));
            asr.setText(res.getString(6));
            iftar.setText(res.getString(7));
            isha.setText(res.getString(8));
            db.close();
        }

        home_bttn = (Button)findViewById(R.id.home);
        home_bttn .setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Day1.this,
                        MainActivity.class);
                startActivity(myIntent);
            }
        });

        calendar_bttn = (Button)findViewById(R.id.calendar);
        calendar_bttn .setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Day1.this,
                        Ramadan_Calendar.class);
                startActivity(myIntent);
            }
        });

        about_bttn = (Button)findViewById(R.id.about_us);
        about_bttn .setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Day1.this,
                        Masjids.class);
                startActivity(myIntent);
            }
        });

        info_bttn = (Button)findViewById(R.id.info);
        info_bttn .setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Day1.this,
                        Info.class);
                startActivity(myIntent);
            }
        });

    }



}
