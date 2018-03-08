package com.example.hanna.lana_music_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.ListView;

import java.util.ArrayList;

public class BornToDieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);


        //Create the song list in ArrayList
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Born to Die", "04:46"));
        songs.add(new Song("Off to the Races", "04:59"));
        songs.add(new Song("Blue Jeans", "03:29"));
        songs.add(new Song("Video Games", "04:41"));
        songs.add(new Song("Diet Mountain Dew", "03:42"));
        songs.add(new Song("National Anthem", "03:50"));
        songs.add(new Song("Dark Paradise", "04:03"));
        songs.add(new Song("Radio", "03:34"));
        songs.add(new Song("Carmen", "04:08"));
        songs.add(new Song("Million Dollar Man", "03:50"));
        songs.add(new Song("Summertime Sadness", "04:24"));
        songs.add(new Song("This Is What Makes Us Girls", "04:00"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        //Set background color
        listView.setBackgroundResource(R.color.album1_color);
    }
}