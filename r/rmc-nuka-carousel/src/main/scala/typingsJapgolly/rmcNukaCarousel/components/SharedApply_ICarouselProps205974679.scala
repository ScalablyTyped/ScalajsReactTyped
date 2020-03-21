package typingsJapgolly.rmcNukaCarousel.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rmcNukaCarousel.carouselMod.ICarouselProps
import typingsJapgolly.rmcNukaCarousel.rmcNukaCarouselStrings.auto
import typingsJapgolly.rmcNukaCarousel.rmcNukaCarouselStrings.center
import typingsJapgolly.rmcNukaCarousel.rmcNukaCarouselStrings.left
import typingsJapgolly.rmcNukaCarousel.rmcNukaCarouselStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ICarouselProps205974679[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    afterSlide: /* index */ Double => Callback = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayInterval: Int | Double = null,
    beforeSlide: (/* currentIndex */ Double, /* endIndex */ Double) => Callback = null,
    cellAlign: left | center | right = null,
    cellSpacing: Int | Double = null,
    className: String = null,
    data: js.UndefOr[Callback] = js.undefined,
    decorators: js.Array[_] = null,
    dragging: js.UndefOr[Boolean] = js.undefined,
    easing: js.Function = null,
    edgeEasing: js.Function = null,
    frameOverflow: String = null,
    framePadding: String = null,
    initialSlideHeight: Int | Double = null,
    initialSlideWidth: Int | Double = null,
    resetAutoplay: js.UndefOr[Boolean] = js.undefined,
    slideIndex: Int | Double = null,
    slideWidth: String | Double = null,
    slidesToScroll: Double | auto = null,
    slidesToShow: Int | Double = null,
    speed: Int | Double = null,
    style: js.Any = null,
    swipeSpeed: Int | Double = null,
    swiping: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    width: String = null,
    wrapAround: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ICarouselProps, ComponentRef, Unit, ICarouselProps] = {
    val __obj = js.Dynamic.literal()
  
      if (afterSlide != null) __obj.updateDynamic("afterSlide")(js.Any.fromFunction1((t0: /* index */ scala.Double) => afterSlide(t0).runNow()))
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (autoplayInterval != null) __obj.updateDynamic("autoplayInterval")(autoplayInterval.asInstanceOf[js.Any])
    if (beforeSlide != null) __obj.updateDynamic("beforeSlide")(js.Any.fromFunction2((t0: /* currentIndex */ scala.Double, t1: /* endIndex */ scala.Double) => beforeSlide(t0, t1).runNow()))
    if (cellAlign != null) __obj.updateDynamic("cellAlign")(cellAlign.asInstanceOf[js.Any])
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    data.foreach(p => __obj.updateDynamic("data")(p.toJsFn))
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (!js.isUndefined(dragging)) __obj.updateDynamic("dragging")(dragging.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (edgeEasing != null) __obj.updateDynamic("edgeEasing")(edgeEasing.asInstanceOf[js.Any])
    if (frameOverflow != null) __obj.updateDynamic("frameOverflow")(frameOverflow.asInstanceOf[js.Any])
    if (framePadding != null) __obj.updateDynamic("framePadding")(framePadding.asInstanceOf[js.Any])
    if (initialSlideHeight != null) __obj.updateDynamic("initialSlideHeight")(initialSlideHeight.asInstanceOf[js.Any])
    if (initialSlideWidth != null) __obj.updateDynamic("initialSlideWidth")(initialSlideWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(resetAutoplay)) __obj.updateDynamic("resetAutoplay")(resetAutoplay.asInstanceOf[js.Any])
    if (slideIndex != null) __obj.updateDynamic("slideIndex")(slideIndex.asInstanceOf[js.Any])
    if (slideWidth != null) __obj.updateDynamic("slideWidth")(slideWidth.asInstanceOf[js.Any])
    if (slidesToScroll != null) __obj.updateDynamic("slidesToScroll")(slidesToScroll.asInstanceOf[js.Any])
    if (slidesToShow != null) __obj.updateDynamic("slidesToShow")(slidesToShow.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (swipeSpeed != null) __obj.updateDynamic("swipeSpeed")(swipeSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(swiping)) __obj.updateDynamic("swiping")(swiping.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapAround)) __obj.updateDynamic("wrapAround")(wrapAround.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rmcNukaCarousel.carouselMod.ICarouselProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rmcNukaCarousel.carouselMod.ICarouselProps])(children: _*)
  }
}

