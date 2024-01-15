package com.lgdev.composetv.dashboard.screens

import android.graphics.Bitmap
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.tv.foundation.lazy.list.TvLazyRow
import androidx.tv.foundation.lazy.list.items
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.MaterialTheme
import androidx.tv.material3.Text
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

data class Item(val name:String,val url:String)
@ExperimentalTvMaterial3Api
@Composable
fun MovieList(list: List<Item>) {
    TvLazyRow(
        Modifier
            .fillMaxWidth()
            .height(200.dp),
        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 20.dp)
    ) {
        items(list){
            MovieListItem(it.name,it.url)
        }

    }
}
@ExperimentalTvMaterial3Api
@Composable
fun MovieListItem(name:String,url:String) {
    val requestOptions = RequestOptions().centerCrop() // Customize Glide options if needed
    val context = LocalContext.current
    val imageBitmap:Bitmap = remember(url) {
        Glide.with(context)
            .asBitmap()
            .load(url)
            .apply(requestOptions)
            .submit()
            .get()
    }

    Box(modifier = Modifier
        .height(200.dp)
        .width(300.dp)) {
        Image(
            bitmap = imageBitmap.asImageBitmap(),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .width(300.dp)

        )
        Text(
            text = name,
            style = MaterialTheme.typography.headlineSmall
        )


    }
}
@ExperimentalTvMaterial3Api
@Preview(showBackground = true, device = Devices.TV_1080p)
@Composable
fun MovieList(){
    val tempList = mutableListOf<Item>()
    tempList.add(Item("hitman","https://www.kasandbox.org/programming-images/avatars/spunky-sam.png"));
    tempList.add(Item("red","https://www.kasandbox.org/programming-images/avatars/spunky-sam.png"));
    tempList.add(Item("lord of the ring","https://www.kasandbox.org/programming-images/avatars/spunky-sam.png"));
    MovieList(tempList)
}



