package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSession;
import lombok.Data;

//@Getter
//@Setter
@Data
public class Java implements Course {

    private ExtraSession extraSession;
/*
    public ExtraSession getExtraSession() {
        return extraSession;
    }

    public void setExtraSession(ExtraSession extraSession) {
        this.extraSession = extraSession;
    }

 */

    public void getTeachingHours() {
          System.out.println("Weekly Teaching Hours: " + (20 + extraSession.getHours()));
    }
}
