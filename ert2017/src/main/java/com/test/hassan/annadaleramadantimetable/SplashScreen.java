package com.test.hassan.annadaleramadantimetable;

/**
 * Created by Hassan on 28-May-17.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by Hassan on 10-May-17.
 */

public class SplashScreen extends Activity {
    private static int splashInterval = 3500;


    TextView quote;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.activity_splash_screen);

        List<String> my_words = new LinkedList<String>();
        my_words.add("and he is with you wherever you are, Qur'an 57:4");
        my_words.add("Allah does not burden a soul beyond that it can bear [Qur'an 2:226]");
        my_words.add("Show forgiveness, enjoin kindness, avoid ignorance [Qur'an 7:199]");
        my_words.add("So verily, with the hardship, there is relief [Qur'an 94:5-6]");
        my_words.add("Be patient over what befalls you [Qur'an 31:17]");

        Random random = new Random(); //Create random class object
        int randomNumber = random.nextInt(my_words.size()); //Generate a random number (index) with the size of the list being the maximum

        quote = (TextView) findViewById(R.id.quote);
        quote.setText(my_words.get(randomNumber));
     //   System.out.println(my_words.get(randomNumber)); //Print out the random word

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                this.finish();
            }

            private void finish(){

            }
        }, splashInterval);
    }
}
