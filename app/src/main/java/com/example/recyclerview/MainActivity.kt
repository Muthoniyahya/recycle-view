package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContact: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayContact()
    }

    fun displayContact() {
        var rvcontact = listOf<contact>(
            contact("Iman Yahya", "muthoniyahya@gmail.com", "0115626974"),
            contact("Grace Maina", "mainagracewacheke@gmail.com", "0114509901"),
            contact("Zeddy Wambui", "zeinyasul@gmail.com", "0717062088"),
            contact("Mummy", "lydiahirungu01@gmail.com", "0715630184"),
            contact("Joyce Ndichu", "joycendichu08@gmail.com", "0798765432")

        )
        rvContact=findViewById(R.id.rvContact)
        var contactAdapter=ContactRVAdapter(rvcontact)
        rvContact.layoutManager=LinearLayoutManager(baseContext)
        rvContact.adapter=contactAdapter


    }



}
