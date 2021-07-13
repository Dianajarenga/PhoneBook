package com.example.phonebook
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContacts: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayContacts()
    }
    fun displayContacts(){
        var contactsList= listOf(
            Contacts("Zillah Mwimalli","0723456443","mwimallizillah@gmail.com"),
            Contacts("Diana Jarenga","0713357064","jarengadiana@gmail.com"),
            Contacts("Peggy Omollo","0724367675","reginaomollo@gmail.com"),
            Contacts("Kennedy Anyoso","0722232144","anyosokennedy@gmail.com"),
            Contacts("Samuel Anyoso","0725679918","anyososamuel@gmail.com")
            ,Contacts("Anita Agiso","0777135368","anitaagiso@gmail.com"),
            Contacts("Zillah Mwimalli","0723456443","mwimallizillah@gmail.com"),
            Contacts("Diana Jarenga","0713357064","jarengadiana@gmail.com"),
            Contacts("Peggy Omollo","0724367675","reginaomollo@gmail.com"),
            Contacts("Kennedy Anyoso","0722232144","anyosokennedy@gmail.com"),
            Contacts("Samuel Anyoso","0725679918","anyososamuel@gmail.com")
            ,Contacts("Anita Agiso","0777135368","anitaagiso@gmail.com")
        )
        rvContacts=findViewById(R.id.rvContacts)
        var contactsAdapter=ContactsAdapter(contactsList)
        rvContacts.layoutManager=LinearLayoutManager(baseContext)
        rvContacts.apply {
            rvContacts.layoutManager=LinearLayoutManager(baseContext)
            adapter=contactsAdapter}

    }

}
