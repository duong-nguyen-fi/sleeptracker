package com.duong_nguyen.sleep_tracker.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duong_nguyen.sleep_tracker.Entity.Entry;

@Repository
public interface EntryRepository  extends JpaRepository<Entry, Long> {

    Entry findById(long entryId);
}
