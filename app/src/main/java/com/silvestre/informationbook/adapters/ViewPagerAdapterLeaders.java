package com.silvestre.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.silvestre.informationbook.fragments.FragmentAtaturk;
import com.silvestre.informationbook.fragments.FragmentPeron;

public class ViewPagerAdapterLeaders extends FragmentStateAdapter {
    public ViewPagerAdapterLeaders(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment;

        switch (position){
            case 0:
                fragment = FragmentPeron.newInstance();
                break;
            case 1:
                fragment = FragmentAtaturk.newInstance();
                break;
            default:
                return null;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
