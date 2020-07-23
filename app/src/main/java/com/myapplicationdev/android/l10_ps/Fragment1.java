package com.myapplicationdev.android.l10_ps;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    Button btnChangeColor;
    LinearLayout linearLayout1;

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_fragment_1, container, false);

        btnChangeColor = view.findViewById(R.id.btnChangeColor2);
        linearLayout1 = view.findViewById(R.id.linearLayout2);

        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                linearLayout1.setBackgroundColor(color);
            }
        });

        return view;
    }
}