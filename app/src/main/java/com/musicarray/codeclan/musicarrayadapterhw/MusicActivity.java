package com.musicarray.codeclan.musicarrayadapterhw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MusicActivity extends AppCompatActivity {

    TextView bandInfo;
    TextView albumInfo;
    TextView description;

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
        description = findViewById(R.id.description);
        description.setText(music.getDescription());
        description.setMovementMethod(new ScrollingMovementMethod());
        Log.d("Band Name", music.getBandNameAlbum());

    }

}
