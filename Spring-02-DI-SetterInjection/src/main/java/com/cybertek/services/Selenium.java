package com.cybertek.services;

import com.cybertek.interfaces.Course;
import lombok.Data;

@Data
public class Selenium implements Course {

    private OfficeHours officeHours;

    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: " + (15 + officeHours.getHours()));
    }
}
