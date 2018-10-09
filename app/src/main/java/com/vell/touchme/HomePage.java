package com.vell.touchme;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class HomePage extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.homepage);
    }
     public void buttonOnCLick_Mode(View v) {
         Button button = (Button) v;
         Intent intent = new Intent(HomePage.this, ModePage.class);
         startActivity(intent);

     }
    public void buttonOnCLick_HighScore(View v) {
        Button button1 = (Button) v;
        ((Button) v).setText("clicked");
    }
}
