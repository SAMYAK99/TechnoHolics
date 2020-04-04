package com.projects.hackcorona_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

import com.projects.hackcorona_1.MythBusters.Myth_BusterActivity;
import com.projects.hackcorona_1.Precautions.PecautionFragment_Activity;
import com.projects.hackcorona_1.Telephone.MainPhone;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    TextView textView;
    Button btn_maps, btn_stats, btn_chat, btn_precautions, btn_riskLevel, btn_helpLine;
    Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);


        toolbar.setTitle("CoviData");


        // different icons
        btn_maps = findViewById(R.id.maps);
        btn_stats = findViewById(R.id.stats_btn);
        btn_chat = findViewById(R.id.ChatBot_btn);
        btn_precautions = findViewById(R.id.Precaution_btn);
        btn_riskLevel = findViewById(R.id.RiskLevel_btn);
        btn_helpLine = findViewById(R.id.helpline_btn);


        btn_precautions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inta = new Intent(MainActivity.this, PecautionFragment_Activity.class);
                startActivity(inta);
            }
        });


        btn_riskLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intb = new Intent(MainActivity.this, RiskLevel.class);
                startActivity(intb);
            }
        });

        btn_helpLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intc = new Intent(MainActivity.this, MainPhone.class);
                startActivity(intc);
            }
        });

        btn_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intd = new Intent(MainActivity.this, ChatBotActvity.class);
                startActivity(intd);
            }
        });


        btn_stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10 = new Intent(MainActivity.this, Stats_Dashboard.class);
                startActivity(intent10);
            }
        });


        btn_maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intm = new Intent(MainActivity.this, MapsDash.class);
                startActivity(intm);
            }
        });


        setSupportActionBar(toolbar);


        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new
                ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()) {
            case R.id.nav_home:
                break;

            case R.id.nav_stats:
                Intent intent10 = new Intent(MainActivity.this, Stats_Dashboard.class);
                startActivity(intent10);
                break;

            case R.id.nav_myth:
                Intent intentmy = new Intent(MainActivity.this, Myth_BusterActivity.class);
                startActivity(intentmy);
                break;

            case R.id.nav_feedback:
                Intent feed = new Intent(MainActivity.this, FeedbackActivity.class);
                startActivity(feed);
                break;


                // MORE OPTIONS ---



            case R.id.nav_share:
                Intent  sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String sharebody = "CoviData";
                String shareSubject = "Download the CoviData ";

                sharingIntent.putExtra(Intent.EXTRA_TEXT,sharebody);
                sharingIntent.putExtra(Intent.EXTRA_TEXT,shareSubject);

                startActivity(Intent.createChooser(sharingIntent,"Sharing Using"));


                break;

            case R.id.nav_privacy:
                Intent intprivacy = new Intent (MainActivity.this,PrivacyActivty.class);
                startActivity(intprivacy);
                break;

            case R.id.nav_about:
                Intent intabout= new Intent (MainActivity.this,About.class);
                startActivity(intabout);
                break;



        }

        drawerLayout.closeDrawer(GravityCompat.START);


        return true;
    }
}
