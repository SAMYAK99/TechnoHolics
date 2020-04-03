package com.projects.hackcorona_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class

ChatBotActvity extends AppCompatActivity {

    WebView webView1  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_bot_actvity);


        webView1 = findViewById(R.id.ChatBot_web);

        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.setWebViewClient(new WebViewClient());
        webView1.loadUrl("https://covid.apollo247.com/?utm_source=twitter&utm_medium=organic&utm_campaign=bot_scanner");


    }


}
