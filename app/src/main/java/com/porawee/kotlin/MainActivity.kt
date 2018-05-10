package com.porawee.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val username = "Porawee"
    val password = "1234"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val EditText = findViewById<EditText>(R.id.textUser)
        textUser.text.toString()
        textPass.text.toString()
        btnLogin.setOnClickListener {
           var check = checkLogin()
            Toast.makeText(this,""+check,Toast.LENGTH_LONG).show()
        }

    }

    private fun checkLogin() : Boolean{
        if (username == textUser.text.toString() && password == textPass.text.toString()){
            return true
        }
            return false
    }
}