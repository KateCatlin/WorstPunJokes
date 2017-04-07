package com.example.katecatlin.worstpunjokes.activities;

import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentContainer;
import android.support.v4.app.FragmentController;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.katecatlin.worstpunjokes.R;
import com.example.katecatlin.worstpunjokes.fragments.EntryFragment;

public class EntryActivity extends FragmentActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);

        if (fragment == null) {
            fragment = new EntryFragment();
            fm.beginTransaction()
                    .add(R.id.fragmentContainer, fragment).commit();
        }
    }
}
