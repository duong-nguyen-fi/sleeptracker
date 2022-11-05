package com.duong_nguyen.sleep_tracker.Entity;

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
    private long id;
}

