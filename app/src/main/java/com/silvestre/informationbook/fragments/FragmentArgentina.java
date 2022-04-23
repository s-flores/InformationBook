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

public class FragmentArgentina extends Fragment {

    private ImageView imageViewArgentina;
    private ProgressBar progressBarArgentina;

    public static FragmentArgentina newInstance(){
        return new FragmentArgentina();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_argentina,container,false);
        imageViewArgentina  = view.findViewById(R.id.imageViewArgentina);
        progressBarArgentina = view.findViewById(R.id.progressBarArgentina);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/1920px-Flag_of_Argentina.svg.png")
        .into(imageViewArgentina, new Callback() {
            @Override
            public void onSuccess() {
                progressBarArgentina.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                progressBarArgentina.setVisibility(View.INVISIBLE);

            }
        });

        return view;
    }
}
