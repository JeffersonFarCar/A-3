package com.example.jeffersonfarfan.dream;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapterS extends FragmentPagerAdapter {
    private int numOfTabs;

    PageAdapterS(FragmentManager fm, int numOfTabs){
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                return new SInformacionFragment();
            case 1:
                return new SVideosFragment();
            case 2:
                return new SCuriosidadesFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount(){return numOfTabs;}
}
