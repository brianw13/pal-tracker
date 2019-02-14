package io.pivotal.pal.tracker;

import io.pivotal.pal.tracker.model.TimeEntry;
import io.pivotal.pal.tracker.repository.TimeEntryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.List;

import static java.util.Arrays.asList;

public class InMemoryTimeEntryRepository extends TimeEntryRepository {

    private TimeEntry timeEntry;

    public TimeEntry create(TimeEntry timeEntry) {
        this.timeEntry = timeEntry;
        this.timeEntry.setId(1L);
        return this.timeEntry;
    }

    public TimeEntry find(long id) {
        TimeEntry te = new TimeEntry(id, 123L, 456L, LocalDate.parse("2017-01-08"), 8);
        return this.timeEntry;
    }

    public List<TimeEntry> list() {

        List<TimeEntry> expected = asList(
                new TimeEntry(1L, 123L, 456L, LocalDate.parse("2017-01-08"), 8),
                new TimeEntry(2L, 789L, 321L, LocalDate.parse("2017-01-07"), 4)
        );

        return expected;
    }

    public TimeEntry update(long timeEntryId, TimeEntry timeEntry) {
        return timeEntry;
    }

    public void delete(long id) {
        return;
    }
}
