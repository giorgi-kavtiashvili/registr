package com.example.registration1


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton


class MainActivity : AppCompatActivity() {

    private lateinit var name: EditText
    private lateinit var surname: EditText
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var registration: AppCompatButton
    private lateinit var CheckBoxx: CheckBox


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.Name)
        surname = findViewById(R.id.Surname)
        password = findViewById(R.id.Password)
        email = findViewById(R.id.Email)
        registration = findViewById(R.id.Registration)
        CheckBoxx = findViewById(R.id.Check)

        registration.setOnClickListener {

            val firstName = name.text.toString().trim()
            val lastname = surname.text.toString().trim()
            val paroli = password.text.toString().trim()
            val mail = email.text.toString().trim()
            val checkboxi = CheckBoxx.text.toString().trim()



            if (firstName.isEmpty()) {
                name.error = "გთხოვთ შეიყვანეთ სახელი"
                return@setOnClickListener
            } else if (firstName.length <= 3) {
                name.error = "გთხოვთ შეიყვანეთ მინიმუმ 3 სიმბოლო"
                return@setOnClickListener
            } else if (lastname.isEmpty()) {
                surname.error = "გთხოვთ შეიყვანეთ გვარი"
                return@setOnClickListener
            } else if (lastname.length <= 5) {
                surname.error = "გთხოვთ შეიყვანეთ მინიმუმ 5 სიმბოლო"
                return@setOnClickListener
            } else if (paroli.isEmpty()) {
                password.error = "გთხოვთ შეიყვანეთ პაროლი"
                return@setOnClickListener
            } else if (paroli.length < 8) {
                password.error = "გთხოვთ შეიყვანეთ მინიმუმ 8 სიმბოლო"
                return@setOnClickListener

            } else if (mail.isEmpty()) {
                email.error = "გთხოვთ შეიყვანეთ მეილი"
                return@setOnClickListener
            } else if (!mail.contains("@")) {
                email.error = "გთხოვთ შეიყვანეთ სწორი მეილი"
                return@setOnClickListener
            } else if (!mail.contains(".")) {
                email.error = "გთხოვთ შეიყვანეთ სწორი მეილი"
                return@setOnClickListener
            } else if (!CheckBoxx.isChecked) {
                Toast.makeText(this, "გთხოვთ დაეთანხმეთ წესებსა და პირობებს", Toast.LENGTH_LONG)
                    .show()


            } else {
                Toast.makeText(this, "მიმდინარეობს გადახდა", Toast.LENGTH_SHORT).show()

            }


        }




    }

}

