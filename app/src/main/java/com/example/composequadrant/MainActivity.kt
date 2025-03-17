package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //ComposeQuadrant() called
                }
            }
        }
    }
}

//@Composable
//ComposeQuadrant()
@Composable

//2 columns: each column has 2 rows
//reach row: title, description, background color (and modifier for weight?)
//entire quads(start, end, top, bottom): padding 15dp
//center align content vertically/horizontally in each quad
//text1: bold, bottom padding 15dp
//text2: default font size

@Composable
//private function for each attribute of the quadrant:
//title: string
//description: string
//background color: color
//modifiers: Modifier (padding, font bold, text alignment)
//alignments: center and horizontal center

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    ComposeQuadrantTheme {
        //ComposeQuadrant() called
    }
}