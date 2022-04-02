package com.example.constraintsetbyjson


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet

@Composable
fun MusicContent() {
    ConstraintLayout(
        constraintSet = ConstraintSet(content = musiclayoutjson),
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Image(
            painter = painterResource(id = R.mipmap.maike),
            contentDescription = "",
            modifier = Modifier.layoutId("logo"),
            contentScale = ContentScale.Crop
        )
        Text(
            text = "天堂",
            color = Color.Black,
            style = MaterialTheme.typography.h6,
            modifier = Modifier.layoutId("song")
        )
        Text(
            text = "蓝蓝的天空 轻轻的湖水",
            color = Color.Black,
            style = MaterialTheme.typography.h6,
            modifier = Modifier.layoutId("words")
        )
        Icon(
            painter = painterResource(id = R.mipmap.up),
            contentDescription = "",
            tint = Color.Unspecified,
            modifier = Modifier.layoutId("maike")
        )
        Text(
            text = "00:10",
            color = Color.Black,
            style = MaterialTheme.typography.subtitle2,
            modifier = Modifier.layoutId("starttime")
        )
        Text(
            text = "07:04",
            color = Color.Black,
            style = MaterialTheme.typography.subtitle2,
            modifier = Modifier.layoutId("endtime")
        )
        LinearProgressIndicator(
            progress = 0.1f,
            color = Color.Blue,
            backgroundColor = Color.LightGray.copy(alpha = 0.3f),
            modifier = Modifier.layoutId("progressbar")
        )
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.layoutId("itemleft")
        ) {
            Icon(painter = painterResource(id = R.mipmap.left), contentDescription = "")
        }
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.layoutId("itemup")
        ) {
            Icon(painter = painterResource(id = R.mipmap.last), contentDescription = "")
        }
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.layoutId("itemstart")
        ) {
            Icon(
                painter = painterResource(id = R.mipmap.play),
                contentDescription = "",
                tint = Color.Unspecified,
                modifier = Modifier.size(40.dp)
            )
        }
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.layoutId("itemnext")
        ) {
            Icon(painter = painterResource(id = R.mipmap.next), contentDescription = "")
        }
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.layoutId("itemright")
        ) {
            Icon(painter = painterResource(id = R.mipmap.playlist), contentDescription = "")
        }
    }
}


