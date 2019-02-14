package io.pivotal.pal.tracker.repository;

import io.pivotal.pal.tracker.controllers.TimeEntryController;
import io.pivotal.pal.tracker.model.TimeEntry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.List;

import static java.util.Arrays.asList;

public class TimeEntryRepository {

    private final Logger log = LoggerFactory.getLogger(TimeEntryRepository.class);

    public TimeEntry find(long timeEntryId) {
        TimeEntry te =  new TimeEntry(timeEntryId, 123L, 456L, LocalDate.parse("2017-01-08"), 8);
        return te;
    }

    public List<TimeEntry> list() {
        List<TimeEntry> expected = asList(
                new TimeEntry(1L, 123L, 456L, LocalDate.parse("2017-01-08"), 8),
                new TimeEntry(2L, 789L, 321L, LocalDate.parse("2017-01-07"), 4)
        );

        return expected;
    }

    public TimeEntry create(TimeEntry any) {
        return any;
    }

    public TimeEntry update(long eq, TimeEntry any) {
        return any;
    }

    public void delete(long timeEntryId) {
        return;
    }

    public void deleteAll() {

    }
}
