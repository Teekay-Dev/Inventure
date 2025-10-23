//package com.example.inventure
//
//
//import android.R
//import android.R.attr.padding
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.items
//import androidx.compose.material3.Card
//import androidx.compose.material3.CardDefaults
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.FloatingActionButton
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.OutlinedTextField
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.material3.TextButton
//import androidx.compose.material3.TextFieldColors
//import androidx.compose.material3.TopAppBar
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.collectAsState
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun NotesApp(viewModel: NoteViewModel){
//    val notes by viewModel.notes.collectAsState()
//
//    var title by remember { mutableStateOf("") }
//    var content by remember { mutableStateOf("") }
//
//    Scaffold (
//        topBar = { TopAppBar(title = {Text("Room Notes App") }) },
//        floatingActionButton = {
//            FloatingActionButton(onClick = {
//                if (title.isNotEmpty() && content.isNotEmpty()){
//                    viewModel.addNote(title, content)
//                    title = ""
//                    content = ""
//                }
//            }) {
//                Text("+")
//            }
//        }
//    ){ padding ->
//        Column (
//            Modifier
//                .fillMaxSize()
//                .padding(padding)
//                .padding(16.dp)
//        ){
//            OutlinedTextField(
//                value = title,
//                onValueChange = {title = it},
//                label = { Text("Title")},
//                modifier = Modifier.fillMaxWidth()
//            )
//
//            Spacer(modifier = Modifier.height(8.dp))
//
//            OutlinedTextField(
//                value = title,
//                onValueChange = {content = it},
//                label = { Text("Content")},
//                modifier = Modifier.fillMaxWidth(),
//            )
//
//            Spacer(modifier = Modifier.height(16.dp))
//
//            LazyColumn {
//                items(notes){note ->
//                    NoteItem(note = note, onDelete = {viewModel.delete(note) })
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun NoteItem(note: Note, onDelete: () -> Unit){
//    Card (
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(vertical = 4.dp),
//        elevation = CardDefaults.cardElevation(4.dp)
//    ){
//        Row (
//            Modifier
//                .fillMaxWidth()
//                .padding(12.dp),
//            horizontalArrangement = Arrangement.SpaceBetween,
//            verticalAlignment = Alignment.CenterVertically
//        ){
//            Column {
//                Text(note.title, style = MaterialTheme.typography.titleMedium)
//                Text(note.content, style = MaterialTheme.typography.bodySmall)
//            }
//
//            TextButton(onClick = onDelete){
//                Text("Delete", color = MaterialTheme.colorScheme.error)
//            }
//        }
//    }
//}


