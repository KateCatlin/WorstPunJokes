package com.example.katecatlin.worstpunjokes.activities;

import android.app.Activity;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentContainer;
import android.support.v4.app.FragmentController;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.View;

import com.example.katecatlin.worstpunjokes.R;
import com.example.katecatlin.worstpunjokes.fragments.EntryFragment;

public class EntryActivity extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        EntryFragment entryFragment = new EntryFragment();

        android.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container, entryFragment);
        fragmentTransaction.commit();

    }
}
