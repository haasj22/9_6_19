package com.example.a9_6_19;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class clickedButtonClass implements View.OnClickListener {

    private TextView theTextBox;
    private int clickCounter;

    public clickedButtonClass(TextView theText) {
        this.theTextBox=theText;
        clickCounter=0;
    }

    public void onClick(View v) {
        ///Location where I want to do something about my click

        Button theOneClicked = (Button)v;
        CharSequence label = theOneClicked.getText();


        if(label.charAt(0) != 'D') {
            clickCounter++;

            theTextBox.setText("You clicked the button" + clickCounter + "times");
        } else {
            theTextBox.setText("You are a bad listener");
        }
    }
}
