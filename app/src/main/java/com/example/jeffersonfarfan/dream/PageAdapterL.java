package com.example.jeffersonfarfan.dream;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapterL extends FragmentPagerAdapter {
    private int numOfTabs;

    PageAdapterL(FragmentManager fm, int numOfTabs){
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                return new LInformacionFragment();
            case 1:
                return new LTrabajosFragment();
            case 2:
                return new LCuriosidadesFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount(){return numOfTabs;}
}
