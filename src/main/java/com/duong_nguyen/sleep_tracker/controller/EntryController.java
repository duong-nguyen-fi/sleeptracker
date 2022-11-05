package com.duong_nguyen.sleep_tracker.controller;


import com.duong_nguyen.sleep_tracker.Entity.ErrorResponse;
import com.duong_nguyen.sleep_tracker.Entity.Entry;
import com.duong_nguyen.sleep_tracker.Service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController()
public class EntryController {
    @Autowired
    EntryService EntryService;

    @GetMapping(path = "/Entry")
    public Entry findEntryById(@RequestParam(name = "id", required = true) long EntryId ){
        Optional<Entry> Entry = EntryService.findByEntryId(EntryId);
        if(Entry == null){
            throw new ErrorResponse( "Error: Entry_id="+EntryId +" not found ");
        }
        return Entry.get();
    }

    @PostMapping(path = "/Entries"
            //,consumes = {"application/x-www-form-urlencoded;charset=UTF-8", "application/json;charset=UTF-8"}
            //,consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.APPLICATION_JSON_VALUE}
            //,produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}
            )
    public Entry addEntry(@RequestBody Entry Entry){
            //System.out.println(Entry);

        return EntryService.addEntry(Entry);
    }

    @GetMapping(path = "/Entries")
    public List<Entry> findAllEntries(){
        return EntryService.findAll();
    }
}