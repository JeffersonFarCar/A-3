package com.example.jeffersonfarfan.dream;

import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class BTS extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    PageAdapterBts pageAdapterSu;
    TabItem tabInformacion;
    TabItem tabVideos;
    TabItem tabOpinion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bts);

        toolbar = findViewById(R.id.toolbar);


        toolbar = findViewById(R.id.toolbar);

        tabLayout = findViewById(R.id.tablayout);
        tabInformacion = findViewById(R.id.tabInformacion);
        tabVideos = findViewById(R.id.tabVideos);
        tabOpinion = findViewById(R.id.tabOpinion);
        viewPager = findViewById(R.id.viewPager);

        pageAdapterSu = new PageAdapterBts(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapterSu);

        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        ImageButton btn1 = (ImageButton) findViewById(R.id.back);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
