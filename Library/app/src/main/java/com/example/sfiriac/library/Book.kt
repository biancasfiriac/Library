package com.example.sfiriac.library

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by sfiriac on 2/21/2018.
 */
@Entity
data class Book(@PrimaryKey var id: Int,
                var cover: Int = R.drawable.book_cover,
                var title: String = "none",
                var author: String = "none")