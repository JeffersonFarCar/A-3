package com.example.jeffersonfarfan.dream;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapterSu extends FragmentPagerAdapter {
    private int numOfTabs;

    PageAdapterSu(FragmentManager fm, int numOfTabs){
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                return new SuinformacionFragment();
            case 1:
                return new SutrabajosFragment();
            case 2:
                return new SucuriosidadesFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount(){return numOfTabs;}
}
