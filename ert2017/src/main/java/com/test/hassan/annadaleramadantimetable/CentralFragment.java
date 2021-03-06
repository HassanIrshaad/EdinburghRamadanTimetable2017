package com.test.hassan.annadaleramadantimetable;


import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class CentralFragment extends Fragment {

    TextView header;
    TextView sehri;
    TextView sunrise;
    TextView zuhr;
    TextView asr;
    TextView iftar;
    TextView isha;

    public CentralFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_annandale, container, false);
        header = (TextView) view.findViewById(R.id.header);
        sehri = (TextView) view.findViewById(R.id.fajr_time);
        sunrise = (TextView) view.findViewById(R.id.sunrise);
        zuhr = (TextView) view.findViewById(R.id.zuhr_time);
        asr = (TextView) view.findViewById(R.id.asr_time);
        iftar = (TextView) view.findViewById(R.id.magrhib_time);
        isha = (TextView) view.findViewById(R.id.isha_time);

        DatabaseOperations db = new DatabaseOperations(getActivity());
        db.clearDatabase("timetable");

        /*
        CRUD OPERATIONS
         */
        //Inserting rows
        Log.d("Insert: ", "Inserting ..");
        db.addRoza(new Ramadan(1, "SAT", "27 MAY", "03:28", "04:41", "13:10", "17:37", "21:40", "22:40"));
        db.addRoza(new Ramadan(2, "SUN", "28 MAY", "03:28", "04:40", "13:10", "17:37", "21:41", "22:40"));
        db.addRoza(new Ramadan(3, "MON", "29 MAY", "03:26", "04:38", "13:10", "17:38", "21:43", "22:42"));
        db.addRoza(new Ramadan(4, "TUE", "30 MAY", "03:26", "04:37", "13:10", "17:38", "21:44", "22:43"));
        db.addRoza(new Ramadan(5, "WED", "31 MAY", "03:25", "04:36", "13:10", "17:39", "21:46", "22:44"));
        db.addRoza(new Ramadan(6, "THUR", "01 JUNE", "03:24", "04:35", "13:11", "17:39", "21:47", "22:45"));
        db.addRoza(new Ramadan(7, "FRI", "02 JUNE", "03:24", "04:34", "13:11", "17:40", "21:48", "22:46"));
        db.addRoza(new Ramadan(8, "SAT", "03 JUNE", "03:23", "04:33", "13:11", "17:41", "21:50", "22:47"));
        db.addRoza(new Ramadan(9, "SUN", "04 JUNE", "03:23", "04:32", "13:11", "17:41", "21:51", "22:48"));
        db.addRoza(new Ramadan(10, "MON", "05 JUNE", "03:22", "04:31", "13:11", "17:42", "21:52", "22:49"));
        db.addRoza(new Ramadan(11, "TUE", "06 JUNE", "03:21", "04:30", "13:11", "17:42", "21:53", "22:49"));
        db.addRoza(new Ramadan(12, "WED", "07 JUNE", "03:21", "04:30", "13:12", "17:42", "21:54", "22:50"));
        db.addRoza(new Ramadan(13, "THUR", "08 JUNE", "03:21", "04:29", "13:12", "17:43", "21:55", "22:51"));
        db.addRoza(new Ramadan(14, "FRI", "09 JUNE", "03:20", "04:28", "13:12", "17:43", "21:56", "22:52"));
        db.addRoza(new Ramadan(15, "SAT", "10 JUNE", "03:20", "04:28", "13:12", "17:44", "21:57", "22:53"));
        db.addRoza(new Ramadan(16, "SUN", "11 JUNE", "03:20", "04:27", "13:12", "17:44", "21:58", "22:53"));
        db.addRoza(new Ramadan(17, "MON", "12 JUNE", "03:20", "04:27", "13:13", "17:45", "21:59", "22:54"));
        db.addRoza(new Ramadan(18, "TUE", "13 JUNE", "03:20", "04:27", "13:13", "17:45", "21:59", "22:54"));
        db.addRoza(new Ramadan(19, "WED", "14 JUNE", "03:19", "04:26", "13:13", "17:45", "22:00", "22:55"));
        db.addRoza(new Ramadan(20, "THUR", "15 JUNE", "03:19", "04:26", "13:13", "17:46", "22:01", "22:56"));
        db.addRoza(new Ramadan(21, "FRI", "16 JUNE", "03:19", "04:26", "13:13", "17:46", "22:01", "22:56"));
        db.addRoza(new Ramadan(22, "SAT", "17 JUNE", "03:20", "04:26", "13:14", "17:46", "22:02", "22:57"));
        db.addRoza(new Ramadan(23, "SUN", "18 JUNE", "03:20", "04:26", "13:14", "17:46", "22:02", "22:57"));
        db.addRoza(new Ramadan(24, "MON", "19 JUNE", "03:20", "04:26", "13:14", "17:47", "22:02", "22:57"));
        db.addRoza(new Ramadan(25, "TUE", "20 JUNE", "03:20", "04:26", "13:14", "17:47", "22:03", "22:57"));
        db.addRoza(new Ramadan(26, "WED", "21 JUNE", "03:20", "04:26", "13:15", "17:47", "22:03", "22:57"));
        db.addRoza(new Ramadan(27, "THUR", "22 JUNE", "03:21", "04:27", "13:15", "17:47", "22:03", "22:58"));
        db.addRoza(new Ramadan(28, "FRI", "23 JUNE", "03:21", "04:27", "13:15", "17:48", "22:03", "22:58"));
        db.addRoza(new Ramadan(29, "SAT", "24 JUNE", "03:21", "04:27", "13:15", "17:48", "22:03", "22:58"));
        db.addRoza(new Ramadan(30, "SUN", "25 JUNE", "03:21", "04:28", "13:15", "17:48", "22:03", "22:58"));

        //Reading all rozay
        Log.d("Reading", "Reading all rozay..");
        final List<Ramadan> ramadans = db.getAllRozay();

        //IF Current day and month match data in the database
        //If (CurrentDate.equals(r.date){
        //

        Cursor res = db.getData();
        if (res.getCount() == 0) {
            Log.d("Error:", "No result found");
            //      return;
        }
        StringBuffer buffer = new StringBuffer();
        while (res.moveToNext()) {
            buffer.append("Sehri: " + res.getString(3) + "\n" +
                    "Sunrise: " + res.getString(4) + "\n" +
                    "Zuhr: " + res.getString(5) + "\n" +
                    "Asr: " + res.getString(6) + "\n" +
                    "Iftar: " + res.getString(7) + "\n" +
                    "Isha: " + res.getString(8) + "\n");

            header.setText("Central - Ramadan " + res.getString(0) + ", " + res.getString(1) + " " + res.getString(2));
            sehri.setText(res.getString(3));
            sunrise.setText(res.getString(4));
            zuhr.setText(res.getString(5));
            asr.setText(res.getString(6));
            iftar.setText(res.getString(7));
            isha.setText(res.getString(8));
            //db.close();
        }



        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

        DatabaseOperations db = new DatabaseOperations(getActivity());

        Cursor res = db.getData();
        if (res.getCount() == 0) {
            Log.d("Error:", "No result found");
            return;
        }
        StringBuffer buffer = new StringBuffer();
        while (res.moveToNext()) {
            buffer.append("Sehri: " + res.getString(3) + "\n" +
                    "Sunrise: " + res.getString(4) + "\n" +
                    "Zuhr: " + res.getString(5) + "\n" +
                    "Asr: " + res.getString(6) + "\n" +
                    "Iftar: " + res.getString(7) + "\n" +
                    "Isha: " + res.getString(8) + "\n");

            header.setText("Central - Ramadan " + res.getString(0) + ", " + res.getString(1) + " " + res.getString(2));
            sehri.setText(res.getString(3));
            sunrise.setText(res.getString(4));
            zuhr.setText(res.getString(5));
            asr.setText(res.getString(6));
            iftar.setText(res.getString(7));
            isha.setText(res.getString(8));
        }
    }
}
