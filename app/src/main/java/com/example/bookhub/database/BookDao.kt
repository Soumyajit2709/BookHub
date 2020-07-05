package com.example.bookhub.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BookDao {

    @Insert
    fun insertBook(bookEntity: BookEntity)

    @Delete
    fun deleteBook(bookEntity: BookEntity)

    @Query("Select * From books")
    fun getAllBooks():List<BookEntity>

    @Query("Select * From books where book_id = :bookId")
    fun getBookById(bookId: String):BookEntity
}