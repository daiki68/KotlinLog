package jp.techacademy.daiki.kotlinlog

import android.util.Log

class Human: animal, Thinkable {

    var hobby: String

    constructor(name: String, age: Int, hobby: String): super(name, age) {
        this.hobby = hobby
    }
        override fun say() {
            Log.d("kotlintest", "私の名前は" + this.name + "です。")
            Log.d("kotlintest", "年は" + this.age + "歳です。")
        }


        override fun think() {
            Log.d("kotlintest", "私は" + this.hobby + "について考える。")
        }
    }