package com.example.nisarg.harvendofday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class ClosingClac extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_closing_clac);
        Intent intent = getIntent();
        int doneVal = intent.getIntExtra("done",0);
        if(doneVal == 1){
            ImageView checkimg = findViewById(R.id.check_till1_img);
            checkimg.setVisibility(View.VISIBLE);
        }
    }

    public void till1OnClick(View view) {
        Intent intent = new Intent(this, Till_1_Calc.class);
        startActivity(intent);
    }
}
