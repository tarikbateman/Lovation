package com.example.lovation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)


        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnClick = findViewById<Button>(R.id.btnLogin)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        btnClick.setOnClickListener {
            if(TextUtils.isEmpty(etEmail.text.toString()) || TextUtils.isEmpty(etPassword.text.toString())){
                Toast.makeText(this@MainActivity, "Its a toast!", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this@MainActivity, "Login", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, success::class.java)
                    startActivity(intent)
            }
        }

        btnRegister.setOnClickListener{
                Toast.makeText(this@MainActivity, "Register", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, register_page::class.java)
                startActivity(intent)

        }
    }
}



