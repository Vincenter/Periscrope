package com.example.periscrope;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class BezierActivity extends Activity {

    FavorLayout mFavorLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periscope);
        
        mFavorLayout =(FavorLayout) findViewById(R.id.zan);
        mFavorLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	
                mFavorLayout.addFavor();
            }
        });
    }
    


}
