package com.google.codelab.gitversioncontrol

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.codelab.gitversioncontrol.ui.theme.GitVersionControlTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GitVersionControlTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                    println("This is the second commit")
                    println("LOCAL CHANGE")
                    println("Experimental")
                    println("Hello from your friend")
                    println("CVCxbvjrek")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Column(

    ) {

        Text(
            text = "Hello $name!",
            modifier = modifier
        )


        Text(text = "picasso")
    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GitVersionControlTheme {
        Greeting("Android")
    }
}