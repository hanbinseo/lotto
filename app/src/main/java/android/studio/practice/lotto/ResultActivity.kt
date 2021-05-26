package android.studio.practice.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = intent.getIntegerArrayListExtra("result") ?: return

        val result_sorted = result?.sortedBy { it }

        val lottoBallImage1stId = R.drawable.ball_01
//        val lottoBallImage2ndId = R.drawable.ball_02
//        val lottoBallImage3rdId = R.drawable.ball_03
        val imageView1 = findViewById<ImageView>(R.id.imageView2)
        val imageView2 = findViewById<ImageView>(R.id.imageView3)
        val imageView3 = findViewById<ImageView>(R.id.imageView4)
        val imageView4 = findViewById<ImageView>(R.id.imageView6)
        val imageView5 = findViewById<ImageView>(R.id.imageView8)
        val imageView6 = findViewById<ImageView>(R.id.imageView9)

        imageView1.setImageResource(lottoBallImage1stId + result_sorted[0] - 1)
        imageView2.setImageResource(lottoBallImage1stId + result_sorted[1] - 1)
        imageView3.setImageResource(lottoBallImage1stId + result_sorted[2] - 1)
        imageView4.setImageResource(lottoBallImage1stId + result_sorted[3] - 1)
        imageView5.setImageResource(lottoBallImage1stId + result_sorted[4] - 1)
        imageView6.setImageResource(lottoBallImage1stId + result_sorted[5] - 1)
    }
}