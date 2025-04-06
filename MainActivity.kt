package com.example.meet_249632_pract8

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val details:TextView=findViewById(R.id.details);
        var det=""
        val name:TextView=findViewById(R.id.name)

        val className:TextView=findViewById(R.id.className);
        val hb1:CheckBox=findViewById(R.id.hb1)
        val hb2:CheckBox=findViewById(R.id.hb2)
        val hb3:CheckBox=findViewById(R.id.hb3)
        val toggle:ToggleButton=findViewById(R.id.toggle);
        val btn: Button =findViewById(R.id.button1);
        val imgBtn:ImageButton=findViewById(R.id.imageButton2);
        val genderMale:RadioButton=findViewById(R.id.Male)
        val genderFemale:RadioButton=findViewById(R.id.Female)
        imgBtn.setOnClickListener{
            details.text="";
            genderMale.isChecked=false
            genderFemale.isChecked=false
            hb1.isChecked=false
            hb3.isChecked=false
            hb2.isChecked=false
            className.text=""
            name.text=""
        }
        btn.setOnClickListener{

            det+="\nName:${name.text.toString()}"
            det+="\nclass:${className.text}"
            det+="\nHobbies:"
            if(hb1.isChecked){
                det+="${hb1.text.toString()},";
            }
            if(hb2.isChecked){
                det+="${hb2.text.toString()},";
            }
            if(hb3.isChecked){
                det+="${hb3.text.toString()}";
            }
            if(genderMale.isChecked){
                det+="\n Gender:${genderMale.text}"
            }
            if(genderFemale.isChecked){
                det+="\n Gender:${genderFemale.text}"
            }

            details.text=det

        }
        toggle.setOnCheckedChangeListener { toggle,isChecked ->
            if (isChecked) {
                // Toggle ON
                Toast.makeText(this, "Toggle is ON", Toast.LENGTH_SHORT).show()
            } else {
                // Toggle OFF
                Toast.makeText(this, "Toggle is OFF", Toast.LENGTH_SHORT).show()
            }
        }


    }
}
