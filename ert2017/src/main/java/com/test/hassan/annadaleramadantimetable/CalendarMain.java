package com.test.hassan.annadaleramadantimetable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;

/**
 * Created by Hassan on 28-May-17.
 */

public class CalendarMain extends AppCompatActivity {

    Button ann;
    Button cen;
    Button iqra;
    Button blck;

    Button home_bttn;
    Button about_bttn;
    Button info_bttn;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.main_calendar_layout);

        ann = (Button)findViewById(R.id.ann_bttn);
        ann.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(CalendarMain.this,
                        Ramadan_Calendar.class);
                startActivity(myIntent);
            }
        });

        cen = (Button)findViewById(R.id.cen_bttn);
        cen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(CalendarMain.this,
                        Ramadan_Calendar_Cen.class);
                startActivity(myIntent);
            }
        });

        iqra = (Button)findViewById(R.id.iqra_bttn);
        iqra.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(CalendarMain.this,
                        Ramadan_Calendar_Iqra.class);
                startActivity(myIntent);
            }
        });

        blck = (Button)findViewById(R.id.blck_bttn);
        blck.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(CalendarMain.this,
                        Ramadan_Calendar_Blackhall.class);
                startActivity(myIntent);
            }
        });

        home_bttn = (Button) findViewById(R.id.home);
        home_bttn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(CalendarMain.this,
                        MainActivity.class);
                startActivity(myIntent);
            }
        });

        about_bttn = (Button) findViewById(R.id.about_us);
        about_bttn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(CalendarMain.this,
                        Masjids.class);
                startActivity(myIntent);
            }
        });

        info_bttn = (Button) findViewById(R.id.info);
        info_bttn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(CalendarMain.this,
                        Info.class);
                startActivity(myIntent);
            }
        });
    }
}
