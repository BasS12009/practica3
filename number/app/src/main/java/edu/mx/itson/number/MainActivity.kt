package edu.mx.itson.number

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var minValue=0
    var maxValue=0
    var num:Int=0
    var won=false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val guessings: TextView =findViewById(R.id.guessings)
        val down: Button = findViewById(R.id.down)
        val up: Button = findViewById(R.id.up)
        val generate: Button = findViewById(R.id.generate)
        val guessed: Button = findViewById(R.id.guessed)

        generate.setOnClickListener{
            
        num= Random. nextInt(minValue, maxValue) 
        guessings.setText(num.tostring())
        generate.visibility= View.INVISIBLE
        guessed.visibility=View.VISIBLE
        }
         up.setOnClickListener { it: View!
        minValue=num
        if(checkingLimits)){
        num=Random. nextInt(minValue, maxValue)
         guessings.setText(num.toStringO)
        }else{
guessings.setText("No puede ser;(me ganaste)")
｝
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
