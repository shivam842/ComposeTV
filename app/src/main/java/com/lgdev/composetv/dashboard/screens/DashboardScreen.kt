@file:OptIn(ExperimentalTvMaterial3Api::class, ExperimentalTvMaterial3Api::class)

package com.lgdev.composetv.dashboard.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Text

@Composable
fun DashboardScreen(modifier: Modifier = Modifier) {

    // banner
    // 1. list .
    // 2. list
   Column(modifier = modifier.fillMaxSize()) {

        BannerView()

        TrendingListView()

        TopListView()
    }

}

@Composable
fun BannerView(modifier: Modifier = Modifier) {

    val items = remember { mutableIntStateOf(1) }

    //banner view
    Carousel(items.value)
}

@Composable
fun TrendingListView(modifier: Modifier = Modifier) {
    val list: List<Item> = remember {
        mutableListOf()
    }
    Column(
        modifier = modifier
            .wrapContentHeight()
            .fillMaxWidth()
    ) {
        Text(text = " Trending Movies")
        //MovieList(list)
        MovieList()
    }

}

@Composable
fun TopListView(modifier: Modifier = Modifier) {
    val list: List<Item> = remember {
        mutableListOf()
    }
    Column(
        modifier = modifier
            .wrapContentHeight()
            .fillMaxWidth()
    ) {
        Text(text = "Today's top Movies")
        //MovieList(list)
        MovieList()
    }
}