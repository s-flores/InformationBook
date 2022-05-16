package com.silvestre.informationbook.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.silvestre.informationbook.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class FragmentAtaturk extends Fragment {

    private ImageView imageViewAtaturk;
    private ProgressBar progressBarAtaturk;

    public static FragmentAtaturk newInstance(){
        return new FragmentAtaturk();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ataturk,container,false);
        imageViewAtaturk  = view.findViewById(R.id.imageViewAtaturk);
        progressBarAtaturk = view.findViewById(R.id.progressBarAtaturk);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/a/a8/Ataturk1930s.jpg")
        .into(imageViewAtaturk, new Callback() {
            @Override
            public void onSuccess() {
                progressBarAtaturk.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                progressBarAtaturk.setVisibility(View.INVISIBLE);

            }
        });

        return view;
    }
}
