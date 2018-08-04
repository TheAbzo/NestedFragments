package com.example.abzo.fragmentstut;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabPagerAdapter extends FragmentPagerAdapter {

    String [] pagetitle = new String []{"one","two"};
    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }

    @Override
    public Fragment getItem(int position) {


        switch (position) {
            case 0:
                Tab1 one = new Tab1();
                return one;
        }
                Tab2 two = new Tab2();
                return two;

    }

    @Override
    public int getCount() {
        return 2;
    }

}
