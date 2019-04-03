package com.android.myactivty

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_move_activity.setOnClickListener{
            val intent = Intent(this,MoviActivity::class.java)
            startActivity(intent)
        }
        btn_move_activity_data.setOnClickListener{
            val intent = Intent(this, move_activity_with_data::class.java)
            intent.putExtra("Username","Adytya")
            intent.putExtra("password",1234567890)
            intent.putExtra("Alamat", "Ds.Sumberejo Kec.Jaken")
            intent.putExtra("Tanggal Lahir","Pati, 5 Juli 1998")
            startActivity(intent)
        }
        btn_dial_number.setOnClickListener {
            val phoneNumber = "082322738645"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

    }
}



