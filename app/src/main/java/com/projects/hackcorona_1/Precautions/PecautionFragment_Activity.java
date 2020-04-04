package com.projects.hackcorona_1.Precautions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;
import com.projects.hackcorona_1.R;

public class PecautionFragment_Activity extends AppCompatActivity {


    Button prec  ;
    LottieAnimationView lotteprec ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pecaution_fragment_);

        prec = findViewById(R.id.prec_fragbtn);
        lotteprec = findViewById(R.id.lotteprec);



        prec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            lotteprec.setVisibility(View.GONE);
                prec.setVisibility(View.GONE);
                FragmentManager fragmentManager = getSupportFragmentManager();
                Precaution precFragment  = new Precaution();

                fragmentManager.beginTransaction().replace(R.id.container, precFragment).commit();

            }
        });
    }
}
