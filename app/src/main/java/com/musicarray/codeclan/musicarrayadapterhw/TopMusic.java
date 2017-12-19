package com.musicarray.codeclan.musicarrayadapterhw;

import java.util.ArrayList;

/**
 * Created by user on 12/19/17.
 */

public class TopMusic {

    private ArrayList<Music> music;

    TopMusic(){
        this.music = new ArrayList<Music>();

        music.add(new Music(1, "Emperor - In the Nightside Eclipse", 1994));
        music.add(new Music(2, "Mayhem - De Mysteriis Dom Sathanas", 1994));
        music.add(new Music(3, "Deathspell Omega - Kenose", 2005));
        music.add(new Music(4, "Blut Aus Nord - The Work Which Transforms God", 2005));
        music.add(new Music(5, "Svartidaudi - Flesh Cathedral", 2012));
        music.add(new Music(6, "Akercocke - Choronzon", 2003));
        music.add(new Music(7, "Opeth - Blackwater Park", 2002));
        music.add(new Music(8, "Emperor - Anthems to the Welkin at Dusk", 1997));
        music.add(new Music(9, "Darkthrone - A Blaze in the Northern Sky", 1991));
        music.add(new Music(10, "Bathory - Blood, Fire, Death", 1988));
        music.add(new Music(11, "Boris - Flood", 2004));
        music.add(new Music(12, "Sunn 0)) - White 2", 2004));
        music.add(new Music(13, "Cult of Luna - Salvation", 2004));
        music.add(new Music(14, "Enslaved - Ruun", 2006));
        music.add(new Music(14, "Leviathan - Massive Conspiracey Against All Life", 2008));
    }

    public ArrayList<Music> getMusic() {
        return new ArrayList<Music>(music);
    }
}
