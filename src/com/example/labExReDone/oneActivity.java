package com.example.labExReDone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

/**
 * Created by Kev on 22/10/2015.
 */
public class oneActivity extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oneactivity);
        Button  butn2;
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        butn2 = (Button) findViewById(R.id.butn2);
        double array[] = new double[5];

        array[0]=bundle.getDouble("1");
        array[1]=bundle.getDouble("2");
        array[2]=bundle.getDouble("3");
        array[3]=bundle.getDouble("4");
        array[4]=bundle.getDouble("5");

        Arrays.sort(array);
        double max,min,sum;
       // System.out.print(array[0]);
        max = array[4];
        min = array[0];
        sum = array[0]+array[1]+array[2]+array[3]+array[4];
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText("Max = "+max+"\nSum"+sum+"\nMin"+min);

        bundle.putDouble("SUM", sum);
        bundle.putDouble("MAX", max);
        bundle.putDouble("MIN", min);

        intent.putExtras(bundle);
        setResult(Activity.RESULT_OK,intent);


    }
    public void onClick(View v){
        finish();
    }
}