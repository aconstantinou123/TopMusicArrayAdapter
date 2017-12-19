package com.musicarray.codeclan.musicarrayadapterhw;

import java.io.Serializable;

/**
 * Created by user on 12/19/17.
 */

public class Music implements Serializable {

    private Integer ranking;
    private String bandNameAlbum;
    private Integer year;

    public Music(Integer ranking, String bandNameAlbum, Integer year) {
        this.ranking = ranking;
        this.bandNameAlbum = bandNameAlbum;
        this.year = year;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getBandNameAlbum() {
        return bandNameAlbum;
    }

    public Integer getYear() {
        return year;
    }

}
