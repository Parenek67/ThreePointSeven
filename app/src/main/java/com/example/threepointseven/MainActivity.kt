package com.example.threepointseven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment: FragmentContainerView = findViewById(R.id.fragment1)
        fragment.setOnClickListener{
            TestCheckboxDialog().show(supportFragmentManager, "tag", )
        }
    }
}
