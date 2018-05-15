package com.example.xion.timemessage

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.content.Context
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast

class MessageAdapter(messageList: List<Message>, context: Context): RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {
    private val context     = context
    private var messageList = messageList

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int):MessageViewHolder {
        var inflater = LayoutInflater.from(context)
        var view     = inflater.inflate(R.layout.list_layout, parent, false)

        return MessageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return messageList.size
    }

    // maps UI and messageList
    override fun onBindViewHolder(holder: MessageViewHolder?, position: Int) {
        val message = messageList[position]

        holder?.senderText?.text = message.text
        holder?.titleText?.text  = message.title
        holder?.a_dateText?.text = message.availableDate
    }

    // UI obj; what each card holds
    class MessageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var senderText = itemView.findViewById<TextView>(R.id.sender)
        var titleText  = itemView.findViewById<TextView>(R.id.title)
        var a_dateText = itemView.findViewById<TextView>(R.id.availableDate)
        init {
            itemView.setOnClickListener {
                Toast.makeText(itemView.context, "Tapped" + titleText.text, Toast.LENGTH_SHORT).show()
            }
        }
    }
}