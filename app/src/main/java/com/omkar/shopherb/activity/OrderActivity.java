package com.omkar.shopherb.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import com.omkar.shopherb.R;
import com.omkar.shopherb.activity.ui.order.CheckoutFragment;

public class OrderActivity extends AppCompatActivity implements View.OnClickListener {

    Button checkout;
    TextView paraTotal, bananaTotal, syrupTotal, weedTotal, lastTotal, total;
    TextView pp,pm,pb,mb,ps,ms,pw,mw,pl,ml;
    TextView paraZero,bananaZero,syrupZero,weedZero,lastZero;
    int banana = 55, valueB=0, paracetamol, valueP=0, syrup = 15, valueS=0, weed = 40,valueW=0, last =100, valueL=0, totalPrice = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        pp = findViewById(R.id.plusPara);
        pm = findViewById(R.id.minusPara);
        pb = findViewById(R.id.plusBanana);
        mb = findViewById(R.id.minusBanana);
        ps = findViewById(R.id.plusSyrup);
        ms = findViewById(R.id.minusSyrup);
        pw = findViewById(R.id.plusWeed);
        mw = findViewById(R.id.minusWeed);
        pl = findViewById(R.id.lastplus);
        ml = findViewById(R.id.lastminus);

        paraZero = findViewById(R.id.zeroPara);
        bananaZero = findViewById(R.id.zeroBanana);
        syrupZero = findViewById(R.id.zeroSyrup);
        weedZero = findViewById(R.id.zeroweed);
        lastZero = findViewById(R.id.lastzero);

        paraTotal = findViewById(R.id.sixty);
        bananaTotal = findViewById(R.id.fiftyfive);
        syrupTotal = findViewById(R.id.fifteen);
        weedTotal = findViewById(R.id.forty);
        lastTotal = findViewById(R.id.hundred);

        total = findViewById(R.id.totalprice);

        checkout = findViewById(R.id.checkout);

        checkout.setOnClickListener(this);

        pp.setOnClickListener(this);
        pm.setOnClickListener(this);
        ps.setOnClickListener(this);
        ms.setOnClickListener(this);
        pb.setOnClickListener(this);
        mb.setOnClickListener(this);
        pw.setOnClickListener(this);
        mw.setOnClickListener(this);
        pl.setOnClickListener(this);
        ml.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){


            case R.id.plusPara : {
                // plus para
                valueP = valueP + 1;
                paraZero.setText(String.valueOf(valueP));
                paracetamol = 60 * valueP;
                paraTotal.setText(String.valueOf(paracetamol));
                totalPrice += 60;
                total.setText(String.valueOf(totalPrice));
                break;

            }

            case R.id.minusPara : {
                // minus para
                valueP -= 1;
                paraZero.setText(String.valueOf(valueP));
                paracetamol = 60 * valueP;
                paraTotal.setText(String.valueOf(paracetamol));
                totalPrice -= 60;
                total.setText(String.valueOf(totalPrice));
                break;

            }

            case R.id.plusBanana : {
                // plus banana
                valueB = valueB + 1;
                bananaZero.setText(String.valueOf(valueB));
                banana = 55 * valueB;
                bananaTotal.setText(String.valueOf(banana));
                totalPrice += 55;
                total.setText(String.valueOf(totalPrice));
                break;

            }

            case R.id.minusBanana : {
                // minus banana
                valueB = valueB - 1;
                bananaZero.setText(String.valueOf(valueB));
                banana = 55 * valueB;
                bananaTotal.setText(String.valueOf(banana));
                totalPrice -= 55;
                total.setText(String.valueOf(totalPrice));
                break;
            }

            case R.id.plusSyrup : {
                // plus syrup
                valueS = valueS + 1;
                syrupZero.setText(String.valueOf(valueS));
                syrup = 15 * valueS;
                syrupTotal.setText(String.valueOf(syrup));
                totalPrice += 15;
                total.setText(String.valueOf(totalPrice));
                break;
            }

            case R.id.minusSyrup : {
                // minus syrup
                valueS = valueS - 1;
                syrupZero.setText(String.valueOf(valueS));
                syrup = 15 * valueS;
                syrupTotal.setText(String.valueOf(syrup));
                totalPrice -= 15;
                total.setText(String.valueOf(totalPrice));
                break;
            }

            case R.id.plusWeed : {
                // plus weed
                valueW = valueW + 1;
                weedZero.setText(String.valueOf(valueW));
                weed = 40 * valueW;
                weedTotal.setText(String.valueOf(weed));
                totalPrice += 40;
                total.setText(String.valueOf(totalPrice));
                break;

            }

            case R.id.minusWeed : {
                // minus weed
                valueW = valueW - 1;
                weedZero.setText(String.valueOf(valueW));
                weed = 40 * valueW;
                weedTotal.setText(String.valueOf(weed));
                totalPrice -= 40;
                total.setText(String.valueOf(totalPrice));
                break;
            }

            case R.id.lastplus : {
                // plus last
                valueL = valueL + 1;
                lastZero.setText(String.valueOf(valueL));
                last = 100 * valueL;
                lastTotal.setText(String.valueOf(last));
                totalPrice += 100;
                total.setText(String.valueOf(totalPrice));
                break;

            }

            case R.id.lastminus : {
                // minus last
                valueL = valueL - 1;
                lastZero.setText(String.valueOf(valueL));
                last = 100 * valueL;
                lastTotal.setText(String.valueOf(last));
                totalPrice -= 100;
                total.setText(String.valueOf(totalPrice));
                break;
            }

            case R.id.checkout : {
                Intent intent = new Intent(OrderActivity.this, CheckoutActivity.class).putExtra("price",totalPrice);
                startActivity(intent);
            }


        }

    }
}
