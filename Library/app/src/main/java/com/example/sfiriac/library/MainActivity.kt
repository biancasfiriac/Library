package com.example.sfiriac.library

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

/**
 * Created by sfiriac on 2/21/2018.
 */

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.books_recycler_view)
        val list = ArrayList<Book>()
        mockBooksList(list)
        LibraryDatabase.getAppDatabase(this).bookDao().getAll()

        val adapter = BooksAdapter(list)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this) as RecyclerView.LayoutManager?
    }

    private fun mockBooksList(list: ArrayList<Book>) {
        list.add(Book(1, R.drawable.book_cover, "Pride and Prejudice", "Jane Austin"))
        list.add(Book(2, R.drawable.book_cover, "The Mockingjay", "Suzanne Collins"))
        list.add(Book(3, R.drawable.book_cover, "The Book Thief", "Markus Zusak"))
        list.add(Book(4, R.drawable.book_cover, "Harry Potter", "J. K. Rowling"))
        list.add(Book(5, R.drawable.book_cover, "Paper Princess", "Erin Watt"))
        list.add(Book(6, R.drawable.book_cover, "A Monster Calls", "Patrick Ness"))
        list.add(Book(7, R.drawable.book_cover, "Marx's Concept of Man", "Erich Fromm"))
        list.add(Book(8, R.drawable.book_cover, "Emma", "Charlotte Bronte"))
    }



}
