package com.example.jeffersonfarfan.dream;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapterBts extends FragmentPagerAdapter {
    private int numOfTabs;

    PageAdapterBts(FragmentManager fm, int numOfTabs){
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                return new BtsinfoFragment();
            case 1:
                return new BtstrabajosFragment();
            case 2:
                return new BtscurioFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount(){return numOfTabs;}
}
