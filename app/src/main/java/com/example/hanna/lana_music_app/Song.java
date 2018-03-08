package com.example.hanna.lana_music_app;


import android.content.Context;
import android.widget.TextView;
/**
 * Created by Hanna on 05.03.2018.
 */

public class Song {

    private String mSongName;;
    private String  mSongTime;

    public Song(String songName, String songTime){
        mSongName = songName;
        mSongTime = songTime;
    }

    public String getmSongName() {
        return mSongName;
    }

    public String getmSongTime(){
        return mSongTime;
    }
}
