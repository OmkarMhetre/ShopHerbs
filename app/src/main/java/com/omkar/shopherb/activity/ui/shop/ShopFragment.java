package com.omkar.shopherb.activity.ui.shop;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.fragment.app.FragmentTransaction;

import com.omkar.shopherb.R;
import com.omkar.shopherb.activity.fragment.FeverFragment;


public class ShopFragment extends Fragment {

    EditText symptoms;
    Button search;
    String symptomsText = "";

    private ShopViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(ShopViewModel.class);
        View root = inflater.inflate(R.layout.fragment_shop, container, false);

        symptoms = root.findViewById(R.id.searchShopEditText);
        symptomsText = symptoms.getText().toString();

        search = root.findViewById(R.id.searchShopButton);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowFragment();
            }
        });







        return root;
    }

    private void ShowFragment() {
        FeverFragment feverFragment = new FeverFragment();
        getChildFragmentManager().beginTransaction().replace(R.id.searchShopFrameLayout,feverFragment).commit();

    }

}
