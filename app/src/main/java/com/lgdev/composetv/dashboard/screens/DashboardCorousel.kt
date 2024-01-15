@file:OptIn(ExperimentalTvMaterial3Api::class)

package com.lgdev.composetv.dashboard.screens

import androidx.compose.animation.ContentTransform
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.tv.material3.CarouselDefaults
import androidx.tv.material3.CarouselState
import androidx.tv.material3.ExperimentalTvMaterial3Api



@Composable
fun Carousel(
    slideCount: Int,
    modifier: Modifier = Modifier,
    carouselState: CarouselState = remember { CarouselState() },
    autoScrollDurationMillis: Long = CarouselDefaults.TimeToDisplayItemMillis,
    contentTransformForward: ContentTransform = CarouselDefaults.contentTransform,
    contentTransformBackward: ContentTransform = CarouselDefaults.contentTransform,
    carouselIndicator:
    @Composable BoxScope.() -> Unit = {
        CarouselDefaults.IndicatorRow(
            itemCount = slideCount,
            activeItemIndex = carouselState.activeItemIndex,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(16.dp),
        )
    },
    //content: @Composable CarouselScope.(index: Int) -> Unit
) {
}