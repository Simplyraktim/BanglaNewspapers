package com.das.raktim.banglanewspapers;

/**
 * Created by Raktim on 9/25/2017.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


/**
 * Created by Belal on 2/3/2016.
 */
//Extending FragmentStatePagerAdapter
public class Pager extends FragmentStatePagerAdapter {

    //integer to count number of tabs
    int tabCount;

    //Constructor to the class
    public Pager(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;
    }

    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                MainFragment mainFragment = new MainFragment();
                return mainFragment;
            case 1:
                GoogleFragment googleFragment = new GoogleFragment();
                return googleFragment;
            case 2:
                BingFragment bingFragment = new BingFragment();
                return bingFragment;
            case 3:
                EntertainmentFragment entertainmentFragment = new EntertainmentFragment();
                return entertainmentFragment;


            default:
                return null;
        }
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }
}