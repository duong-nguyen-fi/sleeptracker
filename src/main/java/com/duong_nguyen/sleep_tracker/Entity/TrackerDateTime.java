package com.duong_nguyen.sleep_tracker.Entity;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class TrackerDateTime {
    private LocalDateTime localDateTime;
    public Timestamp timestamp;
    public int day,month, year, hour, minute, second;
    static DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

    TrackerDateTime(int year, int month, int day, int hour, int minute, int second ){
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour  = hour;
        this.minute = minute;
        this.second = second;
        this.localDateTime = LocalDateTime.of(year,day,month,hour,minute,second);
        // Inbuilt format

        // Custom format if needed
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    }
    public String toString(){
        return this.localDateTime.format(formatter);
    }

    public static int getHour(TrackerDateTime start, TrackerDateTime end){
        return (int)Duration.between(start.localDateTime, end.localDateTime).getSeconds()%3600%24;
    }

    public static int getSeconds(TrackerDateTime start, TrackerDateTime end){
        return (int)Duration.between(start.localDateTime, end.localDateTime).getSeconds()%60;
    }

    public static int getMinutes(TrackerDateTime start, TrackerDateTime end){
        return (int)Duration.between(start.localDateTime, end.localDateTime).getSeconds()%3600;
    }
}
