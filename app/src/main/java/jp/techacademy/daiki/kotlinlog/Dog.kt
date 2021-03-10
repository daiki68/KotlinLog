package jp.techacademy.daiki.kotlinlog

import android.util.Log

open class Dog: animal, Movable {
    //」引数付きコントラクタ
    constructor(name: String, age: Int): super(name, age) {
    }

    //Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest",this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    //Movableインターフェイスのメソッドをオーバーライド
    override fun move() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }
}