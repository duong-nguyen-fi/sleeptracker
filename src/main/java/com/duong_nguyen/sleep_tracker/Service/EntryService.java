package com.duong_nguyen.sleep_tracker.Service;

import com.duong_nguyen.sleep_tracker.Repository.*;
import com.duong_nguyen.sleep_tracker.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntryService {
    @Autowired
    EntryRepository EntryRepository;

    public List<Entry> findAll() {
        return EntryRepository.findAll();
    }

    public Optional<Entry> findById(long EntryId){
        return EntryRepository.findById(EntryId);
    }

    public Entry addEntry(Entry Entry){
         return EntryRepository.save(Entry);
    }

    public Entry findEntryById(long id){
        return EntryRepository.getReferenceById(id);
    }
}
