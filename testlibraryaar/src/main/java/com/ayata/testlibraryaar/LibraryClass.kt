package com.ayata.testlibraryaar

import android.content.Context
import android.widget.Toast

class LibraryClass(private val context: Context) {
    fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}
