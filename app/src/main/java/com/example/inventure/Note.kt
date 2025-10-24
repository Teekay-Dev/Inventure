package com.example.inventure

data class Product(
    val imageUri: String = "",
    val name: String = "",
    val description: String = "",
    val price: String = "",
    val quantity: String = ""
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val content: String,
    val timestamp: Long = System.currentTimeMillis()

)
