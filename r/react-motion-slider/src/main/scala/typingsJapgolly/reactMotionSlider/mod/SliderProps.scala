package typingsJapgolly.reactMotionSlider.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactMotion.mod.OpaqueConfig
import typingsJapgolly.reactMotionSlider.reactMotionSliderStrings.center
import typingsJapgolly.reactMotionSlider.reactMotionSliderStrings.left
import typingsJapgolly.reactMotionSlider.reactMotionSliderStrings.mouse
import typingsJapgolly.reactMotionSlider.reactMotionSliderStrings.right
import typingsJapgolly.reactMotionSlider.reactMotionSliderStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps extends js.Object {
  /**
    * Prop callback fired after slide change.
    * @param currentIndex
    */
  var afterSlide: js.UndefOr[js.Function1[/* currentIndex */ Double, Unit]] = js.undefined
  /**
    * Offsets the slide to align either left, center, or right.
    * @default "left"
    */
  var align: js.UndefOr[left | center | right] = js.undefined
  /**
    * Animates the wrapper height to fit the current slide.
    * @default false
    */
  var autoHeight: js.UndefOr[Boolean] = js.undefined
  /**
    * Prop callback fired before slide change.
    * @param currentIndex
    * @param nextIndex
    */
  var beforeSlide: js.UndefOr[js.Function2[/* currentIndex */ Double, /* nextIndex */ Double, Unit]] = js.undefined
  /**
    * Move to a slide by its index.
    */
  var currentIndex: js.UndefOr[Double] = js.undefined
  /**
    * Move to a slide by its key.
    */
  var currentKey: js.UndefOr[String | Double] = js.undefined
  /**
    * The amount of time in milliseconds that determines if a swipe was a flick or not.
    */
  var flickTimeout: js.UndefOr[Double] = js.undefined
  /**
    * The amount of slides to move upon using prev and next methods.
    * @default 1
    */
  var slidesToMove: js.UndefOr[Double] = js.undefined
  /**
    * The amount of slides shown in view
    * @default 1
    */
  var slidesToShow: js.UndefOr[Double] = js.undefined
  /**
    * Accepts a React Motion spring config.
    */
  var springConfig: js.UndefOr[OpaqueConfig] = js.undefined
  /**
    * Enable touch and/or mouse dragging
    * @default true
    */
  var swipe: js.UndefOr[Boolean | touch | mouse] = js.undefined
  /**
    * The amount the user must swipe to advance slides. (sliderWidth * swipeThreshold)
    * @default 0.5
    */
  var swipeThreshold: js.UndefOr[Double] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    afterSlide: /* currentIndex */ Double => Callback = null,
    align: left | center | right = null,
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    beforeSlide: (/* currentIndex */ Double, /* nextIndex */ Double) => Callback = null,
    currentIndex: Int | Double = null,
    currentKey: String | Double = null,
    flickTimeout: Int | Double = null,
    slidesToMove: Int | Double = null,
    slidesToShow: Int | Double = null,
    springConfig: OpaqueConfig = null,
    swipe: Boolean | touch | mouse = null,
    swipeThreshold: Int | Double = null
  ): SliderProps = {
    val __obj = js.Dynamic.literal()
    if (afterSlide != null) __obj.updateDynamic("afterSlide")(js.Any.fromFunction1((t0: /* currentIndex */ scala.Double) => afterSlide(t0).runNow()))
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (beforeSlide != null) __obj.updateDynamic("beforeSlide")(js.Any.fromFunction2((t0: /* currentIndex */ scala.Double, t1: /* nextIndex */ scala.Double) => beforeSlide(t0, t1).runNow()))
    if (currentIndex != null) __obj.updateDynamic("currentIndex")(currentIndex.asInstanceOf[js.Any])
    if (currentKey != null) __obj.updateDynamic("currentKey")(currentKey.asInstanceOf[js.Any])
    if (flickTimeout != null) __obj.updateDynamic("flickTimeout")(flickTimeout.asInstanceOf[js.Any])
    if (slidesToMove != null) __obj.updateDynamic("slidesToMove")(slidesToMove.asInstanceOf[js.Any])
    if (slidesToShow != null) __obj.updateDynamic("slidesToShow")(slidesToShow.asInstanceOf[js.Any])
    if (springConfig != null) __obj.updateDynamic("springConfig")(springConfig.asInstanceOf[js.Any])
    if (swipe != null) __obj.updateDynamic("swipe")(swipe.asInstanceOf[js.Any])
    if (swipeThreshold != null) __obj.updateDynamic("swipeThreshold")(swipeThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderProps]
  }
}

