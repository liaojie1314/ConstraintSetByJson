package com.example.constraintsetbyjson


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MusicTopAppBar() {
    TopAppBar(
        title = {
            Text(
                text = "Welcome U",
                color = Color.Black,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        },
        backgroundColor = Color.White,
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(painter = painterResource(id = R.mipmap.back), contentDescription = "")
            }
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(painter = painterResource(id = R.mipmap.menu), contentDescription = "")
            }
        },
        elevation = 0.dp
    )
}

@Preview
@Composable
fun MusicTopAppBarPreview() {
    MusicTopAppBar()
}

