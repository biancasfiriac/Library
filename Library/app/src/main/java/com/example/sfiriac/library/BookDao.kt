package com.example.sfiriac.library

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

/**
 * Created by sfiriac on 2/21/2018.
 */
@Dao
interface BookDao {

    @Query("SELECT * FROM book")
    fun getAll(): List<Book>

    @Insert
    fun insertAll(books: List<Book>)

    @Insert
    fun insertOne(book: Book)
}