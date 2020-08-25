package com.example.glide_01

import android.R.attr.radius
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var url: String =
        "https://pics4.baidu.com/feed/a1ec08fa513d2697eef52c2b69a49cfc4316d80c.jpeg?token=8f666dece07cb92e3df444a1c7754b16"
    var gifUrl: String =
        "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3483554974,2412255306&fm=26&gp=0.jpg"

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
        // "14":模糊度；"3":图片缩放3倍后再进行模糊，缩放3-5倍个人感觉比较好。
        GlideApp.with(this)
            .load(url)
            .applyTransformImage(this, 50, 14, 3, 200, 200)
            .into(ivTransformImage)
        GlideApp.with(this)
            .asGif()
            .load(gifUrl)
            .applyGifImage(50, 200, 200)
            .into(ivGifImage)

    }
}