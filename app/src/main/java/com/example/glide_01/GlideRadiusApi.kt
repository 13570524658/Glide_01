package com.example.glide_01

import com.bumptech.glide.annotation.GlideExtension
import com.bumptech.glide.annotation.GlideOption
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.BaseRequestOptions
import com.bumptech.glide.request.RequestOptions

@GlideExtension
object GlideRadiusApi {
    //默认占位图
    private const val ICON_DEFAULT_PLACEHOLDER: Int = R.drawable.default_placeholder

    //默认加载失败
    private const val ICON_DEFAULT_ERROR: Int = R.drawable.default_error

//    @JvmStatic
//    @JvmOverloads
//    @GlideOption
//    fun cutRadius(options: BaseRequestOptions<*>, centerCrop: Boolean = true, roundingRadius: Int): BaseRequestOptions<*> {
//        return options.transform(RoundedCorners(roundingRadius),centerCrop)
//        )
//    }

    /**
     * 加载圆形头像
     * DecodeFormat.PREFER_RGB_565 比ARGB_8888格式少一半的内存
     */
    @JvmStatic
    @JvmOverloads
    @GlideOption
    fun applyCircleAvatarImage(options: BaseRequestOptions<*>): BaseRequestOptions<*> {
        val roundedCorners = RoundedCorners(360)
        //通过RequestOptions扩展功能,override:采样率,因为ImageView就这么大,可以压缩图片,降低内存消耗
        val override = RequestOptions.bitmapTransform(roundedCorners).override(300, 300)
        return options
            .centerCrop()
            .placeholder(ICON_DEFAULT_PLACEHOLDER)
            .error(ICON_DEFAULT_ERROR)
            .apply(override)
            .circleCrop()
            .format(DecodeFormat.PREFER_RGB_565)
    }

    /**
     * 加载圆角头像
     * DecodeFormat.PREFER_RGB_565 比ARGB_8888格式少一半的内存
     */
    @JvmStatic
    @JvmOverloads
    @GlideOption
    fun applyRoundAvatarImage(options: BaseRequestOptions<*>): BaseRequestOptions<*> {
        val roundedCorners = RoundedCorners(10)
        //通过RequestOptions扩展功能,override:采样率,因为ImageView就这么大,可以压缩图片,降低内存消耗
        val override = RequestOptions.bitmapTransform(roundedCorners).override(300, 300)
        return options
            .centerCrop()
            .placeholder(ICON_DEFAULT_PLACEHOLDER)
            .error(ICON_DEFAULT_ERROR)
            .apply(override)
            .format(DecodeFormat.PREFER_RGB_565)
    }

    /**
     * 加载圆角图片
     * DecodeFormat.PREFER_RGB_565 比ARGB_8888格式少一半的内存
     */
    @JvmStatic
    @JvmOverloads
    @GlideOption
    fun applyRoundImage(options: BaseRequestOptions<*>,roundedCorners:Int): BaseRequestOptions<*> {
        val roundedCorners = RoundedCorners(roundedCorners)
        //通过RequestOptions扩展功能,override:采样率,因为ImageView就这么大,可以压缩图片,降低内存消耗
        val override = RequestOptions.bitmapTransform(roundedCorners).override(300, 300)
        return options
            .centerCrop()
            .placeholder(ICON_DEFAULT_PLACEHOLDER)
            .error(ICON_DEFAULT_ERROR)
            .apply(override)
            .format(DecodeFormat.PREFER_RGB_565)
    }
}