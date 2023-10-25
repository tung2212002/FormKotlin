package com.example.form

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var isNewOp = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRegister = findViewById<Button>(R.id.buttonRegister)
        buttonRegister.setOnClickListener {
            if (!isDataValid()) {
                showToast("Please fill in all the required information and accept the terms.")
            } else {
            }
        }
    }

    private fun isDataValid(): Boolean {
        val editFirstName = findViewById<EditText>(R.id.editFirstName)
        val editLastName = findViewById<EditText>(R.id.editLastName)
        val radioMale = findViewById<RadioButton>(R.id.radioMale)
        val radioFemale = findViewById<RadioButton>(R.id.radioFemale)
        val editEmail = findViewById<EditText>(R.id.editEmail)
        val editAddress = findViewById<EditText>(R.id.editAddress)
        val radioButton3 = findViewById<RadioButton>(R.id.radioButton3)

        return editFirstName.text.isNotEmpty() &&
                editLastName.text.isNotEmpty() &&
                (radioMale.isChecked || radioFemale.isChecked) &&
                editEmail.text.isNotEmpty() &&
                editAddress.text.isNotEmpty() &&
                radioButton3.isChecked
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}