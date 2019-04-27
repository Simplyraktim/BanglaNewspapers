package com.das.raktim.banglanewspapers;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class BingFragment extends Fragment {

    public WebView myweb;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_google, container, false);
        myweb = (WebView) v.findViewById(R.id.myViewId);

        myweb.loadUrl("http://www.prothom-alo.com/sports");

        // Enable Javascript
        WebSettings webSettings = myweb.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        myweb.setWebViewClient(new WebViewClient());

        myweb.setWebViewClient(new WebViewClient() {

            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {

                myweb.loadUrl("file:///android_asset/error.html");


                myweb.setOnKeyListener(new View.OnKeyListener() {
                    public boolean onKey(View v, int keyCode, KeyEvent event) {
                        if ((keyCode == KeyEvent.KEYCODE_BACK) && myweb.canGoBack()) {
                            myweb.clearFocus();
                            return true;
                        }
                        return false;
                    }
                });



            }


        });
        return v;
    }
}

