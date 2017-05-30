package com.test.hassan.annadaleramadantimetable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import org.w3c.dom.Text;

/**
 * Created by Hassan on 25-May-17.
 */

public class Info extends AppCompatActivity {

    Button home_bttn;
    Button calendar_bttn;
    Button about_bttn;
    Button info_bttn;

    private AdView mAdView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.info_layout);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        home_bttn = (Button)findViewById(R.id.home);
        home_bttn .setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Info.this,
                        MainActivity.class);
                startActivity(myIntent);
            }
        });

        calendar_bttn = (Button)findViewById(R.id.calendar);
        calendar_bttn .setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Info.this,
                        CalendarMain.class);
                startActivity(myIntent);
            }
        });

        about_bttn = (Button)findViewById(R.id.about_us);
        about_bttn .setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Info.this,
                        Masjids.class);
                startActivity(myIntent);
            }
        });

        info_bttn = (Button)findViewById(R.id.info);
        info_bttn .setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Info.this,
                        Info.class);
                startActivity(myIntent);
            }
        });

        TextView txt1;
        TextView txt2;
        TextView txt3;
        TextView txt4;
        TextView txt5;
        TextView txt6;

        txt4 = (TextView) findViewById(R.id.header_for_duas);
        txt4.setText(Html.fromHtml("<b>Duas during Ramadan:</b><br>"));

        txt6 = (TextView) findViewById(R.id.header_for_credits);
        txt6.setText(Html.fromHtml("<b>Credits:</b><br>"));

        txt1 = (TextView) findViewById(R.id.help);
        txt1.setText(Html.fromHtml("<b>Dua for Sehri:</b><br><br>" +
                "وَبِصَوْمِ غَدٍ نَوَيْتُ مِنْ شَهْرِ رَمَضَانَ"+
                "<br><br>Wa bi-sawmi ghadin nawaytu min shahri ramadan<br><br>"+
                "I intend to keep the fast for tomorrow in the month of Ramadan<br><br>"+
                "<b>Dua for Iftar:</b><br><br>" +
                "اللَّهُمَّ اِنِّى لَكَ صُمْتُ وَبِكَ امنْتُ وَ عَلى رِزْقِكَ اَفْطَرْتُ " +
        "<br><br> Allahumma inni laka sumtu wa bika aamantu wa 'ala rizq-ika aftarthu <br><br> " +
                "(O Allah! For You I have observed fasting and with Your provisions do I break my fasting)" +
                "<br>"));

        txt3 = (TextView) findViewById(R.id.credits);
        txt3.setText(Html.fromHtml("<br>App created by Hassan Irshaad<br>App icon created by Zain Irshaad<br><br> All information for prayer times and dates provided by " +
                "Jamia Masjid Anware-e-Medina & Portobello Islamic and Education Centre."));

    }
}
