package com.example.news.presentation.Intro

import androidx.annotation.DrawableRes
import androidx.compose.ui.res.painterResource
import com.example.news.R

data class Page(
    val title: String,
    val desc: String,
    @DrawableRes val image: Int
)

val pages = listOf<Page>(
    Page(
        title = "Stay Informed, Anytime",
        desc = "Get the latest news from trusted sources around the world. Follow the stories that matter to you — all in one app",
        image = R.drawable.img_onboarding1
    ),
    Page(
        title = "Stay Informed, Anytime",
        desc = "Get the latest news from trusted sources around the world. Follow the stories that matter to you — all in one app",
        image = R.drawable.img_onboarding1
    ),
    Page(
        title = "Stay Informed, Anytime",
        desc = "Get the latest news from trusted sources around the world. Follow the stories that matter to you — all in one app",
        image = R.drawable.img_onboarding1
    ),
)



