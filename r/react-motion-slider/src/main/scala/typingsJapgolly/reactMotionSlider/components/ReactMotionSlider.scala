package typingsJapgolly.reactMotionSlider.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactMotion.mod.OpaqueConfig
import typingsJapgolly.reactMotionSlider.mod.SliderProps
import typingsJapgolly.reactMotionSlider.mod.default
import typingsJapgolly.reactMotionSlider.reactMotionSliderStrings.center
import typingsJapgolly.reactMotionSlider.reactMotionSliderStrings.left
import typingsJapgolly.reactMotionSlider.reactMotionSliderStrings.mouse
import typingsJapgolly.reactMotionSlider.reactMotionSliderStrings.right
import typingsJapgolly.reactMotionSlider.reactMotionSliderStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactMotionSlider {
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
    swipeThreshold: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SliderProps, default, Unit, SliderProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMotionSlider.mod.SliderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMotionSlider.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMotionSlider.mod.SliderProps])(children: _*)
  }
  @JSImport("react-motion-slider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

