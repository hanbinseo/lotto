package android.studio.practice.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.text.SimpleDateFormat
import java.util.*

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        val btnGoName = findViewById<Button>(R.id.btnGoName)
        val btnBack = findViewById<Button>(R.id.btnBack)

        btnGoName.setOnClickListener {
            startActivity(Intent(this@NameActivity, ResultActivity::class.java))
        }
        btnBack.setOnClickListener {
            finish()
        }
    }
    fun getLottoNumbersFromHash(str : String) : MutableList<Int> {
        val list = mutableListOf<Int>()

        for(number in 1..45){
            list.add(number)
        }

        val targetString = SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SS", Locale.KOREA).format(Date()) + str

        list.shuffle(Random(targetString.hashCode().toLong()))

        return list.subList(0, 6)
    }
}