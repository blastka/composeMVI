package com.example.commvvm.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.Observer


class MainActivity : AppCompatActivity() {

    private val viewModel: ItemViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Row {
                Text(text = "kokee")
                Text(text = "hello")
                Text(text = "alufalifa")
            }
        }
        viewModel.selectedItem.observe(this, Observer { item ->
            setContent {
                NewTextTwo()
            }
        })
    }
}

@Preview(showBackground = true)
@Composable
fun NewText(){
    Text(text = "hello")
}

@Composable
fun NewTextTwo(){
    Text(text = "hello all")
}