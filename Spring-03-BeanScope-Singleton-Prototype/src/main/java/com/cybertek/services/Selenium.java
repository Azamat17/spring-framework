package com.cybertek.services;

import com.cybertek.interfaces.Course;
import lombok.Data;

@Data
public class Selenium implements Course {

    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: 15");
    }
}
