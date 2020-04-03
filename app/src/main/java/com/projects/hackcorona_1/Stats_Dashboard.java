package com.projects.hackcorona_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.projects.hackcorona_1.Stats.CountryFragment;
import com.projects.hackcorona_1.Stats.HomeFragment;

public class Stats_Dashboard extends AppCompatActivity {


    Button btn_country;
    Button btn_World;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats__dashboard);


        btn_country = findViewById(R.id.Country_btn);
        btn_World = findViewById(R.id.world_btn);


        btn_country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_country.setVisibility(View.GONE);
                btn_World.setVisibility(View.GONE);

                FragmentManager fragmentManager = getSupportFragmentManager();
                CountryFragment countryFragment = new CountryFragment();

                fragmentManager.beginTransaction().replace(R.id.container, countryFragment).commit();

            }
        });

        btn_World.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_country.setVisibility(View.GONE);
                btn_World.setVisibility(View.GONE);
                FragmentManager fragmentManager1 = getSupportFragmentManager();
                HomeFragment countryFragment = new HomeFragment();

                fragmentManager1.beginTransaction().replace(R.id.container, countryFragment).commit();
            }
        });
    }
}
