package com.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val etNumber1 = findViewById<EditText>(R.id.etNumber1).text
        val etNumber2 = findViewById<EditText>(R.id.etNumber2).text
        val tvResult = findViewById<TextView>(R.id.tvResult)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSub = findViewById<Button>(R.id.btnSub)
        val btnMult = findViewById<Button>(R.id.btnmultiplication)
        val btnDiv = findViewById<Button>(R.id.btnDivision)

        btnAdd.setOnClickListener{
            val result = etNumber1. toString().toInt() + etNumber2.toString().toInt()
            tvResult.text = "Result is" + result.toString()

            btnSub.setOnClickListener{
                val result = etNumber1.toString().toInt() - etNumber2.toString().toInt()
                tvResult.text = "Result is" + result.toString()

                btnMult.setOnClickListener{
                    val result = etNumber1.toString().toInt() * etNumber2.toString().toInt()
                    tvResult.text = "Result is" + result.toString()

                    btnDiv.setOnClickListener{
                        val result = etNumber1.toString().toInt() / etNumber2.toString().toInt()
                        tvResult.text = "Result is" + result.toString()


                    }
                }



            }
        }

    }
}