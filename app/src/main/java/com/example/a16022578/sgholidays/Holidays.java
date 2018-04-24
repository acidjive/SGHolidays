package com.example.a16022578.sgholidays;

public class Holidays {
    private String holidayTitle;
    private String holidayDate;

    public Holidays(String holidayTitle, String holidayDate){
        this.holidayTitle = holidayTitle;
        this.holidayDate = holidayDate;

    }

    public String getHolidayTitle() {
        return holidayTitle;
    }

    public String getHolidayDate() {
        return holidayDate;
    }
}
