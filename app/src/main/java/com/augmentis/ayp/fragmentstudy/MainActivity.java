package com.augmentis.ayp.fragmentstudy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.View;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        Fragment f = fm.findFragmentById(R.id.fragment_container_1);

        if(f == null) {
            Fragment newFragment = new FirstFragment();

            fm.beginTransaction()
                    .add(R.id.fragment_container_1, newFragment)
                    .commit();
        }

        // landscape ??
        View fragmentContainer2 = findViewById(R.id.fragment_container_2);
        if( fragmentContainer2 != null ) {
            f = fm.findFragmentById(R.id.fragment_container_2);

            if(f == null) {
                Fragment newFragment = new SecondFragment();

                fm.beginTransaction()
                        .add(R.id.fragment_container_2, newFragment)
                        .commit();
            }
        }
    }
}
