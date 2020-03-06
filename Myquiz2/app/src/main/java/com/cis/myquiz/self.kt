package com.cis.myquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_self.*

class self : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_self)

        button.setOnClickListener { View ->
            var wc = Intent(this, MainActivity::class.java)
            startActivity(wc)
    }
    }
}
