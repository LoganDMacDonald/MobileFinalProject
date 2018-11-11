package com.afinal.logan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/**
 * this activity is used to view the saved database of ENTERTAINMENT MEDIA
 *
 * the user is able to sort and filter the list
 *
 *  filter options are used to :
 *      - show only specific mediums of ENTERTAINMENT MEDIA such as
 *  tv shows, movies, anime, comic books, manga, etc
 *      - show only certain genres
 *
 *
 *
 *  the sort option will allow the user to sort by:
 *      - Date added to list
 *      - Date that the media was originally created
 *      - Ratings
 */
public class viewList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_list);
    }
}
