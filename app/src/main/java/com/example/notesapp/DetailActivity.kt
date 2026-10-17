package com.example.notesapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    private val TAG = "DetailActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        Log.d(TAG, "onCreate: Экран просмотра создан")

        val title = intent.getStringExtra("EXTRA_TITLE")
        val content = intent.getStringExtra("EXTRA_CONTENT")

        Log.i(TAG, "Получены данные: Заголовок = $title")

        val tvTitle = findViewById<TextView>(R.id.tvNoteTitle)
        val tvContent = findViewById<TextView>(R.id.tvNoteContent)
        val btnBack = findViewById<Button>(R.id.btnBack)

        tvTitle.text = title
        tvContent.text = content

        btnBack.setOnClickListener {
            Log.i(TAG, "Нажата кнопка Назад")
            finish()
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