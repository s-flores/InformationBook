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

public class FragmentAlbania extends Fragment {

    private ImageView imageViewAlbania;
    private ProgressBar progressBarAlbania;

    public static FragmentAlbania newInstance(){
        return new FragmentAlbania();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_albania,container,false);
        imageViewAlbania  = view.findViewById(R.id.imageViewAlbania);
        progressBarAlbania = view.findViewById(R.id.progressBarAlbania);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Flag_of_Albania.svg/1280px-Flag_of_Albania.svg.png")
        .into(imageViewAlbania, new Callback() {
            @Override
            public void onSuccess() {
                progressBarAlbania.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                progressBarAlbania.setVisibility(View.INVISIBLE);

            }
        });

        return view;
    }
}
