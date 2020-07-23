package com.myapplicationdev.android.l10_ps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ArrayList<Fragment> al;
    FragmentAdapter adapter;
    ViewPager vPager;
    Button btnReadLater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vPager = findViewById(R.id.viewpager);
        btnReadLater = findViewById(R.id.btnReadLater);

        FragmentManager fm = getSupportFragmentManager();

        al = new ArrayList<Fragment>();
        al.add(new Fragment1());
        al.add(new Fragment2());
        al.add(new Fragment3());

        adapter = new FragmentAdapter(fm, al);

        vPager.setAdapter(adapter);

        btnReadLater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.previous:
                if (vPager.getCurrentItem() > 0){
                    int previousPage = vPager.getCurrentItem() - 1;
                    vPager.setCurrentItem(previousPage, true);
                }
                return true;
        }

        switch (item.getItemId()) {
            case R.id.next:
                int max = vPager.getChildCount();
                if (vPager.getCurrentItem() < max){
                    int nextPage = vPager.getCurrentItem() + 1;
                    vPager.setCurrentItem(nextPage, true);
                }
                return true;
        }

        switch (item.getItemId()) {
            case R.id.random:
                Random rnd = new Random();
                vPager.setCurrentItem(rnd.nextInt(vPager.getChildCount()));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}