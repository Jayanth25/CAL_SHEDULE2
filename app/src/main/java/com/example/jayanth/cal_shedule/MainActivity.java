package com.example.jayanth.cal_shedule;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CalendarView;

public class MainActivity extends AppCompatActivity {

    CalendarView cv;
    String selDate;

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cv = (CalendarView)findViewById(R.id.d1);

        cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth)
            {
                Intent intent = new Intent(MainActivity.this,shedule_dates.class);
                Bundle bl = new Bundle();
                bl.putInt("date",dayOfMonth);
                bl.putInt("month",month+1);
                bl.putInt("year",year);
                intent.putExtras(bl);
                startActivity(intent);
            }
        });
    }
}
