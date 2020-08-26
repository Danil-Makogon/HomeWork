package com.company;

import java.util.Comparator;

public interface BookingList {
    void add(Booking booking);
    int size();
    void print();
    public Booking[] getSortedArray(Comparator<Booking> comparator);

    Booking getByIndex(int i);
    //Booking getBookingByIndex(int index);
    //Booking find(Booking booking);


}
