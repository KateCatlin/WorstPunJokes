package com.example.katecatlin.worstpunjokes.objects;

import java.util.Date;
import java.util.UUID;

/**
 * Created by katecatlin on 4/7/17.
 */

public class Joke {

    private UUID iD;
    private String title;
    private Date date;
    private boolean laughed;

    public Joke() {
        iD = UUID.randomUUID();
        date = new Date();
    }

    public UUID getiD() {
        return iD;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isLaughed() {
        return laughed;
    }
    public void setLaughed(boolean laughed) {
        this.laughed = laughed;
    }
}
