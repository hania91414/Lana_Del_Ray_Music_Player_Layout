package com.example.hanna.lana_music_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import java.util.ArrayList;

public class UltraviolenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Create the song list in ArrayList
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Cruel World", "06:39"));
        songs.add(new Song("Ultraviolence", "04:11"));
        songs.add(new Song("Shades of Cool", "05:42"));
        songs.add(new Song("Brooklyn Baby", "05:51"));
        songs.add(new Song("West Coast", "04:16"));
        songs.add(new Song("Sad Girl", "05:17"));
        songs.add(new Song("Pretty When You Cry", "03:54"));
        songs.add(new Song("Money Power Glory", "04:30"));
        songs.add(new Song("F****d My Way Up To the Top", "03:32"));
        songs.add(new Song("Old Money", "04:31"));
        songs.add(new Song("The Other Woman", "03:01"));
        ;

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
        listView.setBackgroundResource(R.color.album2_color);

    }
}
