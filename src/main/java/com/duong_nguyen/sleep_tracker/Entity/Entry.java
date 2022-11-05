package com.duong_nguyen.sleep_tracker.Entity;

import java.time.Duration;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="entry")
public class Entry {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id", unique = true)
    private long id;

    @Column(name="startTime", nullable = false, updatable = true)
    private Date startDate;
    @Column(name="endTime", nullable = false, updatable = true)
    private Date endDate;



    //Duration duration;

    public Entry(Date start, Date end)
    {
        this.startDate = start;
        this.endDate = end;
        //duration = Duration.between(start.localDateTime, end.localDateTime);
    }

    public Entry()
    {

    }
/* 
    public String getStartTime(){
        return this.startTime;
    }

    public String getEndTime(){
        return this.endTime;
    }
*/
}

