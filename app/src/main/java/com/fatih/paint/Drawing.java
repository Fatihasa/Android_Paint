package com.fatih.paint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;

public class Drawing extends View {

    Paint paint = new Paint();
    Path path = new Path();

    public Drawing(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawPath(path,paint);
        super.onDraw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        float x = event.getX();
        float y = event.getY();
        path.addCircle(x,y,10,Path.Direction.CW);
        invalidate();
        return true;
    }
}
