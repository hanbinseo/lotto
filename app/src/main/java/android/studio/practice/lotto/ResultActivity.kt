package android.studio.practice.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = intent.getIntegerArrayListExtra("result") ?: return
        val strConstellation = intent.getStringExtra("constellation")

        val result_sorted = result?.sorted()

        strConstellation?.let{
            val resultLabel = findViewById<TextView>(R.id.resultLable)
            resultLabel.setText("${strConstellation}의 ${SimpleDateFormat("yyyy년 MM월 dd일").format(Date())} 로또 번호입니다")
        }

        val imageView1 = findViewById<ImageView>(R.id.imageView2)
        val imageView2 = findViewById<ImageView>(R.id.imageView3)
        val imageView3 = findViewById<ImageView>(R.id.imageView4)
        val imageView4 = findViewById<ImageView>(R.id.imageView6)
        val imageView5 = findViewById<ImageView>(R.id.imageView8)
        val imageView6 = findViewById<ImageView>(R.id.imageView9)

        val lottoBallImage1stId = R.drawable.ball_01

        imageView1.setImageResource(lottoBallImage1stId + result_sorted[0] - 1)
        imageView2.setImageResource(lottoBallImage1stId + result_sorted[1] - 1)
        imageView3.setImageResource(lottoBallImage1stId + result_sorted[2] - 1)
        imageView4.setImageResource(lottoBallImage1stId + result_sorted[3] - 1)
        imageView5.setImageResource(lottoBallImage1stId + result_sorted[4] - 1)
        imageView6.setImageResource(lottoBallImage1stId + result_sorted[5] - 1)
    }
}
