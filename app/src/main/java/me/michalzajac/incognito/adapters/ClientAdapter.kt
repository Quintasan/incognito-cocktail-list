package me.michalzajac.incognito.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import me.michalzajac.incognito.R
import me.michalzajac.incognito.models.Client

class ClientAdapter(val clientList: List<Client>) : RecyclerView.Adapter<ClientAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClientAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ClientAdapter.ViewHolder, position: Int) {
        holder.bindItems(clientList[position])
    }

    override fun getItemCount(): Int {
        return clientList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(client: Client) {
            val textViewName = itemView.findViewById(R.id.client_name) as TextView
            val textViewDescription = itemView.findViewById(R.id.client_description) as TextView
            textViewName.text = client.name
            textViewDescription.text = client.description
        }
    }
}