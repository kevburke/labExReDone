package com.example.labExReDone;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Kev on 27/10/2015.
 */
public class twoActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twoactivity);

        TextView editText;
        TextView  editText2;
        TextView  editText3;
        TextView  editText4;
        TextView  editText5;
        Button butn3;

        editText = (TextView)findViewById(R.id.editText);
        editText2 = (TextView) findViewById(R.id.editText2);
        editText3 = (TextView) findViewById(R.id.editText3);
        editText4 = (TextView) findViewById(R.id.editText4);
        editText5 = (TextView) findViewById(R.id.editText5);
        butn3 = (Button) findViewById(R.id.butn3);

    }
}