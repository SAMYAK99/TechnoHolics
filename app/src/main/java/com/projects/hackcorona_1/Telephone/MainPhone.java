package com.projects.hackcorona_1.Telephone;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.projects.hackcorona_1.R;

public class MainPhone extends AppCompatActivity {

    String s1[] , s2[] ;
    int  img[] = {R.drawable.phone2,R.drawable.phone2,R.drawable.phone2,R.drawable.phone2,R.drawable.phone2,R.drawable.phone2,R.drawable.phone2,
            R.drawable.phone2,R.drawable.phone2,R.drawable.phone2,R.drawable.phone2,R.drawable.phone2,R.drawable.phone2,R.drawable.phone2,
            R.drawable.phone2,R.drawable.phone2,R.drawable.phone2,R.drawable.phone2,R.drawable.phone2,R.drawable.phone2,R.drawable.phone2,
            R.drawable.phone2,R.drawable.phone2,R.drawable.phone2,R.drawable.phone2,R.drawable.phone2,R.drawable.phone2,R.drawable.phone2,};
     RecyclerView recyclerView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        recyclerView = findViewById(R.id.recycler);

        s1 = getResources().getStringArray(R.array.State_Name);
        s2 = getResources().getStringArray(R.array.Phone_Numbers);

         MyAdapter myAdapter = new MyAdapter(this,s1,s2,img);
                 recyclerView.setAdapter(myAdapter);
                 recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}
