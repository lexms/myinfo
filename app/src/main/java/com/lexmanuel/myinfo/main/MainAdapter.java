package com.lexmanuel.myinfo.main;
/*
 * Tanggal Pengerjaan    : 16/05/2019
 * NIM                   : 10116370
 * Nama                  : Alexander M S
 * Kelas                 : IF - 8
 * */
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MainAdapter extends FragmentPagerAdapter {

    private static final int NUM_PAGES = 3;
    private ArrayList<Fragment> mFragmentList = new ArrayList<>();

    MainAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    void addFragment(Fragment fragment) {
        mFragmentList.add(fragment);
    }
}
