package com.projects.hackcorona_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;
import com.projects.hackcorona_1.Maps.GlobalCoronaMapFragment;
import com.projects.hackcorona_1.Maps.India_State_wise_Graphical_View_Fragment;
import com.projects.hackcorona_1.Stats.CountryFragment;

public class MapsDash extends AppCompatActivity {

    Button world, india ;
    LottieAnimationView lottemap ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_dash);

        world = findViewById(R.id.world);
        india = findViewById(R.id.india);
        lottemap = findViewById(R.id.lottemap);

         india.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                lottemap.setVisibility(View.GONE);
                 world.setVisibility(View.GONE);
                 india.setVisibility(View.GONE);

                 FragmentManager fragmentManager = getSupportFragmentManager();
                 India_State_wise_Graphical_View_Fragment indiaFrag = new India_State_wise_Graphical_View_Fragment();

                 fragmentManager.beginTransaction().replace(R.id.containers, indiaFrag).commit();

             }
         });

         world.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 lottemap.setVisibility(View.GONE);
                 world.setVisibility(View.GONE);
                 india.setVisibility(View.GONE);

                 FragmentManager fragmentManager = getSupportFragmentManager();
                 GlobalCoronaMapFragment global = new GlobalCoronaMapFragment();

                 fragmentManager.beginTransaction().replace(R.id.containers, global).commit();
             }
         });

    }
}
