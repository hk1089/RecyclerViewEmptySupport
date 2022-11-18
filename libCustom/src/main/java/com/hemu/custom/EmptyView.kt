package com.hemu.custom

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView

class EmptyView : RelativeLayout {

    constructor(context: Context) : super(context)
    constructor(context: Context, attributes: AttributeSet) : super(context, attributes)
    constructor(context: Context, attributes: AttributeSet, defStyle: Int) : super(
        context,
        attributes,
        defStyle
    )

    init {

        val layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        setBackgroundColor(android.R.attr.colorBackground)
        setPadding(40, 40, 40, 40)
        setLayoutParams(layoutParams)
        val params1 = LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
        val params2 = LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
        val imView = AppCompatImageView(context)
        imView.id = View.generateViewId()
        imView.adjustViewBounds = true
        imView.setImageResource(R.drawable.ic_no_data)
        imView.scaleType = ImageView.ScaleType.FIT_CENTER
        val tvView = AppCompatTextView(context)
        tvView.text = "No Data Found"
        tvView.textSize = 20f
        tvView.setTextColor(Color.RED)
        tvView.setTypeface(null, Typeface.BOLD)
        params1.bottomMargin = 150
        params1.addRule(CENTER_IN_PARENT, TRUE)
        params2.addRule(BELOW, imView.id)
        params2.addRule(CENTER_HORIZONTAL, TRUE)
        addView(imView, params1)
        addView(tvView, params2)
    }


}