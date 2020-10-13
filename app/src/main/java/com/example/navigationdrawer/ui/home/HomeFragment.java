package com.example.navigationdrawer.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.navigationdrawer.R;

public class HomeFragment extends Fragment {

    View view;
    TextView text_home;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);

        text_home = view.findViewById(R.id.text_home);

        text_home.setText("Welcome!");

        Toast.makeText(getActivity(), "Message", Toast.LENGTH_SHORT).show();

        return view;
    }
}