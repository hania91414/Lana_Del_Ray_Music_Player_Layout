package com.example.hanna.lana_music_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class LustForLifeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Create the song list in ArrayList
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Love", "04:32"));
        songs.add(new Song("Lust for Life (feat. The Weeknd)", "04:24"));
        songs.add(new Song("13 Beaches", "04:55"));
        songs.add(new Song("Cherry", "03:00"));
        songs.add(new Song("White Mustang", "02:44"));
        songs.add(new Song("Summer Bummer (feat. A$AP Rocky, Playboi Carti)", "04:20"));
        songs.add(new Song("Groupie Love (feat. A$AP Rocky)", "04:24"));
        songs.add(new Song("In My Feelings", "03:58"));
        songs.add(new Song("Coachella - Woodstock In My Mind", "04:18"));
        songs.add(new Song("God Bless America - And All the Beautiful Women In It", "04:36"));
        songs.add(new Song("When the World Was At War We Kept Dancing", "04:35"));
        songs.add(new Song("Beautiful People Beautiful Problems (feat. Stevie Nicks", "04:13"));
        songs.add(new Song("Tomorrow Never Came (feat. SEAN ONO LENNON)", "05:07"));
        songs.add(new Song("Heroin", "05:55"));
        songs.add(new Song("Change", "05:21"));
        songs.add(new Song("Get Free", "05:34"));

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
        listView.setBackgroundResource(R.color.album4_color);
    }
}
