package com.gamecodeschool.ar_userinterface

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {
    private var imageView: ImageView?= null;
    private var etUsername: EditText?= null;
    private var etEmailAddress: EditText?= null;
    private var etPhone: EditText?= null;
    private var etPassword: EditText?= null;
    private var btnDropdown: Button?= null;
    private var btnSignup: Button?= null;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        etUsername =findViewById(R.id.etUsername)as EditText
        etEmailAddress =findViewById(R.id.etEmailAddress)as EditText
        etPhone =findViewById(R.id.etPhone)as EditText
        etPassword =findViewById(R.id.etPassword)as EditText
        btnDropdown =findViewById(R.id.btnDropdown)as Button
        btnSignup =findViewById(R.id.btnSignup)as Button
        imageView =findViewById(R.id.imageView)as ImageView


        btnDropdown!!.setOnClickListener{
            val intent= Intent(this@SignupActivity,SpinnerActivity::class.java)
            startActivity(intent)
        }
    }

}
