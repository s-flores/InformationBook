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

public class FragmentChichenItza extends Fragment {

    private ImageView imageViewChichenItza;
    private ProgressBar progressBarChichenItza;

    public static FragmentChichenItza newInstance(){
        return new FragmentChichenItza();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_chichen_itza,container,false);
        imageViewChichenItza  = view.findViewById(R.id.imageViewChichenItza);
        progressBarChichenItza = view.findViewById(R.id.progressBarChichenItza);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/Kukulcan-Temple-Chichen-Itza-west-side-2016-Luka-Peternel.jpg/1280px-Kukulcan-Temple-Chichen-Itza-west-side-2016-Luka-Peternel.jpg")
        .into(imageViewChichenItza, new Callback() {
            @Override
            public void onSuccess() {
                progressBarChichenItza.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                progressBarChichenItza.setVisibility(View.INVISIBLE);

            }
        });

        return view;
    }
}
