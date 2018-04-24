package com.example.a16022578.sgholidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter<String> aa;
    ArrayList<String> holidayOption;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) this.findViewById(R.id.lvHolidayType);

        //Create a few holiday object in holiday array
        holidayOption = new ArrayList<String>();
        holidayOption.add("Secular");
        holidayOption.add("Ethnic & Religion");

         aa = new ArrayAdapter(this, android.R.layout.simple_list_item_1, holidayOption);
        lv.setAdapter(aa);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String title = holidayOption.get(position);

                Intent intent = new Intent(MainActivity.this,NextActivity.class);
                intent.putExtra("Title",title);
                startActivity(intent);
            }
        });


    }
}
