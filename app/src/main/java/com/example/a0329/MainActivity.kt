package com.example.a0329

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , View.OnTouchListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        img.setOnTouchListener(this)
    }

    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        if (event?.action == MotionEvent.ACTION_DOWN) {
            img.setImageResource(R.drawable.pu1)
        }
        else if (event?.action == MotionEvent.ACTION_UP) {
            img.setImageResource(R.drawable.pu0)
        }
        else if (event?.action == MotionEvent.ACTION_MOVE) {
            img.setImageResource(R.drawable.pu2)
        }

        return true
    }
}
