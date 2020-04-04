package com.projects.hackcorona_1.MythBusters;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.projects.hackcorona_1.R;


public class Myth_BusterActivity extends AppCompatActivity {
     Button myth ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myth__buster);

        myth =  findViewById(R.id.myth_fragbtn);

        myth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myth.setVisibility(View.GONE);
                FragmentManager fragmentManager = getSupportFragmentManager();
               MythBuster mp   = new MythBuster();

                fragmentManager.beginTransaction().replace(R.id.container, mp).commit();
            }
        });


    }
}
