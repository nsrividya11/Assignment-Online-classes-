package com.example.kotlin1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val act_online_class = findViewById<TextView>(R.id.act_online_class)

        act_online_class.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,BranchActivity::class.java)
            startActivity(intent)
            finish()
        })
    }
}