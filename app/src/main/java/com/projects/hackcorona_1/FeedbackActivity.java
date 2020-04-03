package com.projects.hackcorona_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FeedbackActivity extends AppCompatActivity {

      WebView webView  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

          webView = findViewById(R.id.web);

          webView.getSettings().setJavaScriptEnabled(true);
          webView.setWebViewClient(new WebViewClient());

          webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSf8JB6nKQPPYP7NixgI9jtZfJmnm1TGhOF82ilCWwnPbWm8EQ/viewform");
    }
}
