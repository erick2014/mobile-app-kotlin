package com.example.egarcia.holamundo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.egarcia.holamundo.others.ControlFlow
import com.example.egarcia.holamundo.others.Operators
import com.example.egarcia.holamundo.others.Variables

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Variables().showCases()
        Operators().showCases()
        ControlFlow().showCases()
    }
}
