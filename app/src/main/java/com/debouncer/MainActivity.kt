package com.debouncer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.format.DateFormat
import android.widget.TextView
import android.text.format.DateUtils
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        updateHeader()
    }

    fun updateHeader() {
        val format = SimpleDateFormat("E, d MMM, hh:mm aaa")
        val text =  format.format(Date())
        val header = findViewById<TextView>(R.id.header)
        header.text = text
    }
}
