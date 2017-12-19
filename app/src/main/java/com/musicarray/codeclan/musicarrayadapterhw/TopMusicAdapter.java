package com.musicarray.codeclan.musicarrayadapterhw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 12/19/17.
 */

public class TopMusicAdapter extends ArrayAdapter<Music> {
    public TopMusicAdapter(Context context, ArrayList<Music> music) {
        super(context, 0, music);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.music_item, parent, false);
        }

        Music currentMusic = getItem(position);
        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentMusic.getRanking().toString());

        TextView band = (TextView) listItemView.findViewById(R.id.band);
        band.setText(currentMusic.getBandNameAlbum());

        TextView year = (TextView) listItemView.findViewById(R.id.year);
        year.setText(currentMusic.getYear().toString());

        listItemView.setTag(currentMusic);

        return listItemView;
    }

}
