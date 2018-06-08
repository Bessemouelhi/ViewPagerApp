package com.appdevloop.viewpagerapp;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by AppDevloop on 09/06/2018.
 */
public class PageAdapter extends FragmentStatePagerAdapter {

    // 1 - Array of colors that will be passed to PageFragment
    private int[] colors;

    // 2 - Default Constructor
    public PageAdapter(FragmentManager mgr, int[] colors) {
        super(mgr);
        this.colors = colors;
    }

    @Override
    public int getCount() {
        return colors.length; // 3 - Number of page to show
    }

    @Override
    public Fragment getItem(int position) {
        // 4 - Page to return
        return(PageFragment.newInstance(position, this.colors[position]));
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "Page "+position;
    }
}
