package com.example.win8.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
                .replace(R.id.mainFrame, MainFragment.newInstance())
                .commit()
    }

    fun changeFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
                .replace(R.id.mainFrame,fragment)
                .addToBackStack(null)
                .commit()
    }
}
