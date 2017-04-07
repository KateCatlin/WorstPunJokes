package com.example.katecatlin.worstpunjokes.objects;

import java.util.UUID;

/**
 * Created by katecatlin on 4/7/17.
 */

public class Joke {

    private UUID iD;
    private String title;

    public Joke() {
        iD = UUID.randomUUID();
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
}
