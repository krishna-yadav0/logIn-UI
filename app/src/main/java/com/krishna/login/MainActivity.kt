package com.krishna.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var forgotPassword:TextView
    lateinit var logIn: Button
    lateinit var signUp : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        email = findViewById(R.id.emailEditText)
        password= findViewById(R.id.passwordEditText)
        forgotPassword= findViewById(R.id.txtForgot)
        logIn= findViewById(R.id.btnLogIn)
        signUp = findViewById(R.id.signUp)

        signUp.setOnClickListener {
            val intent = Intent(this@MainActivity, SignUpActivity::class.java)
            startActivity(intent)

        }

    }
}