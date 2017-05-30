package com.test.hassan.annadaleramadantimetable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by Hassan on 23-May-17.
 */

public class Masjids extends AppCompatActivity {

    Button home_bttn;
    Button calendar_bttn;
    Button info_bttn;

    TextView msq1;
    TextView msq2;
    TextView msq3;
    TextView msq4;
    TextView msq5;
    TextView msq6;
    TextView msq7;

    private AdView mAdView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.about_layout);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        msq1 = (TextView) findViewById(R.id.mosque1);
        msq1.setMovementMethod(LinkMovementMethod.getInstance());

        msq2 = (TextView) findViewById(R.id.mosque2);
        msq2.setMovementMethod(LinkMovementMethod.getInstance());

        msq3 = (TextView) findViewById(R.id.mosque3);
        msq3.setMovementMethod(LinkMovementMethod.getInstance());

        msq4 = (TextView) findViewById(R.id.mosque4);
        msq4.setMovementMethod(LinkMovementMethod.getInstance());

        msq5 = (TextView) findViewById(R.id.mosque5);
        msq5.setMovementMethod(LinkMovementMethod.getInstance());

        msq6 = (TextView) findViewById(R.id.mosque6);
        msq6.setMovementMethod(LinkMovementMethod.getInstance());

        msq7 = (TextView) findViewById(R.id.mosque7);
        msq7.setMovementMethod(LinkMovementMethod.getInstance());

        home_bttn = (Button)findViewById(R.id.home);
        home_bttn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Masjids.this,
                        MainActivity.class);
                startActivity(myIntent);
            }
        });

        calendar_bttn = (Button)findViewById(R.id.calendar);
        calendar_bttn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Masjids.this,
                        CalendarMain.class);
                startActivity(myIntent);
            }
        });

        info_bttn = (Button)findViewById(R.id.info);
        info_bttn .setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Masjids.this,
                        Info.class);
                startActivity(myIntent);
            }
        });
    }
}
