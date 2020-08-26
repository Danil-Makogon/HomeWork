package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BookingListHandler implements BookingList{

    private List<Booking> bookingList = new ArrayList<>();

    @Override
    public void add(Booking booking) {
        if (booking!=null){
            bookingList.add(booking);
        }
    }

    @Override
    public int size() {
        return bookingList.size();
    }

    @Override
    public void print() {
        System.out.println(bookingList);
    }

    @Override
    public Booking[] getSortedArray(Comparator<Booking> comparator) {
        Booking[] res = (Booking[]) Arrays.copyOf(bookingList.toArray(),bookingList.toArray().length);
        Arrays.sort(res,comparator);
        return res;
    }

    @Override
    public Booking getByIndex(int i) {
        return bookingList.get(i);
    }
}
