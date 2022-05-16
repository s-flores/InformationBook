package com.silvestre.informationbook.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.silvestre.informationbook.R;
import com.silvestre.informationbook.adapters.ViewPagerAdapterMuseums;
import com.silvestre.informationbook.adapters.ViewPagerAdapterWonders;

public class MuseumsActivity extends AppCompatActivity {

    TabLayout tabLayoutMuseums;
    ViewPager2 viewPagerMuseums;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);

        tabLayoutMuseums = findViewById(R.id.tabLayoutMuseums);
        viewPagerMuseums = findViewById(R.id.viewPagerMuseums);

        ViewPagerAdapterMuseums adapter = new ViewPagerAdapterMuseums(getSupportFragmentManager(), getLifecycle());

        viewPagerMuseums.setAdapter(adapter);

        TabLayoutMediator mediator = new TabLayoutMediator(tabLayoutMuseums, viewPagerMuseums, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if(position==0){
                    tab.setText("Louvre Museum");
                }
                if(position==1){
                    tab.setText("Hermitage Museum");
                }

            }
        });
        mediator.attach();
    }
}