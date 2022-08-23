package com.example.boldtextdemo

import android.graphics.Paint
import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.StyleSpan
import android.text.style.TextAppearanceSpan
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv3: TextView = findViewById(R.id.tv3)
        tv3.typeface = Typeface.defaultFromStyle(Typeface.BOLD)

        val tv4: TextView = findViewById(R.id.tv4)
        tv4.paint.isFakeBoldText = true

        val tv5: TextView = findViewById(R.id.tv5)
        tv5.typeface = Typeface.defaultFromStyle(Typeface.BOLD)
        tv5.paint.isFakeBoldText = true

        val tv6: TextView = findViewById(R.id.tv6)
        tv6.paint.style = Paint.Style.FILL_AND_STROKE
        tv6.paint.strokeWidth = 0.7F

        val sstv1: TextView = findViewById(R.id.sstv1)
        val ss1 = SpannableString("spannablestring中使用typeface加粗")
        ss1.setSpan(StyleSpan(Typeface.BOLD), 0, ss1.length, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
        sstv1.text = ss1

        val sstv2: TextView = findViewById(R.id.sstv2)
        val ss2 = SpannableString("spannablestring中通过style资源设置加粗")
        val textAppearanceSpan = TextAppearanceSpan(this, R.style.ssbold)
        ss2.setSpan(textAppearanceSpan, 0, ss2.length, Spannable.SPAN_INCLUSIVE_EXCLUSIVE )
        sstv2.text = ss2

        val sstv3: TextView = findViewById(R.id.sstv3)
        val ss3 = SpannableString("先设置textview，再设置ss加粗")
        sstv3.paint.style = Paint.Style.FILL_AND_STROKE
        sstv3.paint.strokeWidth = 0.7F
        ss3.setSpan(StyleSpan(Typeface.BOLD), 0, ss3.length-5, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
        sstv3.text = ss3
    }
}