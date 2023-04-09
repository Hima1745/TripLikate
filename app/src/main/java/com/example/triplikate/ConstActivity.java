package com.example.triplikate;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class ConstActivity extends AppCompatActivity {
    public ImageView pindahImg;
//    public ImageView baliTour;
//    private ProgressDialog progressDialog;
//    private CountryAdapter adapter;
//    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_const);

        pindahImg = findViewById(R.id.imageView5);
//        baliTour = findViewById(R.id.text11);
//        perjalananImg = findViewById(R.id.imageView6);

        pindahImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), PenawaranActivity.class);
                startActivity(itn);
            }
        });

//        baliTour.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent itnbali = new Intent(getApplicationContext(), KotaActivity.class);
//                startActivity(itnbali);
//            }
//        });
    }
}