package com.example.a9_6_19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //find the object from the layout
        Button clickThisButton = (Button)findViewById(R.id.ClickThisButton);

        //Need to find the text box so I can give it to the listener to modify later
        TextView theTextBox = findViewById(R.id.InfoTextView);


        //Link the object to some code-based functionality
        //First we create the listener object, then finally we can
        clickedButtonClass theClickButtonListener= new clickedButtonClass(theTextBox);

        //finally we can link the istener to the button
        clickThisButton.setOnClickListener(theClickButtonListener);

        //for my second Button, find it and then set the listener
        Button lameButton= (Button)findViewById(R.id.lameButton);
        lameButton.setOnClickListener(theClickButtonListener);

        //STILL IN MAIN ACTIVITY

        SeekBar theSeekBar = (SeekBar)findViewById(R.id.seekBar);

        TheSeekBarListener tempListener= new TheSeekBarListener((TextView)findViewById(R.id.valueTextView),
                (mySurfaceView)findViewById(R.id.surfaceView));

        theSeekBar.setOnSeekBarChangeListener(tempListener);

        //STILL IN MAIN ACTIVITY


    }
}
