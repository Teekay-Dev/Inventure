package com.example.inventure

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.inventure.NoteDao

@Database(entities = [Note::class], version = 1, exportSchema = false)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
}