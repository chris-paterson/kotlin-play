package com.github.chris_paterson.kotlinplay

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private class Student(val name: String, val age: Int)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = Student("Chris", 24)
        val student2 = Student(name = "Chris", age = 24)
        val student3 = Student(age = 24, name = "Chris")

        for (i in 0..100) {
            if (i % 5 == 0 && i % 3 == 0) {
                Log.i("FizzBuzz", i.toString())
            } else if (i % 3 == 0) {
                Log.i("Fizz", i.toString())
            } else if (i % 5 == 0) {
                Log.i("Buzz", i.toString())
            } else {
                Log.i("none", i.toString())
            }
        }
    }
}
