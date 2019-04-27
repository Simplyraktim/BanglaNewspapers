package com.das.raktim.banglanewspapers;


import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends AppCompatActivity{



    String link;
    WebView webView;
    SwipeRefreshLayout swipe;
    private ActionBar actionBar;
    private ProgressBar progressBar;

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.home:
                Intent homeIntent = new Intent(this, MainActivity.class);
                homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
                return super.onOptionsItemSelected(item);

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_blank);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setMax(100);
        actionBar = getActionBar();


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        swipe = (SwipeRefreshLayout)findViewById(R.id.swipe);
        swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                loadUrl();
            }
        });
        link = getIntent().getStringExtra("LINK");
        webView = (WebView) findViewById(R.id.myView1);
        System.out.println(link);
        loadUrl();

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void loadUrl(){
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAppCacheEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.loadUrl(link);
        webView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {

                progressBar.setProgress(progress);

                if (progress == 100) {

                    progressBar.setVisibility(View.GONE);
                } else {
                    progressBar.setVisibility(View.VISIBLE);
                }
                super.onProgressChanged(view, progress);
            }
        });
        webView.setWebViewClient(new WebViewClient(){

            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {

                webView.loadUrl("file:///android_asset/error.html");


            }

            public void onPageFinished(WebView view, String url) {
                // do your stuff here
                swipe.setRefreshing(false);
            }

        });

    }


    @Override
    public void onBackPressed(){

        if (webView.canGoBack()){
            webView.goBack();
        }else {
            super.onBackPressed();
        }
    }
}
