package com.projects.hackcorona_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class IntroActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        addSlide(AppIntroFragment.newInstance("Realtime Stats", "Stats of Infected , Recovered , Died  etc... can fe fetch in RealTime",
                R.drawable.stat, ContextCompat.getColor(getApplicationContext(), R.color.firstcolor)));
        addSlide(AppIntroFragment.newInstance("Maps and Graphs", "Different Stats of Covid Infected ones are Plotted in Maps and Graphs " ,
                R.drawable.map, ContextCompat.getColor(getApplicationContext(),R.color.secondcolor)));

        addSlide(AppIntroFragment.newInstance("FAQ ChatBot", "Solve your queries with our smart Bot" ,
                R.drawable.chatbotimg, ContextCompat.getColor(getApplicationContext(),R.color.thirdcolor)));

        addSlide(AppIntroFragment.newInstance("...and many more", "Awesome features like Myth Busters , Precaution  , Helpline Numbers  etc.. are included in the app" ,
                R.drawable.myth, ContextCompat.getColor(getApplicationContext(),R.color.fourthcolor)));



        setFadeAnimation();


    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);

        Intent intent = new Intent(IntroActivity.this, MainActivity.class);
        startActivity(intent);
        finish();


    }

    @Override
    public void onDonePressed(Fragment currentFragment) {

        Intent intent = new Intent(IntroActivity.this, MainActivity.class);
        startActivity(intent);
        finish();


    }
}