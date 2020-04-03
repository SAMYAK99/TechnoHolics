package com.projects.hackcorona_1.Telephone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import com.projects.hackcorona_1.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

             String data1[] , data2[]  ;
               int images[] ;
               Context context ;


      public  MyAdapter (Context ct , String s1[] , String s2[] , int img[]){
                  data1 =s1 ;
                   data2  =s2 ;
                   images = img;
                   context = ct ;

      }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row,parent,false);
            return  new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.mytxt1.setText(data1[position]);
        holder.mytxt2.setText(data2[position]);
        holder.img.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return data1.length ;
    }

    public class MyViewHolder  extends RecyclerView.ViewHolder{

           TextView mytxt1 , mytxt2 ;
           ImageView img;
        public MyViewHolder(@NonNull View itemView) {


            super(itemView);

            mytxt1   = itemView.findViewById(R.id.state_txt);
            mytxt2 = itemView.findViewById(R.id.phone_txt);
            img = itemView.findViewById(R.id.phn_img);

        }
    }
}
