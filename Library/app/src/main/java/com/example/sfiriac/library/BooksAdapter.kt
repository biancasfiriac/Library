package com.example.sfiriac.library

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by sfiriac on 2/21/2018.
 */
class BooksAdapter(private val list: List<Book>) : RecyclerView.Adapter<BooksAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksAdapter.ViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.book_card_view, parent, false)
        val card = view.findViewById(R.id.card_view) as CardView
        card.radius = 5.0F
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: BooksAdapter.ViewHolder, position: Int) {
        var song : Book = list.get(position)
        holder.titleTextView.text = song.title
        holder.authorTextView.text = song.author
        holder.coverImageView.setImageResource(song.cover)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var titleTextView: TextView = itemView.findViewById(R.id.text_view_book_title) as TextView
        var authorTextView: TextView = itemView.findViewById(R.id.text_view_book_author) as TextView
        var coverImageView: ImageView = itemView.findViewById(R.id.image_view_book_cover) as ImageView

    }

}