package me.michalzajac.incognito
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import me.michalzajac.incognito.adapters.ClientAdapter
import me.michalzajac.incognito.models.Client
import me.michalzajac.incognito.models.Cocktail

class ClientsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater!!.inflate(R.layout.clients_fragment_layout, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayout.VERTICAL, false)
        val clients = ArrayList<Client>()
        val cocktails = ArrayList<Cocktail>()
        clients.add(Client("Carlos", "Pedał, dzieci jebau", cocktails))
        val adapter = ClientAdapter(clients)
        recyclerView.adapter = adapter
        return view
    }
}