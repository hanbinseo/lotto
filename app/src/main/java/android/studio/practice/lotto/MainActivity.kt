package android.studio.practice.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ConstellCardView = findViewById<CardView>(R.id.ConstellCardView)
        val NameCardView = findViewById<CardView>(R.id.NameCardView)

        ConstellCardView.setOnClickListener {
            startActivity(Intent(this@MainActivity, ConstellationActivity::class.java))
        }
        NameCardView.setOnClickListener {
            startActivity(Intent(this@MainActivity, NameActivity::class.java))
        }
    }
}