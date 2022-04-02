package com.example.constraintsetbyjson

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import com.example.constraintsetbyjson.ui.theme.ConstraintSetByJsonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConstraintSetByJsonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    Scaffold(
                        topBar = {
                            MusicTopAppBar()
                        }
                    ) {
                        MusicContent()
                    }
                }
                /*
                {
                    ConstraintLayout(
                        constraintSet= ConstraintSet(content = constraintJson),
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.White)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_launcher_background),
                            contentDescription = "",
                            modifier = Modifier.layoutId("image")
                        )
                        Text(
                            text = "Jetpack Compose",
                            color = Color.Black,
                            style = MaterialTheme.typography.h5,
                            modifier = Modifier.layoutId("texttitle")
                        )

                    }
                }
                 */
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ConstraintSetByJsonTheme {
        Greeting("Android")
    }
}