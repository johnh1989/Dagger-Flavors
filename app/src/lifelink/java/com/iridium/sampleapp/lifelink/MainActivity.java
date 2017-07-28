package com.iridium.sampleapp.lifelink;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.iridium.sampleapp.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    String greeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LifeLinkComponent component = (LifeLinkComponent) ((App)getApplication()).component();
        component.inject(this);
        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(greeting);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivityLifeLink", "string val is: " + greeting);
        Toast.makeText(this, getApplication().getPackageName(), Toast.LENGTH_LONG).show();
    }
}
