package com.test.hassan.annadaleramadantimetable;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Hassan on 28-May-17.
 */

public class SwipeAdapter extends FragmentStatePagerAdapter {

    public SwipeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new AnnandaleFragment();
            case 1:
                return new CentralFragment();
            case 2:
                return new IqraFragment();
            case 3:
                return new BlackHallFragment();
            default:
                break;
        }
        return null;
    }

        @Override
        public int getCount()
        {
            return 4;
        }
    }