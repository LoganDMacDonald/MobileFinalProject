 package com.afinal.logan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

 /**
  * the main menu activity will be used to navigate and troubleshoot during development
  *
  * considering just defaulting to the viewList activity and having all options
  * available from that screen,
  *
  * but for now this is the main menu, and it will have 3 options:
  *
  *     - add to list
  *         search for a new item to add to list
  *
  *     - view list
  *         view the database contents and apply filters and sorting
  *
  *     - delete all
  *         delete the contents of the database (used for testing/debugging? the fuck do I know)
  */
 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addToList(View v){
        // change to 'add to list' activity
        Intent i = new Intent(this,AddToList.class);
        startActivity(i);
    }

     public void viewList(View v){
         // change to 'add to list' activity
         Intent i = new Intent(this,viewList.class);
         startActivity(i);
     }


}
