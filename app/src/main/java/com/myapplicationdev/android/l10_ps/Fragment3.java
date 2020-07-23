package com.myapplicationdev.android.l10_ps;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * A simple {@link Fragment} subclass.
 */

public class Fragment3 extends Fragment {

    ImageView iv;

    public Fragment3() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_fragment_3, container, false);
        iv = view.findViewById(R.id.iv);
        String imageUrl = "https://i.imgur.com/tGbaZCY.jpg";
        Picasso.with(view.getContext()).load(imageUrl).into(iv);
        return view;
    }
}
