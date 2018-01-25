package com.example.nabee.instaclone.Search;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.nabee.instaclone.Profile.ProfileActivity;
import com.example.nabee.instaclone.R;
import com.example.nabee.instaclone.utils.botNavBarHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class SearchActivity extends AppCompatActivity {

    private final static int actNum = 1;
    private Context mContext = SearchActivity.this;
    private static final String TAG = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");

        setupBottomNav();
    }

    //init bottom nav bar
    public void setupBottomNav(){

        Log.d(TAG, "setup BOTNAVBAR");
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.botNavBar);
        botNavBarHelper.setUpBotNavBarView(bottomNavigationViewEx);
        botNavBarHelper.enableNavSwitch(mContext, bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(actNum);
        menuItem.setChecked(true);
    }
}
