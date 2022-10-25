package com.jdwdonga.kotlinbasic01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        문법 연습
        //변수 만들기
        val myName : String // value : 상수
        var myAge : Int //variable : 변수
        var mySex : Boolean

        myName = "정동욱이야"
//        myName = "쿠짱" (오류 발생 상수라서 변경 불가)
        myAge = 34
        myAge = 35

        val yourName = "문땡땡 씨" // 생성 + 대입 => 초기화 , 보통은 이렇게 쓴다.
        var yourAge = 25 // 생성 + 대입 => 초기화 , 보통은 이렇게 쓴다.
        
//       조건문 연습
//       나이를 확인해서 -> 성인인지 /아닌지
        if(yourAge < 20){
            Log.d("성인인증", yourName+"는 꼬맹이입니다.")
        }
        else if(yourAge < 30){
            Log.d("성인인증", yourName+"는 성인입니다.")
        }
        else{
            Log.d("성인인증",yourName+"는 노땅입니다.")
        }
        
        clickBtn.setOnClickListener { 
            // { } 안에 있는 코드 버튼을 눌렀을 때 실행
            Log.d("메인화면 로그", "클릭용 버튼 눌림")
            Log.e("메인화면로그", "에러 관련 로그")
            Log.d("메인화면 로그", myName)
        }

        smallBtn.setOnClickListener {
            Toast.makeText(this, "작은버튼이 눌렸다.", Toast.LENGTH_SHORT).show()
        }
       
    }
}