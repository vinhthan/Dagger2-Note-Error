package com.example.dagger2noteerror

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
/*
//phai them 2 cai nay vao build.gradle k thi k dung dc Dagger
apply plugin: 'kotlin-kapt'
kapt {
    generateStubs = true
}*/
