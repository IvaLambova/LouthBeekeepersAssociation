package com.example.android.louthbeekeepersassociation;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hides the app status bar and allows for more screen size
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
    }

    //Opens Google Maps with the specified address after clicking on it
    public void openMap (View v) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=Teagasc, Dublin Rd, Marshes Upper, Dundalk, Co. Louth, Ireland");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

}



