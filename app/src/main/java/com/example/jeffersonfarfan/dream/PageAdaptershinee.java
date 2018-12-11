package com.example.jeffersonfarfan.dream;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdaptershinee extends FragmentPagerAdapter {
    private int numOfTabs;

    PageAdaptershinee(FragmentManager fm, int numOfTabs){
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                return new ShinformacionFragment();
            case 1:
                return new ShcancionesFragment();
            case 2:
                return new ShcuriosidadesFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount(){return numOfTabs;}
}
