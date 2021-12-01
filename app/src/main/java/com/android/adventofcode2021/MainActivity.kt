package com.android.adventofcode2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AdventDay1().part1(getInput("day1"))
    }

    private fun getInput(fileName: String) = assets.open(fileName)
            .bufferedReader()
            .readText()
            .replace("\r", "")
            .split("\n")
            .map { it.toInt() }

}