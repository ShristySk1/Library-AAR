package com.ayata.testlibraryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ayata.testlibraryaar.LibraryClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val test=LibraryClass(this)
        test.showToast("This is a toast message.")
    }
}