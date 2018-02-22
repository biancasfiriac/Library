package com.example.sfiriac.library

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.Room
import android.content.Context


/**
 * Created by sfiriac on 2/21/2018.
 */
@Database(entities = arrayOf(Book::class), version = 1)
abstract class LibraryDatabase : RoomDatabase() {

    companion object {
        @JvmStatic
        private var INSTANCE: LibraryDatabase? = null

        @JvmStatic
        fun getAppDatabase(context: Context): LibraryDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(), LibraryDatabase::class.java!!, "user-database")
                        // allow queries on the main thread.
                        // Don't do this on a real app! See PersistenceBasicSample for an example.
                        .allowMainThreadQueries()
                        .build()
            }
            return INSTANCE as LibraryDatabase
        }
    }

    abstract fun bookDao(): BookDao

}