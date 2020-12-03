package com.cybertek.services;

import com.cybertek.interfaces.ExtraSession;

public class Java implements Course {

    ExtraSession extraSession;

    public Java(ExtraSession extraSession) {
        this.extraSession = extraSession;
    }

    @Override
    public void getTeachingHours() {
          System.out.println("Weekly Teaching Hours: " + (20 + extraSession.getHours()));
    }
}
