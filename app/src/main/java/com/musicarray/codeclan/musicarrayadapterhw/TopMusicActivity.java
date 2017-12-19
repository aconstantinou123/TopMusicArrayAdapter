package com.musicarray.codeclan.musicarrayadapterhw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        TopMusic topMusic = new TopMusic();
        ArrayList<Music> list = topMusic.getMusic();

        TopMusicAdapter musicAdapter = new TopMusicAdapter(this, list);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(musicAdapter);

    }

    public void getMusic(View listItem){
        Music music = (Music) listItem.getTag();
        Log.d("Band Name:", music.getBandNameAlbum());
        Intent intent = new Intent(this, MusicActivity.class);
        intent.putExtra("music", music);
        startActivity(intent);

    }
}
