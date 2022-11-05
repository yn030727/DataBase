package com.example.database

import android.content.SharedPreferences

//首先我们通过拓展函数的方式向SharedPreferences添加了一个open函数，并且它还接收一个函数类型的参数
fun SharedPreferences.open(block:SharedPreferences.Editor.()->Unit){
    //创建一个SharedPreferences.Editor
    val editor=edit()
    //调用block方法
    editor.block()
    //将数据提交到数据表
    editor.apply()
}