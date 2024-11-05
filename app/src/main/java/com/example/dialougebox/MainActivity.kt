package com.example.dialougebox

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dialougebox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Simple dialogue box
        binding.btn1.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Do You Want To Exit")
            builder1.setMessage("Are You sure")
            builder1.setIcon(android.R.drawable.ic_dialog_alert)

            builder1.setPositiveButton("Yes", { dialogInterface, which ->
                // Yes pe click kra to kya hona chahiye
                finish()
            })
            builder1.setNegativeButton("No", { dialogInterface, which ->
                // No ke click kra to kya hona chahiye
            })
            builder1.show()
        }
        // Option wala dialogue box
        binding.btn2.setOnClickListener {
            val options = arrayOf("java", "c", "kotlin", "python")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Select Language")
            builder2.setSingleChoiceItems(options, 0, { dialogInterface, which ->
                // Kisi option pe click hone pe kya option hona chahiye
                Toast.makeText(this, "Clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
                // which is a itterator
            })
            builder2.setPositiveButton("Submit", { dialogInterface, which ->
                // Yes pe click kra to kya hona chahiye
                finish()
            })
            builder2.setNegativeButton("Decline", { dialogInterface, which ->
                // No ke click kra to kya hona chahiye
            })
            builder2.show()
        }
        binding.btn3.setOnClickListener {
            val options = arrayOf("java", "c", "kotlin", "python")
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("Select Language")
            builder3.setTitle("Select Language")
            builder3.setMultiChoiceItems(options,null , { dialogInterface, which, isChecked ->

                Toast.makeText(this, "Clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder3.setPositiveButton("Submit", { dialogInterface, which ->
                // Yes pe click kra to kya hona chahiye
                finish()
            })
            builder3.setNegativeButton("Decline", { dialogInterface, which ->
                // No ke click kra to kya hona chahiye
            })
            builder3.show()

        }
    }
}