package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSession;
import lombok.Data;

@Data
public class Selenium implements Course {

    private ExtraSession extraSession;

    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: " + (15 + extraSession.getHours()));
    }
}
