package com.example.notesapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class EditActivity : AppCompatActivity() {

    private val TAG = "EditActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)
        Log.d(TAG, "onCreate: Экран создания заметки создан")

        val etTitle = findViewById<EditText>(R.id.etNoteTitle)
        val etContent = findViewById<EditText>(R.id.etNoteContent)
        val btnSave = findViewById<Button>(R.id.btnSave)

        btnSave.setOnClickListener {
            val title = etTitle.text.toString()
            val content = etContent.text.toString()

            if (title.isEmpty()) {
                Log.w(TAG, "Пользователь пытается сохранить заметку без заголовка")
                Toast.makeText(this, "Введите заголовок заметки!", Toast.LENGTH_SHORT).show()
            } else {
                Log.i(TAG, "Заметка успешно создана: $title")

                val intent = Intent(this, DetailActivity::class.java)
                intent.putExtra("EXTRA_TITLE", title)
                intent.putExtra("EXTRA_CONTENT", content)
                startActivity(intent)

                finish()
            }
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