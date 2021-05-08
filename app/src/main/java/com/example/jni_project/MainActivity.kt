package com.example.jni_project

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    init {

        System.loadLibrary("native-lib")
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun randomize(): Int

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.onlyYou)
        tv.text = "sometext"

        val fab = findViewById<FloatingActionButton>(R.id.fab)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "JNI random number: ${randomize()}", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

    }

}