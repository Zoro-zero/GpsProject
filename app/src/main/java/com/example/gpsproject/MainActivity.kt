package com.example.gpsproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gpsproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btnTst.setOnClickListener {
                //val intent = Intent()
             /*   intent.action = Intent.ACTION_VIEW
                intent.data= Uri.parse("geo "+shirina.text.toString() +" , "+dolgota.text.toString())*/
                val gmmIntentUri = Uri.parse("geo:"+shirina.text.toString()+","+dolgota.text.toString())
                val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
                startActivity(mapIntent)



            }
        }

    }
}