package com.silvestre.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.silvestre.informationbook.fragments.FragmentLouvre;
import com.silvestre.informationbook.fragments.FragmentHermitage;

public class ViewPagerAdapterMuseums extends FragmentStateAdapter {
    public ViewPagerAdapterMuseums(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment;

        switch (position){
            case 0:
                fragment = FragmentLouvre.newInstance();
                break;
            case 1:
                fragment = FragmentHermitage.newInstance();
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
