package com.epicodus.adventcalendar;

import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener{
    @Bind(R.id.redImageView) ImageView mRed;
    @Bind(R.id.billyImageView) ImageView mBilly;
    @Bind(R.id.ribbonImageView) ImageView mRibbon;
    @Bind(R.id.snowImageView) ImageView mSnow;
    @Bind(R.id.starImageView) ImageView mStar;
    @Bind(R.id.greenImageView) ImageView mGreen;
    @Bind(R.id.twoImageView) ImageView mTwo;
    @Bind(R.id.elfImageView) ImageView mElf;

    private GestureDetectorCompat mDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mRed.setOnClickListener(this);
        mBilly.setOnClickListener(this);
        mSnow.setOnClickListener(this);
        mStar.setOnClickListener(this);
        mGreen.setOnClickListener(this);
        mTwo.setOnClickListener(this);
        mRibbon.setOnClickListener(this);

        mDetector = new GestureDetectorCompat(this,this);
        mDetector.setOnDoubleTapListener(this);

        mElf.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mDetector.onTouchEvent(motionEvent);
                return true;
            }

        });

    }

    @Override
    public void onClick(View view) {
        if (view == mRed) {
            // Do something
        }

        if (view == mBilly) {

        }

        if (view == mSnow) {

        }

        if (view == mStar) {

        }

        if (view == mGreen) {

        }

        if (view == mTwo) {

        }

        if (view == mRibbon) {

        }

        if (view == mElf) {

        }
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        Toast.makeText(MainActivity.this, "Double Tap", Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
//        Toast.makeText(MainActivity.this, "OnScroll", Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {}

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        Toast.makeText(MainActivity.this, "Fling", Toast.LENGTH_SHORT).show();
        return true;
    }
}
