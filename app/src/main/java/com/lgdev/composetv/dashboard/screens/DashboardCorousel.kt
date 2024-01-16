@file:OptIn(ExperimentalTvMaterial3Api::class)

package com.lgdev.composetv.dashboard.screens

import androidx.compose.animation.ContentTransform
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.tv.material3.Card
import androidx.tv.material3.CarouselDefaults
import androidx.tv.material3.CarouselState
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Text
import com.bumptech.glide.Glide


@Composable
fun Carousel(
    url: String?,
    slideCount: Int,
    modifier: Modifier = Modifier,
    carouselState: CarouselState = remember { CarouselState() },
    autoScrollDurationMillis: Long = CarouselDefaults.TimeToDisplayItemMillis,
    contentTransformForward: ContentTransform = CarouselDefaults.contentTransform,
    contentTransformBackward: ContentTransform = CarouselDefaults.contentTransform,
    carouselIndicator: @Composable BoxScope.() -> Unit = {
        CarouselDefaults.IndicatorRow(
            itemCount = slideCount,
            activeItemIndex = carouselState.activeItemIndex,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(16.dp),
        )
    },
) {

    val context = LocalContext.current
    Card(
        onClick = {
            //
        },
        modifier = Modifier
    ) {

        /*val painter = remember(url) {
            BitmapPainter(
                image = remember(url) {
                    Glide.with(context)
                        .asBitmap()
                        .load(url)
                        .submit()
                        .get()
                }.asImageBitmap()            )
        }

        Text(text = "")

        Image(
            painter = painter,
            contentDescription = null,
            modifier = modifier.size(200.dp, 200.dp) // Set your desired size
        )*/

    }

}