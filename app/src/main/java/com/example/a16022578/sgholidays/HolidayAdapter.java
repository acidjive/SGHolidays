package com.example.a16022578.sgholidays;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holidays> {

    private ArrayList<Holidays> holidays;
    private Context context;
    private TextView textViewHoliday;
    private TextView holidayTitle;
    private TextView tvDate;
    private ImageView ivHolidayIcon;

    public HolidayAdapter(Context context, int resource, ArrayList<Holidays> objects) {
        super(context, resource, objects);
        holidays = objects;
        this.context = context;

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        holidayTitle = (TextView) rowView.findViewById(R.id.tvHolidayTitle);
        tvDate = (TextView) rowView.findViewById(R.id.tvDate);
        holidayTitle = (TextView) rowView.findViewById(R.id.textViewHoliday);
        ivHolidayIcon = (ImageView) rowView.findViewById(R.id.holidayIcon);

        //selected  Holiday
        Holidays selectedHoliday = holidays.get(position);
        holidayTitle.setText(selectedHoliday.getHolidayTitle());

        //icons
        if (selectedHoliday.getHolidayTitle() == "New Year's Day") {
            ivHolidayIcon.setImageResource(R.drawable.newyear);
        } else if (selectedHoliday.getHolidayTitle() == "Chinese New Year") {
            ivHolidayIcon.setImageResource(R.drawable.cny);
        } else if (selectedHoliday.getHolidayTitle() == "Good Friday") {
            ivHolidayIcon.setImageResource(R.drawable.gfriday);
        } else if (selectedHoliday.getHolidayTitle() == "Labour Day") {
            ivHolidayIcon.setImageResource(R.drawable.cny);
        } else if (selectedHoliday.getHolidayTitle() == "Vesak Day") {
            ivHolidayIcon.setImageResource(R.drawable.vesak);
        } else if (selectedHoliday.getHolidayTitle() == "Hari Raya Puasa") {
            ivHolidayIcon.setImageResource(R.drawable.puasa);
        } else if (selectedHoliday.getHolidayTitle() == "National Day") {
            ivHolidayIcon.setImageResource(R.drawable.ndp);
        } else if (selectedHoliday.getHolidayTitle() == "Hari Raya Haji") {
            ivHolidayIcon.setImageResource(R.drawable.haji);
        } else if (selectedHoliday.getHolidayTitle() == "Deepavali") {
            ivHolidayIcon.setImageResource(R.drawable.deepavali);
        } else if (selectedHoliday.getHolidayTitle() == "Christmas") {
            ivHolidayIcon.setImageResource(R.drawable.christ);
        }
        tvDate.setText(selectedHoliday.getHolidayDate());
        return rowView;

    }


            }


