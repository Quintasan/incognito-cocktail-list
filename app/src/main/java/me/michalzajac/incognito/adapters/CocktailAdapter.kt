package me.michalzajac.incognito.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import me.michalzajac.incognito.R
import me.michalzajac.incognito.models.Cocktail

class CocktailAdapter(val cocktailList: List<Cocktail>) : RecyclerView.Adapter<CocktailAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CocktailAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: CocktailAdapter.ViewHolder, position: Int) {
        holder.bindItems(cocktailList[position])
    }

    override fun getItemCount(): Int {
        return cocktailList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(cocktail: Cocktail) {
            val textViewName = itemView.findViewById(R.id.client_name) as TextView
            val textViewDescription = itemView.findViewById(R.id.client_description) as TextView
            textViewName.text = cocktail.name
            textViewDescription.text = cocktail.description
        }
    }
}