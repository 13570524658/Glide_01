package com.example.glide_01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var url: String =
        "https://pics4.baidu.com/feed/a1ec08fa513d2697eef52c2b69a49cfc4316d80c.jpeg?token=8f666dece07cb92e3df444a1c7754b16"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        GlideApp.with(this)
            .load(url)
            .applyCircleAvatarImage(200, 200)
            .into(ivCircleAvatarImage)
        GlideApp.with(this)
            .load(url)
            .applyRoundAvatarImage(200, 200)
            .into(ivRoundAvatarImage)
        GlideApp.with(this)
            .load(url)
            .applyRoundImage(50, 200, 200)
            .into(ivRoundImage)
        GlideApp.with(this)
            .load(url)
            .thumbnail(0.2f)
            .applyThumbnailImage(50, 200, 200)
            .into(ivThumbnailImage)

        GlideApp.with(this)
            .load(url)
            .applyTransformImage(this, 50, 100, 80, 200, 200)
            .into(ivTransformImage)
    }
}