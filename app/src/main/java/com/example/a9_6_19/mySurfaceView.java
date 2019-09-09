package com.example.a9_6_19;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class mySurfaceView extends SurfaceView {

    private int radius;

    public mySurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);

        //tell android to call my draw function, so I can actually draw something
        setWillNotDraw(false); //IMPORTANT double negative makes it draw

        radius=0;
    }

    public void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5.0f);

        canvas.drawCircle(200, 200, radius, paint);
    }

    public void setRadius(int r) {
        radius = r;
        this.invalidate();
    }
}
