package za.co.varsitycollege.st10476645.st10476645practicumexam

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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

        val songtitle = arrayListOf<String>(R.id.songtitle.toString())
        val artistname = arrayListOf<String>(R.id.artistname.toString())
        val rating = arrayListOf<String>(R.id.rating.toString())
        val comments = arrayListOf<String>(R.id.comments.toString())


        val addtoplaylistbtn = findViewById<Button>(R.id.addtoplaylistbtn)
        val exitbtn = findViewById<Button>(R.id.exitbtn)
        val details = findViewById<Button>(R.id.detailsbtn)

        for (ind)






    }
}