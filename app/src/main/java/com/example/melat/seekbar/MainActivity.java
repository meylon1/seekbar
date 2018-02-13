package com.example.melat.seekbar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements SeekBar.OnSeekBarChangeListener{

    //create instance variable

    private TextView textView;
    private SeekBar seekBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView =(TextView)findViewById(R.id.textView);
        seekBar =(SeekBar) findViewById(R.id.seekBar);


        //set Listener
        seekBar.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int Progress, boolean b) {
        Toast.makeText(getApplicationContext(),"seekBarProgress :" + Progress,Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        Toast.makeText(getApplicationContext(),"seekbarProgress:", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
