package android.studio.practice.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import androidx.cardview.widget.CardView
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val RandomCardView = findViewById<CardView>(R.id.RandomCardView)
        val ConstellCardView = findViewById<CardView>(R.id.ConstellCardView)
        val NameCardView = findViewById<CardView>(R.id.NameCardView)

        RandomCardView.setOnClickListener {
            val intent = Intent(this@MainActivity, ResultActivity::class.java)
            intent.putIntegerArrayListExtra("result", ArrayList(getShuffledLottoNumbers()))
            startActivity(intent)
        }
        ConstellCardView.setOnClickListener {
            startActivity(Intent(this@MainActivity, ConstellationActivity::class.java))
        }
        NameCardView.setOnClickListener {
            startActivity(Intent(this@MainActivity, NameActivity::class.java))
        }
    }
    fun getRandomLottoNumber():Int{
        return Random().nextInt(45)+1
    }

    fun getRandomLottoNumbers():MutableList<Int>{
        val lottoNumbers = mutableListOf<Int>()

        while (true){
            var number : Int = getRandomLottoNumber()
            var flag_existing : Int = 0
            for(j in 0..lottoNumbers.size){
                if(lottoNumbers.contains(number)){
                    flag_existing = 1
                    break
                }
            }
            if (flag_existing.equals(1))
                continue
            else
        lottoNumbers.add(number)
        if(lottoNumbers.size >= 6)
                break
        }
        return lottoNumbers
    }
    fun getShuffledLottoNumbers() : MutableList<Int>{
        val list = mutableListOf<Int>()

        for(number in 1..45){
            list.add(number)
        }
        list.shuffle()

        return list.subList(0, 6)
    }
}