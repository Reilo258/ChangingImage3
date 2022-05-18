package com.example.naocene

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var nextbtn = findViewById<Button>(R.id.nextbtn)
        var prevbtn = findViewById<Button>(R.id.prevbtn)
        var obraz = findViewById<ImageView>(R.id.obraz)
        var text = findViewById<TextView>(R.id.maintxt)
        var vis = findViewById<CheckBox>(R.id.visBox)
        var przezBox = findViewById<CheckBox>(R.id.przezBox)
        var przezTxt = findViewById<EditText>(R.id.przezTxt)

        var licznik = 1;
        obraz.setImageResource(R.drawable.piesel);
        text.text = "Pies";

        prevbtn.setOnClickListener {
            if(licznik == 1)
                licznik = 5;
            else
                licznik -= 1;

            if(licznik == 1) {
                obraz.setImageResource(R.drawable.piesel);
                text.text = "Pies";
            }
            else if(licznik == 2) {
                obraz.setImageResource(R.drawable.kotel);
                text.text = "kot";
            }
            else if(licznik == 3) {
                obraz.setImageResource(R.drawable.baron);
                text.text = "Red Baron";
            }
            else if(licznik == 4) {
                obraz.setImageResource(R.drawable.pz_5);
                text.text = "Panzerkampfwagen V";
            }
            else if(licznik == 5) {
                obraz.setImageResource(R.drawable.pz_6);
                text.text = "Panzerkampfwagen VI";
            }
        }

        nextbtn.setOnClickListener {
            if(licznik == 5)
                licznik = 1;
            else
                licznik += 1;

            if(licznik == 1) {
                obraz.setImageResource(R.drawable.piesel);
                text.text = "Pies";
            }
            else if(licznik == 2) {
                obraz.setImageResource(R.drawable.kotel);
                text.text = "kot";
            }
            else if(licznik == 3) {
                obraz.setImageResource(R.drawable.baron);
                text.text = "Red Baron";
            }
            else if(licznik == 4) {
                obraz.setImageResource(R.drawable.pz_5);
                text.text = "Panzerkampfwagen V";
            }
            else if(licznik == 5) {
                obraz.setImageResource(R.drawable.pz_6);
                text.text = "Panzerkampfwagen VI";
            }
        }

        vis.setOnClickListener {
            if(vis.isChecked == true)
                obraz.isVisible = true;
            else
                obraz.isVisible = false;
        }

        przezBox.setOnClickListener {
            if(przezBox.isChecked == true) {
                var alpha = przezTxt.text;
                obraz.alpha = (alpha.toString().toFloat()/100);
            }
            else
                obraz.alpha = 1F;
        }
    }
}