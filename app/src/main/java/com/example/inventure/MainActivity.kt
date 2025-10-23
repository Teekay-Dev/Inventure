package com.example.inventure

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.room.Room
import com.example.inventure.NoteDatabase
import com.example.inventure.NoteRepository
import com.example.inventure.NoteViewModel
import com.example.inventure.NoteViewModelFactory
import com.example.inventure.NotesApp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //   Initialise the Room Database
        val db = Room.databaseBuilder(
            applicationContext,
            NoteDatabase::class.java,
            "note_db"
        ).build()

        val repository = NoteRepository(db.noteDao())
        val viewModelFactory = NoteViewModelFactory(repository)

        setContent {
            val noteViewModel: NoteViewModel = viewModel(factory = viewModelFactory)
            NotesApp(noteViewModel)
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DisplayNote(){
    NotesApp()
}