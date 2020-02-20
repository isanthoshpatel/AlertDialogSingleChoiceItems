package com.example.alertdialogsinglechoiceitems

import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDialogFragment

class AlertDialogEX : AppCompatDialogFragment() {


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(activity!!)
            .setTitle("choose your single choice item")
            .setSingleChoiceItems(
                arrayOf("one", "two", "three", "four", "five"),
                0
            ) { dialog, which ->
                when (which) {
                    0 -> {
                        Toast.makeText(activity, "one", Toast.LENGTH_LONG).show()
                        dismiss()
                    }
                    1 -> {
                        Toast.makeText(activity, "two", Toast.LENGTH_LONG).show()
                        dismiss()
                    }
                    2 -> {
                        Toast.makeText(activity, "three", Toast.LENGTH_LONG).show()
                        dismiss()
                    }
                    3 -> {
                        Toast.makeText(activity, "four", Toast.LENGTH_LONG).show()
                        dismiss()
                    }
                    4 -> {
                        Toast.makeText(activity, "five", Toast.LENGTH_LONG).show()
                        dismiss()
                    }
                }
            }.create()
    }
}