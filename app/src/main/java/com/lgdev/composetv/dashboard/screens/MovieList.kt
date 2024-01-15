@file:OptIn(ExperimentalTvMaterial3Api::class)

package com.lgdev.composetv.dashboard.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.tv.foundation.lazy.list.TvLazyRow
import androidx.tv.foundation.lazy.list.items
import androidx.tv.material3.Card
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Text
import coil.compose.rememberAsyncImagePainter

data class Item(val name: String, val url: String)

@Composable
fun MovieList(list: List<Item>) {
    TvLazyRow(
        Modifier
            .fillMaxWidth()
            .height(200.dp),
        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 20.dp)
    ) {
        items(list) {
            MovieListItem(it.name, it.url)
        }

    }
}

@Composable
fun MovieListItem(name: String, url: String) {

    val imagePainter = rememberAsyncImagePainter(
        url
    )

    Card(onClick = {}, modifier = Modifier
        .padding(10.dp)
        .clickable { }
        .onFocusChanged { focusState ->
            when {
                focusState.isFocused -> {
                    println("I'm focused!")
                }
                focusState.hasFocus ->
                    println("A child of mine has focus!")
            }
        }
    ) {
        Box(
            modifier = Modifier
                .height(200.dp)
                .width(300.dp)
        ) {
            Image(
                painter = imagePainter,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .width(300.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = name,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(16.dp),
                style = TextStyle(
                    fontSize = 25.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold

                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MovieList() {
    val tempList = mutableListOf<Item>()
    tempList.add(
        Item(
            "hitman",
            "https://fastly.picsum.photos/id/914/200/300.jpg?hmac=djDZMbEp4lAfV3xSWxRKuN19XXc-ILyhtGfoXFLyjuA"
        )
    );
    tempList.add(
        Item(
            "red",
            "https://www.kasandbox.org/programming-images/avatars/marcimus-orange.png")
    )
    tempList.add(
        Item(
            "lord of the ring",
            "https://www.kasandbox.org/programming-images/avatars/duskpin-tree.png"
        )
    )
    tempList.add(
        Item(
            "lord of the ring-2",
            "https://fastly.picsum.photos/id/914/200/300.jpg?hmac=djDZMbEp4lAfV3xSWxRKuN19XXc-ILyhtGfoXFLyjuA"
        )
    )
    tempList.add(
        Item(
            "lord of the ring-4",
            "https://fastly.picsum.photos/id/914/200/300.jpg?hmac=djDZMbEp4lAfV3xSWxRKuN19XXc-ILyhtGfoXFLyjuA"
        )
    )
    MovieList(tempList)
}
fun onItemClicked(item: String) {
    Log.e("TAG", "onItemClicked: " )
    Log.e("TAG", "onItemClicked: 1111111111111111111111" )
}


