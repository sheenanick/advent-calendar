package com.epicodus.adventcalendar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

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

    MediaPlayer merryChristmas;
    MediaPlayer bahHumbug;

    private GestureDetector mDetector;
    private GestureDetector mRibbonGesture;


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

        mDetector = new GestureDetector(this,this);
        mDetector.setOnDoubleTapListener(this);


//
//        GestureDetector ribbonGesture = new GestureDetector() {
//            @Override
//            public boolean onDoubleTap(MotionEvent e) {
//                mElf.setVisibility(View.VISIBLE);
//                return true;
//            }
//        };
//
//        mRibbonGesture = new GestureDetector(this, ribbonGesture);
        //


        merryChristmas = MediaPlayer.create(this, R.raw.merrychristmas);
        bahHumbug = MediaPlayer.create(this, R.raw.bahhumbug);

        mElf.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mDetector.onTouchEvent(motionEvent);

                return true;
            }

        });


        mRibbon.setOnTouchListener(new View.OnTouchListener() {
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
//        Toast.makeText(MainActivity.this, motionEvent.toString(), Toast.LENGTH_SHORT).show();
        merryChristmas.start();
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        mElf.setVisibility(View.VISIBLE);
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
    public void onLongPress(MotionEvent motionEvent) {
        mElf.setVisibility(View.GONE);
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
//        Toast.makeText(MainActivity.this, "Fling", Toast.LENGTH_SHORT).show();
        bahHumbug.start();
        return true;
    }
}
