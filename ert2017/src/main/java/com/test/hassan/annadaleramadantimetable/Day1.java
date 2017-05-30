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

        Intent intent = getIntent();

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

        String param = intent.getExtras().getString("date");

        DatabaseOperations db = new DatabaseOperations(this);
        db.clearDatabase("timetable");

        Log.d("Insert: ", "Inserting ..");
        db.addRoza(new Ramadan(1, "SAT", "27 MAY", "02:15", "04:39", "13:10", "18:50", "21:41", "23:00"));
        db.addRoza(new Ramadan(2, "SUN", "28 MAY", "02:15", "04:37", "13:10", "18:51", "21:43", "23:00"));
        db.addRoza(new Ramadan(3, "MON", "29 MAY", "02:15", "04:36", "13:10", "18:51", "21:44", "23:00"));
        db.addRoza(new Ramadan(4, "TUE", "30 MAY", "02:15", "04:35", "13:10", "18:52", "21:46", "23:00"));
        db.addRoza(new Ramadan(5, "WED", "31 MAY", "02:15", "04:34", "13:10", "18:53", "21:47", "23:00"));
        db.addRoza(new Ramadan(6, "THUR", "01 JUNE", "02:15", "04:33", "13:10", "18:54", "21:49", "23:00"));
        db.addRoza(new Ramadan(7, "FRI", "02 JUNE", "02:15", "04:32", "13:10", "18:55", "21:50", "23:00"));
        db.addRoza(new Ramadan(8, "SAT", "03 JUNE", "02:15", "04:31", "13:10", "18:55", "21:51", "23:00"));
        db.addRoza(new Ramadan(9, "SUN", "04 JUNE", "02:15", "04:30", "13:10", "18:56", "21:52", "23:00"));
        db.addRoza(new Ramadan(10, "MON", "05 JUNE", "02:15", "04:29", "13:10", "18:57", "21:53", "23:00"));
        db.addRoza(new Ramadan(11, "TUE", "06 JUNE", "02:15", "04:28", "13:10", "18:57", "21:53", "23:00"));
        db.addRoza(new Ramadan(12, "WED", "07 JUNE", "02:15", "04:27", "13:10", "18:58", "21:54", "23:00"));
        db.addRoza(new Ramadan(13, "THUR", "08 JUNE", "02:15", "04:27", "13:10", "18:59", "21:56", "23:00"));
        db.addRoza(new Ramadan(14, "FRI", "09 JUNE", "02:15", "04:26", "13:10", "18:59", "21:57", "23:00"));
        db.addRoza(new Ramadan(15, "SAT", "10 JUNE", "02:15", "04:26", "13:10", "19:00", "21:58", "23:00"));
        db.addRoza(new Ramadan(16, "SUN", "11 JUNE", "02:15", "04:25", "13:10", "19:00", "21:59", "23:00"));
        db.addRoza(new Ramadan(17, "MON", "12 JUNE", "02:15", "04:25", "13:10", "19:01", "22:00", "23:00"));
        db.addRoza(new Ramadan(18, "TUE", "13 JUNE", "02:15", "04:24", "13:13", "19:01", "22:01", "23:00"));
        db.addRoza(new Ramadan(19, "WED", "14 JUNE", "02:15", "04:24", "13:13", "19:02", "22:01", "23:00"));
        db.addRoza(new Ramadan(20, "THUR", "15 JUNE", "02:15", "04:24", "13:13", "19:02", "22:02", "23:00"));
        db.addRoza(new Ramadan(21, "FRI", "16 JUNE", "02:15", "04:24", "13:13", "19:03", "22:03", "23:00"));
        db.addRoza(new Ramadan(22, "SAT", "17 JUNE", "02:15", "04:24", "13:13", "19:03", "22:03", "23:00"));
        db.addRoza(new Ramadan(23, "SUN", "18 JUNE", "02:15", "04:24", "13:13", "19:03", "22:04", "23:00"));
        db.addRoza(new Ramadan(24, "MON", "19 JUNE", "02:15", "04:24", "13:13", "19:04", "22:04", "23:00"));
        db.addRoza(new Ramadan(25, "TUE", "20 JUNE", "02:15", "04:24", "13:15", "19:04", "22:05", "23:00"));
        db.addRoza(new Ramadan(26, "WED", "21 JUNE", "02:15", "04:24", "13:15", "19:04", "22:05", "23:00"));
        db.addRoza(new Ramadan(27, "THUR", "22 JUNE", "02:15", "04:24", "13:15", "19:04", "22:05", "23:00"));
        db.addRoza(new Ramadan(28, "FRI", "23 JUNE", "02:15", "04:24", "13:15", "19:04", "22:05", "23:00"));
        db.addRoza(new Ramadan(29, "SAT", "24 JUNE", "02:15", "04:24", "13:15", "19:05", "22:05", "23:00"));
        db.addRoza(new Ramadan(30, "SUN", "25 JUNE", "02:15", "04:24", "13:15", "19:05", "22:05", "23:00"));

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

            header.setText("Annandale - Ramadan "+ res.getString(0)+", "+res.getString(1)+" "+res.getString(2));
            sehri.setText(res.getString(3));
            sunrise.setText(res.getString(4));
            zuhr.setText(res.getString(5));
            asr.setText(res.getString(6));
            iftar.setText(res.getString(7));
            isha.setText(res.getString(8));
            db.close();
        }

            home_bttn = (Button) findViewById(R.id.home);
            home_bttn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(Day1.this,
                            MainActivity.class);
                    startActivity(myIntent);
                }
            });

            calendar_bttn = (Button) findViewById(R.id.calendar);
            calendar_bttn.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(Day1.this,
                            CalendarMain.class);
                    startActivity(myIntent);
                }
            });

            about_bttn = (Button) findViewById(R.id.about_us);
            about_bttn.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(Day1.this,
                            Masjids.class);
                    startActivity(myIntent);
                }
            });

            info_bttn = (Button) findViewById(R.id.info);
            info_bttn.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(Day1.this,
                            Info.class);
                    startActivity(myIntent);
                }
            });
    }
}
