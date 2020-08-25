package com.example.glide_01

import android.content.ContextWrapper
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        GlideApp.with(this)
            .load("https://pics4.baidu.com/feed/a1ec08fa513d2697eef52c2b69a49cfc4316d80c.jpeg?token=8f666dece07cb92e3df444a1c7754b16")
            .applyCircleAvatarImage()
            .into(ivCircleAvatarImage)
        GlideApp.with(this)
            .load("https://pics4.baidu.com/feed/a1ec08fa513d2697eef52c2b69a49cfc4316d80c.jpeg?token=8f666dece07cb92e3df444a1c7754b16")
            .applyRoundAvatarImage()
            .into(ivRoundAvatarImage)
        GlideApp.with(this)
            .load("https://pics4.baidu.com/feed/a1ec08fa513d2697eef52c2b69a49cfc4316d80c.jpeg?token=8f666dece07cb92e3df444a1c7754b16")
            .applyRoundImage(50)
            .into(ivRoundImage)
    }
}