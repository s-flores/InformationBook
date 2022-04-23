package com.silvestre.informationbook.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.silvestre.informationbook.R;
import com.silvestre.informationbook.adapters.ViewPagerAdapterCountries;

public class CountriesActivity extends AppCompatActivity {

    private TabLayout tabLayoutCountries;
    private ViewPager2 viewPagerCountries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);

        tabLayoutCountries = findViewById(R.id.tabLayoutAlbania);
        viewPagerCountries = findViewById(R.id.viewPagerAlbania);

        ViewPagerAdapterCountries adapter = new ViewPagerAdapterCountries(getSupportFragmentManager(),getLifecycle());

        viewPagerCountries.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutCountries, viewPagerCountries,
                true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position){
                    case 0:
                        tab.setText("Albania");
                        break;
                    case 1:
                        tab.setText("Argentina");
                        break;
                    case 2:
                        tab.setText("Brazil");
                        break;
                }
            }
        });

        tabLayoutMediator.attach();


    }
}