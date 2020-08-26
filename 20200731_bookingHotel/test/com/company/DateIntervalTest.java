package com.company;

import org.junit.Assert;
import org.junit.Test;

public class DateIntervalTest {

    @Test
    public void dateFinishShouldBeAfterStart(){
        MyDate d1= new MyDate(30,8,2020);
        MyDate d2= new MyDate(10,8,2020);
       DateInterval dateInterval= new DateInterval(d1,d2);
       boolean res = dateInterval.getStart().equals(d2)&&
                     dateInterval.getFinish().equals(d1);

        Assert.assertTrue(res);
    }
    @Test
    public void dateFinishShouldBeAfterStart2(){
        MyDate d2= new MyDate(30,8,2020);
        MyDate d1= new MyDate(10,8,2020);
        DateInterval dateInterval= new DateInterval(d1,d2);
        boolean res = dateInterval.getStart().equals(d1)&&
                dateInterval.getFinish().equals(d2);

        Assert.assertTrue(res);
    }

    @Test
    public void isIntersectTrueTest1(){
        MyDate start1= new MyDate(10,8,2020);
        MyDate finish1= new MyDate(30,8,2020);
        DateInterval dateInterval1= new DateInterval(start1,finish1);
        MyDate start2= new MyDate(15,8,2020);
        MyDate finish2= new MyDate(15,9,2020);
        DateInterval dateInterval2= new DateInterval(start2,finish2);
        Assert.assertTrue(DateInterval.isIntersect(
                dateInterval1,
                dateInterval2
        ));
    }

    @Test
    public void isIntersectTrueTest2(){
        MyDate start1= new MyDate(10,8,2020);
        MyDate finish1= new MyDate(30,8,2020);
        DateInterval dateInterval1= new DateInterval(start1,finish1);
        MyDate start2= new MyDate(15,8,2020);
        MyDate finish2= new MyDate(15,9,2020);
        DateInterval dateInterval2= new DateInterval(start2,finish2);
        Assert.assertTrue(DateInterval.isIntersect(
                dateInterval2,
                dateInterval1
        ));
    }

    @Test
    public void isIntersectFalseTest1(){
        MyDate start1= new MyDate(10,8,2020);
        MyDate finish1= new MyDate(30,8,2020);
        DateInterval dateInterval1= new DateInterval(start1,finish1);
        MyDate start2= new MyDate(15,9,2020);
        MyDate finish2= new MyDate(20,9,2020);
        DateInterval dateInterval2= new DateInterval(start2,finish2);
        Assert.assertFalse(DateInterval.isIntersect(
                dateInterval1,
                dateInterval2
        ));
    }

    @Test
    public void isIntersectFalseTest2(){
        MyDate start1= new MyDate(10,8,2020);
        MyDate finish1= new MyDate(30,8,2020);
        DateInterval dateInterval1= new DateInterval(start1,finish1);
        MyDate start2= new MyDate(15,9,2020);
        MyDate finish2= new MyDate(20,9,2020);
        DateInterval dateInterval2= new DateInterval(start2,finish2);
        Assert.assertFalse(DateInterval.isIntersect(
                dateInterval1,
                dateInterval2
        ));
    }
}
