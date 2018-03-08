package com.example.hanna.lana_music_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
public class HoneymoonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Create the song list in ArrayList
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Honeymoon", "05:50"));
        songs.add(new Song("Music to Watch Boys To", "04:50"));
        songs.add(new Song("Terrence Loves You", "04:50"));
        songs.add(new Song("God Knows I Tried", "04:40"));
        songs.add(new Song("High By the Beach", "04:17"));
        songs.add(new Song("Freak", "04:55"));
        songs.add(new Song("Art Deco", "04:55"));
        songs.add(new Song("Burnt Norton (Interlude)", "01:21"));
        songs.add(new Song("Religion", "05:23"));
        songs.add(new Song("Salvatore", "04:41"));
        songs.add(new Song("The Blackest Day", "06:05"));
        songs.add(new Song("24", "04:55"));
        songs.add(new Song("Swan Song", "05:23"));
        songs.add(new Song("Don\'t Let Me Be Misunderstood", "03:01"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter= new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        //Set background color
        listView.setBackgroundResource(R.color.album3_color);
    }
}
