package com.example.a16022578.sgholidays;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NextActivity extends AppCompatActivity {

    TextView tvCategory;
    ListView holidayList;
    Button btnBack;

    ArrayAdapter aa;
    ArrayList<Holidays> holidays;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnBack =(Button)findViewById(R.id.btnBack);
        holidayList = (ListView)findViewById(R.id.holidayDetails);
        tvCategory =(TextView)findViewById(R.id.tvHolidayTitle);
        //create new Array List to store data
        holidays = new ArrayList<Holidays>();

        Intent i = getIntent();
        String holidayInfo = i.getStringExtra("holiday");
        tvCategory.setText(holidayInfo );

        if (holidayInfo.equalsIgnoreCase("Secular")) {
            holidays.add(new Holidays("New Year's Day","1 January 2018"));
            holidays.add(new Holidays("Good Friday","30 March 2018"));
            holidays.add(new Holidays("Labour Day","1 May 2018"));
            holidays.add(new Holidays("National Day","9 August 2018"));

        }
        else if (holidayInfo.equalsIgnoreCase("Ethnics and Religion")){
            holidays.add(new Holidays("Chinese New Year", "16-17 February 2018"));
            holidays.add(new Holidays("Vesak day", "29 May 2018"));
            holidays.add(new Holidays("Hari Raya Puasa", "15 June 2018"));
            holidays.add(new Holidays("Hari Raya Haji", "22 August 2018"));
            holidays.add(new Holidays("Deepavali", "6 November 2018"));
            holidays.add(new Holidays("Christmas Day", "25 December 2018"));
        }

        aa = new HolidayAdapter(this, R.layout.row,holidays);
        holidayList.setAdapter(aa);

        holidayList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holidays selectedHoliday = holidays.get(position);
                Toast.makeText(NextActivity.this, selectedHoliday.getHolidayTitle()
                                + " Date: " + selectedHoliday.getHolidayDate(),
                        Toast.LENGTH_LONG).show();
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
