package za.co.varsitycollege.st10476645.st10476645practicumexam

import android.annotation.SuppressLint
import android.content.Intent
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
        val userrating = arrayListOf<String>(R.id.userrating.toString())
        val usercomments = arrayListOf<String>(R.id.usercomments.toString())



        val addtoplaylistbtn = findViewById<Button>(R.id.addtoplaylistbtn)
        val exitbtn = findViewById<Button>(R.id.exitbtn)
        val detailsbtn = findViewById<Button>(R.id.detailsbtn)



        fun playlistdetails() { for (song in songtitle) { songtitle += "$song" }
        for ( artist in artistname){ artistname += "$artist"}
        for ( rating in userrating) { userrating += "$rating"}
        for (comments in usercomments){usercomments += "$comments"} }

        addtoplaylistbtn.setOnClickListener {
            playlistdetails()
        }

        detailsbtn.setOnClickListener{
            val intent = Intent(this, Detailedscreen ::class.java)
        }








    }
}