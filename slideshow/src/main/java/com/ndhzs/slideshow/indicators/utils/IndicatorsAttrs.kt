package com.ndhzs.slideshow.indicators.utils

import android.content.res.TypedArray
import androidx.annotation.ColorInt
import androidx.annotation.Px
import com.ndhzs.slideshow.R
import com.ndhzs.slideshow.indicators.AbstractIndicatorsView

/**
 * .....
 * @author 985892345
 * @email 2767465918@qq.com
 * @data 2021/6/17
 */
class IndicatorsAttrs private constructor() {

    var isShowIndicators = true
        internal set
    @Indicators.Style
    var indicatorStyle = Indicators.Style.NO_SHOW
        internal set
    @Indicators.OuterGravity
    var indicatorOuterGravity = Indicators.OuterGravity.BOTTOM
        internal set
    @Indicators.InnerGravity
    var indicatorInnerGravity = Indicators.InnerGravity.CENTER
        internal set

    var indicatorCircleRadius = AbstractIndicatorsView.CIRCLE_RADIUS
        internal set
    var indicatorCircleColor = AbstractIndicatorsView.CIRCLE_COLOR
        internal set
    var indicatorBackgroundCircleColor = AbstractIndicatorsView.BACKGROUND_CIRCLE_COLOR
        internal set
    var indicatorBackgroundColor = AbstractIndicatorsView.BACKGROUND_COLOR
        internal set
    var indicatorWrapWidth = AbstractIndicatorsView.WRAP_WIDTH
        internal set
    var intervalMargin = AbstractIndicatorsView.INTERVAL_MARGIN
        internal set

    internal fun initialize(ty: TypedArray) {
        isShowIndicators = ty.getBoolean(R.styleable.SlideShow_Indicators_isShow, isShowIndicators)
        indicatorStyle = ty.getInt(R.styleable.SlideShow_indicators_style, indicatorStyle)
        indicatorOuterGravity = ty.getInt(R.styleable.SlideShow_indicators_outerGravity, indicatorOuterGravity)
        indicatorInnerGravity = ty.getInt(R.styleable.SlideShow_indicators_innerGravity, indicatorInnerGravity)
        indicatorCircleRadius = ty.getDimension(R.styleable.SlideShow_indicators_circleRadius, indicatorCircleRadius)
        indicatorCircleColor = ty.getColor(R.styleable.SlideShow_indicators_circleColor, indicatorCircleColor)
        indicatorBackgroundCircleColor = ty.getColor(R.styleable.SlideShow_indicators_backgroundCircleColor, indicatorBackgroundCircleColor)
        indicatorBackgroundColor = ty.getColor(R.styleable.SlideShow_indicators_backgroundColor, indicatorBackgroundColor)
        indicatorWrapWidth = ty.getDimension(R.styleable.SlideShow_indicators_wrapWidth, indicatorWrapWidth)
        intervalMargin = ty.getDimension(R.styleable.SlideShow_indicators_intervalMargin, intervalMargin)
        setAttrs()
    }

    private fun setAttrs() {
    }

    class Builder {

        private val mAttrs = IndicatorsAttrs()

        /**
         * ????????????????????????
         *
         * @see style ???????????? [Indicators.Style]
         */
        fun setIndicatorsStyle(@Indicators.Style style: Int): Builder {
            mAttrs.indicatorStyle = style
            return this
        }

        /**
         * ????????????????????????????????????????????????
         *
         * @param gravity ???????????? [Indicators.OuterGravity]
         */
        fun setIndicatorsOuterGravity(@Indicators.OuterGravity gravity: Int): Builder {
            mAttrs.indicatorOuterGravity = gravity
            return this
        }

        /**
         * ?????????????????????????????????????????????
         *
         * @param gravity ???????????? [Indicators.InnerGravity]
         */
        fun setIndicatorsInnerGravity(@Indicators.InnerGravity gravity: Int): Builder {
            mAttrs.indicatorInnerGravity = gravity
            return this
        }

        /**
         * ??????????????????????????????
         */
        fun setIndicatorsCircleRadius(@Px radius: Float): Builder {
            mAttrs.indicatorCircleRadius = radius
            return this
        }

        /**
         * ??????????????????????????????
         */
        fun setIndicatorsCircleColor(@ColorInt color: Int): Builder {
            mAttrs.indicatorCircleColor = color
            return this
        }

        /**
         * ???????????????????????????????????????
         */
        fun setIndicatorsBackgroundCircleColor(@ColorInt color: Int): Builder {
            mAttrs.indicatorBackgroundCircleColor = color
            return this
        }

        /**
         * ????????????????????????????????????
         */
        fun setIndicatorsBackgroundColor(@ColorInt color: Int): Builder {
            mAttrs.indicatorBackgroundColor = color
            return this
        }

        /**
         * ???????????????????????????????????????
         */
        fun setIndicatorWrapWidth(@Px indicatorWrapWidth: Float): Builder {
            mAttrs.indicatorWrapWidth = indicatorWrapWidth
            return this
        }

        /**
         * ??????????????????????????????????????????
         */
        fun setIntervalMargin(@Px interval: Float): Builder {
            mAttrs.intervalMargin = interval
            return this
        }

        fun build(): IndicatorsAttrs {
            mAttrs.setAttrs()
            return mAttrs
        }
    }
}