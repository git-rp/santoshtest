package com.test.date;

import org.joda.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

        System.out.println(getLocalCurrentDate());
    }

    private static String getLocalCurrentDate() {

        LocalDate date = new LocalDate();
        return date.toString();

    }
}
