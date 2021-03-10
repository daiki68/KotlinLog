package jp.techacademy.daiki.kotlinlog

import android.util.Log

class BigDog: Dog {

    //superで親クラスでコントラクタを呼ぶ
    constructor(name: String, age: Int): super(name, age) {
    }

    override fun say() {
        super.say()
        Log.d("kotlintest", "大きな犬です。")
    }
}