package com.example.inventure

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.inventure.NoteRepository
import com.example.inventure.NoteViewModel
import kotlin.jvm.java

class NoteViewModelFactory(private  val repository: NoteRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(NoteViewModel::class.java)) {
            NoteViewModel(repository) as T
        }else{
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}