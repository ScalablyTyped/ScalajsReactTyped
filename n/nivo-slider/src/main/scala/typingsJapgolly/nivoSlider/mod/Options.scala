package typingsJapgolly.nivoSlider.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var afterChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var animSpeed: js.UndefOr[Double] = js.undefined
  var beforeChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var boxCols: js.UndefOr[Double] = js.undefined
  var boxRows: js.UndefOr[Double] = js.undefined
  var controlNav: js.UndefOr[Boolean] = js.undefined
  var controlNavThumbs: js.UndefOr[Boolean] = js.undefined
  var directionNav: js.UndefOr[Boolean] = js.undefined
  var effect: js.UndefOr[EffectType] = js.undefined
  var lastSlide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var manualAdvance: js.UndefOr[Boolean] = js.undefined
  var nextText: js.UndefOr[String] = js.undefined
  var pauseOnHover: js.UndefOr[Boolean] = js.undefined
  var pauseTime: js.UndefOr[Double] = js.undefined
  var prevText: js.UndefOr[String] = js.undefined
  var randomStart: js.UndefOr[Boolean] = js.undefined
  var slices: js.UndefOr[Double] = js.undefined
  var slideshowEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var startSlide: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    afterChange: js.UndefOr[Callback] = js.undefined,
    afterLoad: js.UndefOr[Callback] = js.undefined,
    animSpeed: Int | Double = null,
    beforeChange: js.UndefOr[Callback] = js.undefined,
    boxCols: Int | Double = null,
    boxRows: Int | Double = null,
    controlNav: js.UndefOr[Boolean] = js.undefined,
    controlNavThumbs: js.UndefOr[Boolean] = js.undefined,
    directionNav: js.UndefOr[Boolean] = js.undefined,
    effect: EffectType = null,
    lastSlide: js.UndefOr[Callback] = js.undefined,
    manualAdvance: js.UndefOr[Boolean] = js.undefined,
    nextText: String = null,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    pauseTime: Int | Double = null,
    prevText: String = null,
    randomStart: js.UndefOr[Boolean] = js.undefined,
    slices: Int | Double = null,
    slideshowEnd: js.UndefOr[Callback] = js.undefined,
    startSlide: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    afterChange.foreach(p => __obj.updateDynamic("afterChange")(p.toJsFn))
    afterLoad.foreach(p => __obj.updateDynamic("afterLoad")(p.toJsFn))
    if (animSpeed != null) __obj.updateDynamic("animSpeed")(animSpeed.asInstanceOf[js.Any])
    beforeChange.foreach(p => __obj.updateDynamic("beforeChange")(p.toJsFn))
    if (boxCols != null) __obj.updateDynamic("boxCols")(boxCols.asInstanceOf[js.Any])
    if (boxRows != null) __obj.updateDynamic("boxRows")(boxRows.asInstanceOf[js.Any])
    if (!js.isUndefined(controlNav)) __obj.updateDynamic("controlNav")(controlNav.asInstanceOf[js.Any])
    if (!js.isUndefined(controlNavThumbs)) __obj.updateDynamic("controlNavThumbs")(controlNavThumbs.asInstanceOf[js.Any])
    if (!js.isUndefined(directionNav)) __obj.updateDynamic("directionNav")(directionNav.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    lastSlide.foreach(p => __obj.updateDynamic("lastSlide")(p.toJsFn))
    if (!js.isUndefined(manualAdvance)) __obj.updateDynamic("manualAdvance")(manualAdvance.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover.asInstanceOf[js.Any])
    if (pauseTime != null) __obj.updateDynamic("pauseTime")(pauseTime.asInstanceOf[js.Any])
    if (prevText != null) __obj.updateDynamic("prevText")(prevText.asInstanceOf[js.Any])
    if (!js.isUndefined(randomStart)) __obj.updateDynamic("randomStart")(randomStart.asInstanceOf[js.Any])
    if (slices != null) __obj.updateDynamic("slices")(slices.asInstanceOf[js.Any])
    slideshowEnd.foreach(p => __obj.updateDynamic("slideshowEnd")(p.toJsFn))
    if (startSlide != null) __obj.updateDynamic("startSlide")(startSlide.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

