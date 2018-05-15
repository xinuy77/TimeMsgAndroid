package com.example.xion.timemessage

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class AMsgFragment: Fragment() {
    private val TAG                         = "Available Message Fragment"
    private var recyclerView: RecyclerView? = null
    private var adapter: MessageAdapter?    = null
    private var messageList                 = ArrayList<Message>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view         = inflater.inflate(R.layout.a_msg_fragment, container, false)
        var recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        var adapter: MessageAdapter? = null

        recyclerView.setHasFixedSize(true)                             // to fixed size
        recyclerView.layoutManager = LinearLayoutManager(view.context) // vertical recycler view

        messageList.add(Message(1, "Whats up?", "John", "01/01/2018", "This is John"))
        messageList.add(Message(1, "Whats up?", "John", "01/01/2018", "This is John"))

        adapter              = MessageAdapter(messageList, view.context)
        recyclerView.adapter = adapter
        this.recyclerView    = recyclerView
        this.adapter         = adapter

        return view
    }
}