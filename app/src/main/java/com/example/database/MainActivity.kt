package com.example.database

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.edit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button:Button=findViewById(R.id.button1)
        button.setOnClickListener {
//            val editor = getSharedPreferences("data11",Context.MODE_PRIVATE).edit()
//            editor.putString("name","Tom")
//            editor.putInt("age",13)
//            editor.putBoolean("married",false)
//            editor.apply()
            getSharedPreferences("data",Context.MODE_PRIVATE).open{
                //整个Lmabda表达式只有一个参数，所以不需要声明变量
                putString("name","Tom")
                putInt("age",16)
                putBoolean("married",true)
            }
            //当然这种高阶函数的优化代码，已经在Google提供的KTX拓展库中进行了添加
            getSharedPreferences("data2",Context.MODE_PRIVATE).edit {
            
            }
        }
    }
}