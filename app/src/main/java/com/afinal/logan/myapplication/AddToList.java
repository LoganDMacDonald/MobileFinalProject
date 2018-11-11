package com.afinal.logan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * This class will be used to query online databases to search for various entertainment media
 *
 * to start we will implement acquring movies and movie data because it seems to be the simplest
 *
 * the user will select the type of media they are looking to add (movie,tv show, ...)
 * after they select, they type the name of the media and the app queries online databases
 * and returns the results, the user then chooses which one they want to put on their list,
 * and that option is added to the local database stored on the phone
 *
 * data to be retrieved from the online resources:
 *      - title of media
 *      - date of release
 *      - genre
 *      - size ( movie run time , seasons of tv show , ...)
 *      - ratings (either critic ratings or user ratings, or both)
 *      - link to reviews page (no way to decide what reviews are useful, so let the user decide)
 *
 *
 */

public class AddToList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_list);
    }
}
