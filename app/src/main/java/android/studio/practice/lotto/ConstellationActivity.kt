package android.studio.practice.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ConstellationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constellation)

        val btnGoConstellation = findViewById<Button>(R.id.btnGoConstellation)

        btnGoConstellation.setOnClickListener {
            startActivity(Intent(this@ConstellationActivity, ResultActivity::class.java))
        }
    }
}