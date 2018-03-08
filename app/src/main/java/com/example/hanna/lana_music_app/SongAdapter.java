package com.example.hanna.lana_music_app;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hanna on 05.03.2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    private static final String LOG_TAG = SongAdapter.class.getSimpleName();

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link AndroidFlavor} object located at this position in the list
        Song currentSong = getItem(position);


        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songNameTextView = listItemView.findViewById(R.id.song_title);
        // Get the version name from the current Song object and
        // set this text on the name TextView
        songNameTextView.setText(currentSong.getmSongName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView songTimeTextView = listItemView.findViewById(R.id.song_time);
        // Get the version number from the current Song object and
        // set this text on the number TextView
        songTimeTextView.setText(currentSong.getmSongTime());

        return listItemView;
    }


}


