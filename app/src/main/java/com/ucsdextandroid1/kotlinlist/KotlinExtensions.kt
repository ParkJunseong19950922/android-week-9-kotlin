package com.ucsdextandroid1.kotlinlist

import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.Placeholder
import com.squareup.picasso.Picasso

/**
 * Created by rjaylward on 2019-06-08
 */

//TODO viewgroup inflate extension
fun ViewGroup.inflate(layoutResID: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutResID, this, attachToRoot)
}


//TODO picasso extension
fun ImageView.loadImageUrl(url: String?, placeholder: Drawable = ColorDrawable(Utils.randomColor())): Unit {
    Picasso.get().load(url).placeholder(placeholder).into(this)
}