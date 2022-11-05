package com.example.database

import android.content.ContentValues

//功能性上虽然用不到高阶函数的知识，但我们可以结合高阶函数对代码进行更进一步的优化
//KTX库中同样提供了同样功能的方法，叫做contentValuesOf()方法
fun cvOf(vararg pairs:Pair<String , Any?>)=ContentValues().apply{
    for(pair in pairs){
        val key=pair.first
        val value=pair.second
        when(value){
            is Int ->put(key,value)
            is Long ->put(key,value)
            is Short ->put(key,value)
            is Float ->put(key,value)
            is Double ->put(key,value)
            is Boolean ->put(key,value)
            is String ->put(key,value)
            is Byte ->put(key,value)
            is ByteArray ->put(key,value)
            null ->putNull(key)
        }
    }
}
