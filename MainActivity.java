package com.example.hafiz.radio_buttons;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onRadioButtonClicked(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();  //is a button checked?

        switch(view.getId())
        {
            case R.id.radioButton:
                if (checked)
                {
                    //output EXCELLENT

                    TextView button1textView = (TextView)findViewById(R.id.textView2);
                    button1textView.setText("Your Opinion is: Excellent");
                }
                break;
            case R.id.radioButton2:
                if (checked)
                {
                    //output Good
                    TextView button2textView = (TextView)findViewById(R.id.textView2);
                    button2textView.setText("Your Opinion is: Good");
                }
                break;
            case R.id.radioButton3:
                if (checked)
                {
                    //output Average
                    TextView button3textView = (TextView)findViewById(R.id.textView2);
                    button3textView.setText("Your Opinion is: Average");
                }
                break;
            case R.id.radioButton4:
                if (checked)
                {
                    //output Poor
                    TextView button1textView = (TextView)findViewById(R.id.textView2);
                    button1textView.setText("Your Opinion is: Poor");
                }
                break;
        }
    }
}

