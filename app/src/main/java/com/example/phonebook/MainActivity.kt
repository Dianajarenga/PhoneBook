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
            Contacts("Zillah Mwimalli","0723456443","mwimallizillah@gmail.com","https://cdn.pixabay.com/photo/2018/01/06/09/25/hijab-3064633__340.jpg"),
            Contacts("Diana Jarenga","0713357064","jarengadiana@gmail.com","https://cdn.pixabay.com/photo/2014/12/16/22/25/sunset-570881__480.jpg"),
            Contacts("Peggy Omollo","0724367675","reginaomollo@gmail.com","https://cdn.pixabay.com/photo/2018/03/06/22/57/portrait-3204843__340.jpg"),
            Contacts("Kennedy Anyoso","0722232144","anyosokennedy@gmail.com","https://cdn.pixabay.com/photo/2015/07/13/11/56/girl-843076__340.jpg"),
            Contacts("Samuel Anyoso","0725679918","anyososamuel@gmail.com","https://cdn.pixabay.com/photo/2016/01/19/17/48/woman-1149911_960_720.jpg")
            ,Contacts("Anita Agiso","0777135368","anitaagiso@gmail.com","https://cdn.pixabay.com/photo/2014/05/03/00/56/summerfield-336672__340.jpg"),
            Contacts("Mercy Imali","0723456443","mwimallizillah@gmail.com","https://cdn.pixabay.com/photo/2017/05/13/12/40/fashion-2309519__340.jpg"),
            Contacts("Diana Jarenga","0713357064","jarengadiana@gmail.com","https://cdn.pixabay.com/photo/2015/11/06/11/32/girl-1026246__340.jpg"),
            Contacts("Peggy Omollo","0724367675","reginaomollo@gmail.com","https://cdn.pixabay.com/photo/2015/01/08/18/27/startup-593341__340.jpg"),
            Contacts("Kennedy Anyoso","0722232144","anyosokennedy@gmail.com","https://cdn.pixabay.com/photo/2017/06/05/11/01/airport-2373727__340.jpg"),
            Contacts("Samuel Anyoso","0725679918","anyososamuel@gmail.com","https://cdn.pixabay.com/photo/2014/11/17/20/55/girl-535251__340.jpg")
            ,Contacts("Anita Agiso","0777135368","anitaagiso@gmail.com","https://cdn.pixabay.com/photo/2018/08/04/20/48/woman-3584435__340.jpg")
        )
        rvContacts=findViewById(R.id.rvContacts)
        var contactsAdapter=ContactsAdapter(contactsList,baseContext)
        rvContacts.layoutManager=LinearLayoutManager(baseContext)
        rvContacts.apply {
            rvContacts.layoutManager=LinearLayoutManager(baseContext)
            adapter=contactsAdapter}

    }

}
