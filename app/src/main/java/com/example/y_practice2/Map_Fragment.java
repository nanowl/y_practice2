package com.example.y_practice2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import net.daum.mf.map.api.MapView;

public class Map_Fragment extends Fragment  {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.map_interface_frame, container, false);

    }

}
