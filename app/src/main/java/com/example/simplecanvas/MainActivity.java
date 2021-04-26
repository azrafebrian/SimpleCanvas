package com.example.simplecanvas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Canvas mCanvas;
    private Paint mPaint = new Paint();
    private Paint mPaintText = new Paint(Paint.UNDERLINE_TEXT_FLAG);
    private Bitmap mBitmap;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = findViewById(R.id.my_imageview);
        mPaint.setColor(Color.YELLOW);
        mPaintText.setColor(ResourcesCompat.getColor(getResources(),
                R.color.black, null));
        mPaintText.setTextSize(60);
    }

    public void drawSomething(View view) {
        int vWidth = view.getWidth();
        int vHeight = view.getHeight();
        mBitmap = Bitmap.createBitmap(vWidth, vHeight, Bitmap.Config.ARGB_8888);
        mImageView.setImageBitmap(mBitmap);
        mCanvas = new Canvas(mBitmap);
        mCanvas.drawColor(ResourcesCompat.getColor(getResources(),
                R.color.langit, null));
        mCanvas.drawText("Muhammad Azra Febrian", 200, 250, mPaintText);
        mCanvas.drawText("19/447141/SV/16860", 200, 330, mPaintText);

        mPaint.setColor(Color.GREEN);
        Rect mRect = new Rect();
        mRect.set(0, 1200, 1500, 2000);
        mCanvas.drawRect(mRect, mPaint);

        mPaint.setColor(Color.YELLOW);
        mRect.set(800, 900, 200, 1400);
        mCanvas.drawRect(mRect, mPaint);

        Path path = new Path();
        path.moveTo(500, 500);
        path.lineTo(800, 900);
        path.lineTo(200, 900);
        mPaint.setColor(Color.MAGENTA);
        mCanvas.drawPath(path, mPaint);

        mPaint.setColor(Color.BLUE);
        mRect.set(500, 1100, 300, 1400);
        mCanvas.drawRect(mRect, mPaint);

        mPaint.setColor(Color.WHITE);
        mRect.set(550, 1050, 750, 1250);
        mCanvas.drawRect(mRect, mPaint);

        mPaint.setColor(Color.GRAY);
        mCanvas.drawCircle(700, 1500, 30, mPaint);

        view.invalidate();

//        mPaint.setColor(Color.BLUE);
//        mPaint.setStrokeWidth(5);
//        mCanvas.drawLine(100,100,300,200, mPaint);


    }
}