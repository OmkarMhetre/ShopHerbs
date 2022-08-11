package com.omkar.shopherb.activity.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.omkar.shopherb.R;
import com.omkar.shopherb.activity.ui.shop.Hospital_Item_Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class HospitalFragment extends Fragment {

    Button search;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_hospital, container, false);
        search = root.findViewById(R.id.searchHospitalButton);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowFragment();
            }
        });

        return root;

    }

    private void ShowFragment() {
        Hospital_Item_Fragment hospital_item_fragment = new Hospital_Item_Fragment();
        getChildFragmentManager().beginTransaction().replace(R.id.recycleViewHospital, hospital_item_fragment).commit();
    }
}
