package com.gamecodeschool.ar_userinterface

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var btnGetStarted: Button?= null;
    private var tvSlogan: TextView?= null;
    private var tvQuote: TextView?= null;
    private var tvName: TextView?= null;
    private var imgLogo: ImageView?= null;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)

        tvName =findViewById(R.id.tvName)as TextView
        tvQuote =findViewById(R.id.tvQuote)as TextView
        tvSlogan =findViewById(R.id.tvSlogan)as TextView
        btnGetStarted =findViewById(R.id.btnGetStarted)as Button
        imgLogo =findViewById(R.id.imgLogo)as ImageView


        btnGetStarted!!.setOnClickListener{
            val intent=Intent(this@MainActivity,SignupActivity::class.java)
            startActivity(intent)
        }

    }


}
