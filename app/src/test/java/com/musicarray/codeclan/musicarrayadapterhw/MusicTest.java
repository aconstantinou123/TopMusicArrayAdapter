package com.musicarray.codeclan.musicarrayadapterhw;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 12/19/17.
 */

public class MusicTest {

    Music music;
    TopMusic topMusic;

    @Before
    public void before(){
        music = new Music(1, "Emperor - In the Nightside Eclipse", 1994, description);
        topMusic = new TopMusic();
    }


    @Test
    public void canGetBand(){
        assertEquals("Emperor - In the Nightside Eclipse", music.getBandNameAlbum());
    }

    @Test
    public void canGetArray(){
        assertNotNull(topMusic.getMusic());
    }
}
