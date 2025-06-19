package za.co.varsitycollege.st10476645.st10476645practicumexam

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Detailedscreen : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailedscreen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var songtitle = intent.getStringArrayExtra("songtitle",)
        var artistame = intent.getStringArrayExtra("artistname")
        var userrating = intent.getIntExtra("userrating")
        var usercomments = intent.getStringArrayExtra("usercomments")

        val playlistdisplaybtn = findViewById<Button>(R.id.playlistdisplaybtn)
        val playlistdisplay = findViewById<TextView>(R.id.playlistdisplay)
        val calculationbtn = findViewById<Button>(R.id.calculationbtn)
        val caldisplay = findViewById<TextView>(R.id.caldisplay)


        playlistdisplay.setOnClickListener{


        }




        /* for (i in artistname.indices)
             println(artistname[i])
         for (i in userrating.indices)
             println(userrating[i])
         for (i in usercomments.indices)
             println(usercomments[i])*/

    }
}