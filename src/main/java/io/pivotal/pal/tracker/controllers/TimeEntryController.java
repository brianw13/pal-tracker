package io.pivotal.pal.tracker.controllers;

import io.pivotal.pal.tracker.model.TimeEntry;
import io.pivotal.pal.tracker.repository.TimeEntryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@RestController
public class TimeEntryController {

    private final Logger log = LoggerFactory.getLogger(TimeEntryController.class);

    public TimeEntryController(TimeEntryRepository repo) { super();}

    public ResponseEntity create(TimeEntry timeEntry) {
        log.debug("timeEntry: " + timeEntry.toString());

        return new ResponseEntity(HttpStatus.OK);
    }

    public ResponseEntity<TimeEntry> read(long timeEntryId ) {
        log.debug("timeEntryId: " + timeEntryId);
        TimeEntry te = new TimeEntry(1L, 123L, 456L, LocalDate.parse("2017-01-08"), 8);

        if ( timeEntryId == 1L )
            return new ResponseEntity<TimeEntry>(te, HttpStatus.OK);
        else
            return new ResponseEntity<TimeEntry>(te, HttpStatus.NOT_FOUND);

    }

    public ResponseEntity update(long timeEntryId, TimeEntry timeEntry) {
        return new ResponseEntity(HttpStatus.OK);
    }

    public ResponseEntity<List<TimeEntry>> list() {
        TimeEntryRepository ter = new TimeEntryRepository();
        List l = ter.list();
        return new ResponseEntity<List<TimeEntry>>(l, HttpStatus.OK);
    }


    public ResponseEntity<TimeEntry> delete(long timeEntryId) {
        TimeEntry te = new TimeEntry(1L, 123L, 456L, LocalDate.parse("2017-01-08"), 8);
        return new ResponseEntity<TimeEntry>(te, HttpStatus.OK);
    }

    @GetMapping("/time-entries")
    public ResponseEntity<List<TimeEntry>> getList() {
        log.debug("getList()");
        TimeEntryRepository ter = new TimeEntryRepository();
        List l = ter.list();

        return new ResponseEntity<List<TimeEntry>>(Collections.emptyList(), HttpStatus.OK);
    }

    @GetMapping("/time-entries/{id}")
    public ResponseEntity<TimeEntry> getEntry() {
        log.debug("getList()");
        TimeEntry te = new TimeEntry(1L, 456L, 123L, LocalDate.parse("2017-10-31"), 8);
        return new ResponseEntity<TimeEntry>(te, HttpStatus.OK);

        //return new ResponseEntity<List<TimeEntry>>(Collections.emptyList(), HttpStatus.OK);
    }

    @PostMapping(path = "/time-entries", consumes = "application/json", produces = "application/json")
    public ResponseEntity createTimeEntity(TimeEntry timeEntry) {
        log.debug("createTimeEntity() timeEntry: " + timeEntry.toString());

        TimeEntry te = new TimeEntry(1L, 456L, 123L, LocalDate.parse("2017-10-31"), 8);
        return new ResponseEntity<TimeEntry>(te, HttpStatus.OK);
    }


}
