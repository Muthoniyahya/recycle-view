package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactRVAdapter (var contactsList: List<contact>): RecyclerView.Adapter<ContactRVAdapter.ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact = contactsList.get(position)
        holder.tvName.text=currentContact.name
        holder.tvphoneNumner.text=currentContact.Email
        holder.tvEmail.text=currentContact.PhoneNumber
    }
    override fun getItemCount(): Int {
        return contactsList.size

    }
    class ContactViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvName=itemView.findViewById<TextView>(R.id.tvNameLbl)
        var tvphoneNumner=itemView.findViewById<TextView>(R.id.tvphoneNumberLbl)
        var tvEmail=itemView.findViewById<TextView>(R.id.tvemailLBl)
    }

}