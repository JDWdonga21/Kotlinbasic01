package com.jdwdonga.kotlinbasic01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickBtn.setOnClickListener { 
            // { } 안에 있는 코드 버튼을 눌렀을 때 실행
            Log.d("메인화면 로그", "클릭용 버튼 눌림")
        }
       
    }
}