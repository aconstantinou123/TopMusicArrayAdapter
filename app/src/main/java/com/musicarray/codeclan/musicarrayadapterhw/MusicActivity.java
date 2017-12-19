package com.musicarray.codeclan.musicarrayadapterhw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MusicActivity extends AppCompatActivity {

    TextView bandInfo;
    TextView albumInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_view);
        Intent intent = getIntent();
        Music music = (Music) intent.getSerializableExtra("music");
        bandInfo = findViewById(R.id.information);
        bandInfo.setText(music.getBandNameAlbum());
        albumInfo = findViewById(R.id.album_year);
        albumInfo.setText(music.getYear().toString());
        Log.d("Band Name", music.getBandNameAlbum());

    }

}
