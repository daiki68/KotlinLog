package jp.techacademy.daiki.kotlinlog

import android.util.Log

abstract class animal {
    //プロパティ
    var name: String
    var age: Int

    //引数付きコントラクタ
    constructor(name:String, age: Int) {
        this.name = name
        this.age = age
    }

    abstract fun say()
}