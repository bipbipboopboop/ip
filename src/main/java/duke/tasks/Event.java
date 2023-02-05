package duke.tasks;

import java.time.LocalDate;
import duke.date.DukeDate;

public class Event extends Task {
    private static final long serialVersionUID = 7664438936982546960L;
    LocalDate from;
    LocalDate to;

    public Event(String description, String from, String to) {
        super(description);
        this.from = DukeDate.parseDateString(from);
        this.to = DukeDate.parseDateString(to);

    }

    @Override
    public String toString() {
        return String.format("[E]%s (from: %s to: %s)", super.toString(),
                DukeDate.convertDateToString(from), DukeDate.convertDateToString(to));
    }
}
