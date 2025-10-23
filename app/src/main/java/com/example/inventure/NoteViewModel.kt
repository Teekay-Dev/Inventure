package com.example.inventure

//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import kotlinx.coroutines.flow.SharingStarted
//import kotlinx.coroutines.flow.stateIn
//import kotlinx.coroutines.launch
//
//class NoteViewModel(private val repository: NoteRepository) : ViewModel() {
//    val notes = repository.allNotes.stateIn(
//        viewModelScope,
//        SharingStarted.WhileSubscribed(5000),
//        emptyList()
//    )
//
//    fun addNote(title: String, content: String){
//        viewModelScope.launch{
//            repository.addNote(Note(title = title, content = content))
//        }
//    }
//
//    fun delete(note: Note){
//        viewModelScope.launch{
//            repository.delete(note)
//        }
//    }
//
//    fun clearAll(){
//        viewModelScope.launch{
//            repository.clearAll()
//        }
//    }
//
//
//}