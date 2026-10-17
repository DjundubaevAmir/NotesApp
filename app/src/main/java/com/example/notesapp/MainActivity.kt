package com.example.notesapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: Экран главного списка создан")

        val btnNote1 = findViewById<Button>(R.id.btnNote1)
        val btnNote2 = findViewById<Button>(R.id.btnNote2)
        val btnCreateNote = findViewById<Button>(R.id.btnCreateNote)

        btnNote1.setOnClickListener {
            Log.i(TAG, "Пользователь нажал на Заметку 1")

            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("EXTRA_TITLE", "Покупки на неделю")
            intent.putExtra("EXTRA_CONTENT", "1. Молоко\n2. Хлеб\n3. Яблоки\n4. Кофе")
            startActivity(intent)
        }

        btnNote2.setOnClickListener {
            Log.i(TAG, "Пользователь нажал на Заметку 2")

            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("EXTRA_TITLE", "Домашка по разроботке мобильных приложений")
            intent.putExtra("EXTRA_CONTENT", "Чиллить по кайфу")
            startActivity(intent)
        }

        btnCreateNote.setOnClickListener {
            Log.i(TAG, "Пользователь нажал кнопку создания заметки")

            val intent = Intent(this, EditActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}