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
public class Fragment2 extends Fragment {

    Button btnChangeColor2;
    LinearLayout linearLayout2;

    public Fragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_fragment_2, container, false);

        btnChangeColor2 = view.findViewById(R.id.btnChangeColor2);
        linearLayout2 = view.findViewById(R.id.linearLayout2);

        btnChangeColor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                linearLayout2.setBackgroundColor(color);
            }
        });

        return view;
    }
}