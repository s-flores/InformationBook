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

public class FragmentBrazil extends Fragment {

    private ImageView imageViewBrazil;
    private ProgressBar progressBarBrazil;

    public static FragmentBrazil newInstance(){
        return new FragmentBrazil();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_brazil,container,false);
        imageViewBrazil  = view.findViewById(R.id.imageViewBrazil);
        progressBarBrazil = view.findViewById(R.id.progressBarBrazil);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/en/thumb/0/05/Flag_of_Brazil.svg/1280px-Flag_of_Brazil.svg.png")
        .into(imageViewBrazil, new Callback() {
            @Override
            public void onSuccess() {
                progressBarBrazil.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                progressBarBrazil.setVisibility(View.INVISIBLE);

            }
        });

        return view;
    }
}
