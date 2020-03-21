package typingsJapgolly.reactNativePhotoView.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactNative.mod.ImageSourcePropType
import typingsJapgolly.reactNativePhotoView.AnonX
import typingsJapgolly.reactNativePhotoView.reactNativePhotoViewStrings.center
import typingsJapgolly.reactNativePhotoView.reactNativePhotoViewStrings.centerCrop
import typingsJapgolly.reactNativePhotoView.reactNativePhotoViewStrings.centerInside
import typingsJapgolly.reactNativePhotoView.reactNativePhotoViewStrings.fitCenter
import typingsJapgolly.reactNativePhotoView.reactNativePhotoViewStrings.fitEnd
import typingsJapgolly.reactNativePhotoView.reactNativePhotoViewStrings.fitStart
import typingsJapgolly.reactNativePhotoView.reactNativePhotoViewStrings.fitXY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactNativePhotoViewProps extends js.Object {
  var androidScaleType: js.UndefOr[center | centerCrop | centerInside | fitCenter | fitStart | fitEnd | fitXY] = js.undefined
  var androidZoomTransitionDuration: js.UndefOr[Double] = js.undefined
  var fadeDuration: js.UndefOr[Double] = js.undefined
  var loadingIndicatorSource: js.UndefOr[ImageSourcePropType] = js.undefined
  var maximumZoomScale: js.UndefOr[Double] = js.undefined
  var minimumZoomScale: js.UndefOr[Double] = js.undefined
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLoadEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLoadStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onProgress: js.UndefOr[js.Function2[/* loaded */ Double, /* total */ Double, Unit]] = js.undefined
  var onScale: js.UndefOr[js.Function2[/* scale */ Double, /* target */ js.UndefOr[Element], Unit]] = js.undefined
  var onTap: js.UndefOr[js.Function2[/* point */ AnonX, /* target */ js.UndefOr[Element], Unit]] = js.undefined
  var onViewTap: js.UndefOr[js.Function2[/* point */ AnonX, /* target */ js.UndefOr[Element], Unit]] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined
  var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined
  var source: js.UndefOr[ImageSourcePropType] = js.undefined
}

object ReactNativePhotoViewProps {
  @scala.inline
  def apply(
    androidScaleType: center | centerCrop | centerInside | fitCenter | fitStart | fitEnd | fitXY = null,
    androidZoomTransitionDuration: Int | Double = null,
    fadeDuration: Int | Double = null,
    loadingIndicatorSource: ImageSourcePropType = null,
    maximumZoomScale: Int | Double = null,
    minimumZoomScale: Int | Double = null,
    onLoad: js.UndefOr[Callback] = js.undefined,
    onLoadEnd: js.UndefOr[Callback] = js.undefined,
    onLoadStart: js.UndefOr[Callback] = js.undefined,
    onProgress: (/* loaded */ Double, /* total */ Double) => Callback = null,
    onScale: (/* scale */ Double, /* target */ js.UndefOr[Element]) => Callback = null,
    onTap: (/* point */ AnonX, /* target */ js.UndefOr[Element]) => Callback = null,
    onViewTap: (/* point */ AnonX, /* target */ js.UndefOr[Element]) => Callback = null,
    scale: Int | Double = null,
    showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    source: ImageSourcePropType = null
  ): ReactNativePhotoViewProps = {
    val __obj = js.Dynamic.literal()
    if (androidScaleType != null) __obj.updateDynamic("androidScaleType")(androidScaleType.asInstanceOf[js.Any])
    if (androidZoomTransitionDuration != null) __obj.updateDynamic("androidZoomTransitionDuration")(androidZoomTransitionDuration.asInstanceOf[js.Any])
    if (fadeDuration != null) __obj.updateDynamic("fadeDuration")(fadeDuration.asInstanceOf[js.Any])
    if (loadingIndicatorSource != null) __obj.updateDynamic("loadingIndicatorSource")(loadingIndicatorSource.asInstanceOf[js.Any])
    if (maximumZoomScale != null) __obj.updateDynamic("maximumZoomScale")(maximumZoomScale.asInstanceOf[js.Any])
    if (minimumZoomScale != null) __obj.updateDynamic("minimumZoomScale")(minimumZoomScale.asInstanceOf[js.Any])
    onLoad.foreach(p => __obj.updateDynamic("onLoad")(p.toJsFn))
    onLoadEnd.foreach(p => __obj.updateDynamic("onLoadEnd")(p.toJsFn))
    onLoadStart.foreach(p => __obj.updateDynamic("onLoadStart")(p.toJsFn))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction2((t0: /* loaded */ scala.Double, t1: /* total */ scala.Double) => onProgress(t0, t1).runNow()))
    if (onScale != null) __obj.updateDynamic("onScale")(js.Any.fromFunction2((t0: /* scale */ scala.Double, t1: /* target */ js.UndefOr[japgolly.scalajs.react.raw.React.Element]) => onScale(t0, t1).runNow()))
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction2((t0: /* point */ typingsJapgolly.reactNativePhotoView.AnonX, t1: /* target */ js.UndefOr[japgolly.scalajs.react.raw.React.Element]) => onTap(t0, t1).runNow()))
    if (onViewTap != null) __obj.updateDynamic("onViewTap")(js.Any.fromFunction2((t0: /* point */ typingsJapgolly.reactNativePhotoView.AnonX, t1: /* target */ js.UndefOr[japgolly.scalajs.react.raw.React.Element]) => onViewTap(t0, t1).runNow()))
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(showsHorizontalScrollIndicator)) __obj.updateDynamic("showsHorizontalScrollIndicator")(showsHorizontalScrollIndicator.asInstanceOf[js.Any])
    if (!js.isUndefined(showsVerticalScrollIndicator)) __obj.updateDynamic("showsVerticalScrollIndicator")(showsVerticalScrollIndicator.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactNativePhotoViewProps]
  }
}

