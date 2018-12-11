package com.example.jeffersonfarfan.dream;

import android.os.Build;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Index extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    PageAdapterIndex pageAdapterIndex;
    TabItem tabHome;
    TabItem tabCategorias;
    TabItem tabPerfil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        toolbar = findViewById(R.id.toolbar);

        tabLayout = findViewById(R.id.tablayout);
        tabHome = findViewById(R.id.tabHome);
        tabCategorias = findViewById(R.id.tabCategorias);
        tabPerfil = findViewById(R.id.tabPerfil);
        viewPager = findViewById(R.id.viewPager);

        pageAdapterIndex = new PageAdapterIndex(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapterIndex);

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
    }
}
