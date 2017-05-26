package com.example.jayanth.cal_shedule;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Jayanth on 5/18/2017.
 */
public class shedule_dates extends Activity {

    TextView date1, date2, date3, date4, date5, date6, date7, date8, date9, date10, date11, date12, date13, date14, date15, date16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sh_dates);
        date1 = (TextView)findViewById(R.id.tv1_date);
        date2 = (TextView)findViewById(R.id.tv2_date);
        date3 = (TextView)findViewById(R.id.tv3_date);
        date4 = (TextView)findViewById(R.id.tv4_date);
        date5 = (TextView)findViewById(R.id.tv5_date);
        date6 = (TextView)findViewById(R.id.tv6_date);
        date7 = (TextView)findViewById(R.id.tv7_date);
        date8 = (TextView)findViewById(R.id.tv8_date);
        date9 = (TextView)findViewById(R.id.tv9_date);
        date10 = (TextView)findViewById(R.id.tv10_date);
        date11 = (TextView)findViewById(R.id.tv11_date);
        date12 = (TextView)findViewById(R.id.tv12_date);
        date13 = (TextView)findViewById(R.id.tv13_date);
        date14 = (TextView)findViewById(R.id.tv14_date);
        date15 = (TextView)findViewById(R.id.tv15_date);
        date16 = (TextView)findViewById(R.id.tv16_date);

        Bundle bl1 = getIntent().getExtras();
        int d = bl1.getInt("date");
        int m = bl1.getInt("month");
        int y = bl1.getInt("year");


        Calendar cal = Calendar.getInstance();
        cal.set(y, m, d);

        int date = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        String selDate = date + " " + month + " " + year;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date check = null;
        try {
            check = sdf.parse(selDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try
        {
            cal.setTime(sdf.parse(selDate));
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }

        cal.add(Calendar.DATE, 0);
        sdf = new SimpleDateFormat("dd-mm-yyyy");
        Date resultdate1 = new Date(cal.getTimeInMillis());
        String dateInString1 = sdf.format(resultdate1);
        date1.setText(dateInString1);
        /*date1.setText(date + "/" + month + "/" + year);*/

        cal.add(Calendar.DATE, 10);
        sdf = new SimpleDateFormat("dd-mm-yyyy");
        Date resultdate2 = new Date(cal.getTimeInMillis());
        String dateInString2 = sdf.format(resultdate2);
        date2.setText(dateInString2);

        cal.add(Calendar.DATE, 10);
        sdf = new SimpleDateFormat("dd-mm-yyyy");
        Date resultdate3 = new Date(cal.getTimeInMillis());
        String dateInString3 = sdf.format(resultdate3);
        date3.setText(dateInString3);

        cal.add(Calendar.DATE, 10);
        sdf = new SimpleDateFormat("dd-mm-yyyy");
        Date resultdate4 = new Date(cal.getTimeInMillis());
        String dateInString4 = sdf.format(resultdate4);
        date4.setText(dateInString4);

        cal.add(Calendar.DATE, 10);
        sdf = new SimpleDateFormat("dd-mm-yyyy");
        Date resultdate5 = new Date(cal.getTimeInMillis());
        String dateInString5 = sdf.format(resultdate5);
        date5.setText(dateInString5);

        cal.add(Calendar.DATE, 10);
        sdf = new SimpleDateFormat("dd-mm-yyyy");
        Date resultdate6 = new Date(cal.getTimeInMillis());
        String dateInString6 = sdf.format(resultdate6);
        date6.setText(dateInString6);

        cal.add(Calendar.DATE, 10);
        sdf = new SimpleDateFormat("dd-mm-yyyy");
        Date resultdate7 = new Date(cal.getTimeInMillis());
        String dateInString7 = sdf.format(resultdate7);
        date7.setText(dateInString7);

        cal.add(Calendar.DATE, 10);
        sdf = new SimpleDateFormat("dd-mm-yyyy");
        Date resultdate8 = new Date(cal.getTimeInMillis());
        String dateInString8 = sdf.format(resultdate8);
        date8.setText(dateInString8);

        cal.add(Calendar.DATE, 10);
        sdf = new SimpleDateFormat("dd-mm-yyyy");
        Date resultdate9 = new Date(cal.getTimeInMillis());
        String dateInString9 = sdf.format(resultdate9);
        date9.setText(dateInString9);

        cal.add(Calendar.DATE, 10);
        sdf = new SimpleDateFormat("dd-mm-yyyy");
        Date resultdate10 = new Date(cal.getTimeInMillis());
        String dateInString10 = sdf.format(resultdate10);
        date10.setText(dateInString10);

        cal.add(Calendar.DATE, 10);
        sdf = new SimpleDateFormat("dd-mm-yyyy");
        Date resultdate11 = new Date(cal.getTimeInMillis());
        String dateInString11 = sdf.format(resultdate11);
        date11.setText(dateInString11);

        cal.add(Calendar.DATE, 10);
        sdf = new SimpleDateFormat("dd-mm-yyyy");
        Date resultdate12 = new Date(cal.getTimeInMillis());
        String dateInString12 = sdf.format(resultdate12);
        date12.setText(dateInString10);

        cal.add(Calendar.DATE, 10);
        sdf = new SimpleDateFormat("dd-mm-yyyy");
        Date resultdate13 = new Date(cal.getTimeInMillis());
        String dateInString13 = sdf.format(resultdate13);
        date13.setText(dateInString13);

        cal.add(Calendar.DATE, 10);
        sdf = new SimpleDateFormat("dd-mm-yyyy");
        Date resultdate14 = new Date(cal.getTimeInMillis());
        String dateInString14 = sdf.format(resultdate14);
        date14.setText(dateInString14);

        cal.add(Calendar.DATE, 10);
        sdf = new SimpleDateFormat("dd-mm-yyyy");
        Date resultdate15 = new Date(cal.getTimeInMillis());
        String dateInString15 = sdf.format(resultdate15);
        date15.setText(dateInString15);

        cal.add(Calendar.DATE, 10);
        sdf = new SimpleDateFormat("dd-mm-yyyy");
        Date resultdate16 = new Date(cal.getTimeInMillis());
        String dateInString16 = sdf.format(resultdate16);
        date16.setText(dateInString16);
    }
}
