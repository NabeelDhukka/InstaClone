package com.example.nabee.instaclone.Profile;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.nabee.instaclone.R;
import com.example.nabee.instaclone.utils.botNavBarHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class ProfileActivity extends AppCompatActivity {

    private static final int actNum = 4;
    private Context mContext = ProfileActivity.this;
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
