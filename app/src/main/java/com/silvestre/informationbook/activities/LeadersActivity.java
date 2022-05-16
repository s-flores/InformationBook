package com.silvestre.informationbook.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.silvestre.informationbook.R;
import com.silvestre.informationbook.adapters.ViewPagerAdapterLeaders;

public class LeadersActivity extends AppCompatActivity {

    private TabLayout tabLayoutLeaders;
    private ViewPager2 viewPagerLeaders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaders);

        tabLayoutLeaders = findViewById(R.id.tabLayoutLeaders);
        viewPagerLeaders = findViewById(R.id.viewPagerLeaders);

        ViewPagerAdapterLeaders adapter = new ViewPagerAdapterLeaders(getSupportFragmentManager(), getLifecycle());

        viewPagerLeaders.setAdapter(adapter);

        TabLayoutMediator mediator = new TabLayoutMediator(tabLayoutLeaders, viewPagerLeaders,
                true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if(position==0){
                    tab.setText("Perón");
                }
                else if(position==1){
                    tab.setText("Atatürk");
                }
            }
        });
        mediator.attach();
    }
}