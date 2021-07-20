package com.example.phonebook


import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso

class ContactsDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contacts_details_activity)

        val nameintent=intent.getStringExtra("name")
        val phoneintent=intent.getStringExtra("phoneNumber")
        val emailintent=intent.getStringExtra("email")
        val  imageintent=intent.getStringExtra("image_url").toString()

        val name =findViewById<TextView>(R.id.tvName2)
        val phone =findViewById<TextView>(R.id.tvPhoneNumber2)
        val email=findViewById<TextView>(R.id.tvEmail2)
        val image =findViewById<ImageView>(R.id.imageView2)

        name.text=nameintent
        email.text=emailintent
        phone.text=phoneintent
        Picasso.get().load(imageintent).into(image)


    }
    
}