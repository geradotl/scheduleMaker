package com.Hammak;

import java.util.ArrayList;

public class Semester {
    private boolean empty;
    private ArrayList<Week> weeks;

    public Semester(ArrayList<Week> weeks) {
        this.weeks = weeks;
        this.empty = emptinessCheck();
    }

    private boolean emptinessCheck() {
        for (Week week : weeks) {
            if (!week.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public Week getWeek(int weekNumber) {
        return weeks.get(weekNumber);
    }

    public boolean isEmpty() {
        return empty;
    }

    public ArrayList<Week> getWeeks() {
        return weeks;
    }

    public int weeksAmount() {
        return weeks.size();
    }
}
