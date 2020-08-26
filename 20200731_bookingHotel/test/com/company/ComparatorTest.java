package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

public class ComparatorTest {
    final Booking  b1=new Booking(
            new StandardRoom("1",2),
            new Person("Nick3"),
            new DateInterval(new MyDate(30,7,2020),
                    new MyDate(10,8,2020))
    );

    final Booking b2=new Booking(
            new SuiteRoom("2",2),
            new Person("Nick1"),
            new DateInterval(new MyDate(11,8,2020),
                    new MyDate(13,8,2020))
    );
    final Booking b3=new Booking(
            new SuiteRoom("2",2),
            new Person("Nick1"),
            new DateInterval(new MyDate(11,8,2020),
                    new MyDate(13,8,2020))
    );
    @Test
    public void  bookingComparatorByNameTest(){
        Comparator<Booking> comp = new BookingComparatorByName();
        int res= comp.compare(b1,b2);
        int res1=comp.compare(b2,b1);
        int res2=comp.compare(b2,b3);

        Assert.assertTrue((res>0)&&(res1<0)&&(res2==0));

        }

    @Test
    public void  bookingComparatorByDateStartTest(){
        Comparator<Booking> comp = new BookingComparatorByDateStart();
        int res= comp.compare(b1,b2);  // <0
        int res1=comp.compare(b2,b1);  // >0
        int res2=comp.compare(b2,b3);  // ==0
        Assert.assertTrue((res<0)&&(res1>0)&&(res2==0));
    }

}
