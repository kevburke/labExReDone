package com.example.labExReDone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    TextView textView;
    TextView answers;
    Button but1;
    Button butn2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        but1 = (Button) findViewById(R.id.but1);
        butn2 = (Button)findViewById(R.id.butn2);
        answers = (TextView) findViewById(R.id.answers);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText("Numbers used 200, 300, 400, 500, 600");
    }

    public void onClick(View view) {
        Intent intent = new Intent(MyActivity.this, oneActivity.class);
        Bundle bundle = new Bundle();

        bundle.putDouble("1", 200);
        bundle.putDouble("2", 300);
        bundle.putDouble("3", 400);
        bundle.putDouble("4", 500);
        bundle.putDouble("5", 600);

        intent.putExtras(bundle);
        startActivityForResult(intent, 101);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // try{
        if (resultCode == Activity.RESULT_OK){
            if (requestCode == 101){
                Bundle result = data.getExtras();
                double sum = result.getDouble("SUM");
                double max = result.getDouble("MAX");
                double min = result.getDouble("MIN");
                answers.setText("Sum"+ sum +"\n"+"Max"+max+"\n"+"Min"+min);

            }
        }
        else {
            // user pressed the BACK button
            answers.setText("Selection CANCELLED!");
        }
        // }
        //catch (Exception e) {
        // Toast.makeText(getBaseContext(), e.getMessage(),
        // Toast.LENGTH_LONG).show();

        //}
    }


}
