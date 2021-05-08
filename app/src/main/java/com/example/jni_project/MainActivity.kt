package com.example.jni_project

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun Jniint(): Int

    override fun onCreate(savedInstanceState: Bundle?) {

        System.loadLibrary("native-lib") // fixme: куда вынести можно


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.onlyYou)
        tv.text = "erev0s.com"

        val fab = findViewById<FloatingActionButton>(R.id.fab)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "JNI random number: ${Jniint()}", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

    }

}