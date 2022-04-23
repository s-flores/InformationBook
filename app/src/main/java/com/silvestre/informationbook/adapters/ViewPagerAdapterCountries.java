package com.silvestre.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.silvestre.informationbook.fragments.FragmentAlbania;
import com.silvestre.informationbook.fragments.FragmentArgentina;
import com.silvestre.informationbook.fragments.FragmentBrazil;

public class ViewPagerAdapterCountries extends FragmentStateAdapter {
    public ViewPagerAdapterCountries(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment;

        switch (position){
            case 0:
                fragment = FragmentAlbania.newInstance();
                break;
            case 1:
                fragment = FragmentArgentina.newInstance();
                break;
            default:
                return null;
            case 2:
                fragment = FragmentBrazil.newInstance();
                break;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3 ;
    }
}
