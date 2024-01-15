@file:OptIn(ExperimentalTvMaterial3Api::class)

package com.lgdev.composetv.dashboard.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.tv.foundation.lazy.list.TvLazyRow
import androidx.tv.material3.ExperimentalTvMaterial3Api

@Composable
fun DashboardScreen(modifier: Modifier = Modifier) {

    // banner
    // 1. list .
    // 2. list

    Column {

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


}

@Composable
fun TopListView(modifier: Modifier = Modifier) {


}