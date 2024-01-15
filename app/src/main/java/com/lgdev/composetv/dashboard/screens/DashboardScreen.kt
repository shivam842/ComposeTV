package com.lgdev.composetv.dashboard.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

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

    //banner view

}

@Composable
fun TrendingListView(modifier: Modifier = Modifier) {


}

@Composable
fun TopListView(modifier: Modifier = Modifier) {


}