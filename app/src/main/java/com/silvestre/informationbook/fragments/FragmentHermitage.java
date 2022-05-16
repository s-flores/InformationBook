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

public class FragmentHermitage extends Fragment {

    private ImageView imageViewHermitage;
    private ProgressBar progressBarHermitage;

    public static FragmentHermitage newInstance(){
        return new FragmentHermitage();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_hermitage,container,false);
        imageViewHermitage  = view.findViewById(R.id.imageViewHermitage);
        progressBarHermitage = view.findViewById(R.id.progressBarHermitage);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Hermitage_Museum_in_Saint_Petersburg.jpg/1920px-Hermitage_Museum_in_Saint_Petersburg.jpg")
        .into(imageViewHermitage, new Callback() {
            @Override
            public void onSuccess() {
                progressBarHermitage.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                progressBarHermitage.setVisibility(View.INVISIBLE);

            }
        });

        return view;
    }
}
