package com.omkar.shopherb.activity.ui.order;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.omkar.shopherb.R;


public class OrderFragment extends Fragment implements View.OnClickListener {

    Button checkout;
    TextView one, two, three, four, total;
    TextView a,b,c,d,a1,b1,c1,d1;
    TextView z1,z2,z3,z4;
    int bp = 0, sp=0, wp=0, pp=0;
    int banana = 55, paracetamol = 60, syrup = 15, weed = 40;
    


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_order, container, false);
        checkout = root.findViewById(R.id.checkout);
        one = root.findViewById(R.id.fifteen);
        two = root.findViewById(R.id.sixty);
        three = root.findViewById(R.id.fiftyfive);
        four = root.findViewById(R.id.forty);
        total = root.findViewById(R.id.hundred);

        a = root.findViewById(R.id.plusPara);
        a1 = root.findViewById(R.id.minusPara);
        b = root.findViewById(R.id.plusBanana);
        b1 = root.findViewById(R.id.minusBanana);
        c = root.findViewById(R.id.plusSyrup);
        c1 = root.findViewById(R.id.minusSyrup);
        d = root.findViewById(R.id.plusWeed);
        d1 = root.findViewById(R.id.minusWeed);

        z1 = root.findViewById(R.id.zeroPara);
        z2 = root.findViewById(R.id.zeroBanana);
        z3 = root.findViewById(R.id.zeroSyrup);
        z4 = root.findViewById(R.id.zeroweed);


        checkout.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        total.setOnClickListener(this);



        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        a1.setOnClickListener(this);
        b1.setOnClickListener(this);
        c1.setOnClickListener(this);
        d1.setOnClickListener(this);






        return root;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.checkout : {

                break;
            }
            case R.id.plusPara :{

                pp = pp + 1;
                int num = pp*paracetamol;
                two.setText(String.valueOf(num));
                z1.setText(String.valueOf(pp));
//                pp++;

                break;
            }
            case R.id.minusPara : {
                pp = pp -1;
                int num = pp*paracetamol;
                two.setText(String.valueOf(num));
                z1.setText(String.valueOf(pp));
//                pp--;

                break;
            }
            case R.id.plusBanana:{
                bp+= 1;
                int num = bp*banana;
                one.setText(String.valueOf(num));
                z2.setText(String.valueOf(bp));
//                bp++;
                break;
            }
            case R.id.plusSyrup:{
                sp+=1;
                int num=sp*syrup;
                three.setText(String.valueOf(num));
                z3.setText(String.valueOf(sp));
//                sp++;
                break;
            }
            case R.id.plusWeed: {
                wp+=1;
                z4.setText(String.valueOf(wp));
//                wp++;
                break;
            }
            case R.id.minusBanana:{
                bp-=1;
                z2.setText(String.valueOf(bp));
//                bp--;
                break;
            }

            case R.id.minusSyrup:{
                sp-=1;
                z3.setText(String.valueOf(sp));
//                sp--;
                break;
            }
            case  R.id.minusWeed : {
                wp-=1;
                z4.setText(String.valueOf(wp));
//                wp--;
                break;

            }


        }

    }
}
