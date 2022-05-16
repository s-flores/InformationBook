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

public class FragmentPeron extends Fragment {

    private ImageView imageViewPeron;
    private ProgressBar progressBarPeron;

    public static FragmentPeron newInstance(){
        return new FragmentPeron();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_peron,container,false);
        imageViewPeron  = view.findViewById(R.id.imageViewPeron);
        progressBarPeron = view.findViewById(R.id.progressBarPeron);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f4/Juan_Domingo_Per%C3%B3n.jpg/800px-Juan_Domingo_Per%C3%B3n.jpg")
        .into(imageViewPeron, new Callback() {
            @Override
            public void onSuccess() {
                progressBarPeron.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                progressBarPeron.setVisibility(View.INVISIBLE);

            }
        });

        return view;
    }
}
