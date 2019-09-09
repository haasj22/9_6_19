package com.example.a9_6_19;

import android.widget.SeekBar;
import android.widget.TextView;

public class TheSeekBarListener implements SeekBar.OnSeekBarChangeListener{

    private TextView theTextBox;
    private mySurfaceView theSV;

    public TheSeekBarListener(TextView theText, mySurfaceView aSV) {
        theTextBox=theText;
        theSV = aSV;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        theTextBox.setText("" + i);

        //Want to tell the surface view what the progress is
        theSV.setRadius(i);


    }


    public void onStartTrackingTouch(SeekBar seekBar) {

    }


    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
