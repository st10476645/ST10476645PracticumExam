package za.co.varsitycollege.st10476645.st10476645practicumexam

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Detailedscreen() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Detailedscreen> {
        override fun createFromParcel(parcel: Parcel): Detailedscreen {
            return Detailedscreen(parcel)
        }

        override fun newArray(size: Int): Array<Detailedscreen?> {
            return arrayOfNulls(size)
        }
    }

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
        var artistname = intent.getStringArrayExtra("artistname")

        var usercomments = intent.getStringArrayExtra("usercomments")

        val playlistdisplaybtn = findViewById<Button>(R.id.playlistdisplaybtn)
        val playlistdisplay = findViewById<TextView>(R.id.playlistdisplay)
        val calculationbtn = findViewById<Button>(R.id.calculationbtn)
        val caldisplay = findViewById<TextView>(R.id.caldisplay)


        playlistdisplay.setOnClickListener {
            if (songtitle != null) {
                for (i in songtitle.indices)
                    println(songtitle[i])
                if (artistname != null) {
                    for (i in artistname.indices)
                        println(artistname[i])
                    if (usercomments != null) {
                        for (i in usercomments.indices)
                            println(usercomments[i])

                    }


                }
            }





        }}}
