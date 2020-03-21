package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.carouselMod.CarouselProps
import typingsJapgolly.antdMobile.carouselMod.IFrameOverFlow
import typingsJapgolly.antdMobile.carouselMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Carousel {
  def apply(
    afterChange: /* current */ Double => Callback = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayInterval: Int | Double = null,
    beforeChange: (/* from */ Double, /* to */ Double) => Callback = null,
    cellSpacing: Int | Double = null,
    className: String = null,
    dotActiveStyle: CSSProperties = null,
    dotStyle: CSSProperties = null,
    dots: js.UndefOr[Boolean] = js.undefined,
    easing: js.UndefOr[Callback] = js.undefined,
    frameOverflow: IFrameOverFlow = null,
    infinite: js.UndefOr[Boolean] = js.undefined,
    initialSlideWidth: Int | Double = null,
    prefixCls: String = null,
    selectedIndex: Int | Double = null,
    slideWidth: String | Double = null,
    style: CSSProperties = null,
    swipeSpeed: Int | Double = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CarouselProps, default, Unit, CarouselProps] = {
    val __obj = js.Dynamic.literal()
  
      if (afterChange != null) __obj.updateDynamic("afterChange")(js.Any.fromFunction1((t0: /* current */ scala.Double) => afterChange(t0).runNow()))
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (autoplayInterval != null) __obj.updateDynamic("autoplayInterval")(autoplayInterval.asInstanceOf[js.Any])
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(js.Any.fromFunction2((t0: /* from */ scala.Double, t1: /* to */ scala.Double) => beforeChange(t0, t1).runNow()))
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dotActiveStyle != null) __obj.updateDynamic("dotActiveStyle")(dotActiveStyle.asInstanceOf[js.Any])
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    easing.foreach(p => __obj.updateDynamic("easing")(p.toJsFn))
    if (frameOverflow != null) __obj.updateDynamic("frameOverflow")(frameOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.asInstanceOf[js.Any])
    if (initialSlideWidth != null) __obj.updateDynamic("initialSlideWidth")(initialSlideWidth.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (slideWidth != null) __obj.updateDynamic("slideWidth")(slideWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (swipeSpeed != null) __obj.updateDynamic("swipeSpeed")(swipeSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.carouselMod.CarouselProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.carouselMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.carouselMod.CarouselProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/carousel", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

