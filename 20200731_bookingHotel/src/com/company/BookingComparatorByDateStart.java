package com.company;

import java.util.Comparator;

public class BookingComparatorByDateStart implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        return o1.getDateInterval().getStart()
                .compareTo(o2.getDateInterval().getStart());
    }
}
