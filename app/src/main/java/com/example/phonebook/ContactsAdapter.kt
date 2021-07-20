package com.example.phonebook

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactsAdapter (var contactsList: List<Contacts>, var context:Context):RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list,parent,false)
        return ContactsViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContact=contactsList.get(position)
        holder.tvName.text=currentContact.Name
        holder.tvPhoneNumber.text=currentContact.PhoneNumber
        holder.tvEmail.text=currentContact.Email
        holder.cvContact.setOnClickListener{
            val intent=Intent(
                context,ContactsDetailsActivity::class.java)
            intent.putExtra("name",currentContact.Name)
            intent.putExtra("phone",currentContact.PhoneNumber)
            intent.putExtra("email",currentContact.Email)
            intent.putExtra("image",currentContact.imageUrl)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            Toast.makeText(context,"name",Toast.LENGTH_LONG).show()
            Toast.makeText(context,"phone",Toast.LENGTH_LONG).show()
            Toast.makeText(context,"email",Toast.LENGTH_LONG).show()

            context.startActivity(intent)
        }


        Picasso.get()
            .load(currentContact.imageUrl)
            .resize(80,80)
            .centerCrop()
            .into( holder.ivContact)

    }

    override fun getItemCount(): Int {
        return contactsList.size
    }
}
class ContactsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvPhoneNumber=itemView.findViewById<TextView>(R.id.tvPhoneNumber)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
    var ivContact=itemView.findViewById<ImageView>(R.id.ivContact)
    var cvContact=itemView.findViewById<CardView>(R.id.cvContact)

}
