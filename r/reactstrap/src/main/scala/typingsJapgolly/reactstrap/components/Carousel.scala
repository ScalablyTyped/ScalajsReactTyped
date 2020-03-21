package typingsJapgolly.reactstrap.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactstrap.carouselMod.CarouselProps
import typingsJapgolly.reactstrap.carouselMod.default
import typingsJapgolly.reactstrap.mod.CSSModule
import typingsJapgolly.reactstrap.reactstrapBooleans.`false`
import typingsJapgolly.reactstrap.reactstrapStrings.carousel
import typingsJapgolly.reactstrap.reactstrapStrings.hover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Carousel {
  def apply[T](
    next: Callback,
    previous: Callback,
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    activeIndex: Int | Double = null,
    cssModule: CSSModule = null,
    enableTouch: js.UndefOr[Boolean] = js.undefined,
    interval: Double | String | Boolean = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    mouseEnter: js.UndefOr[Callback] = js.undefined,
    mouseExit: js.UndefOr[Callback] = js.undefined,
    pause: hover | `false` = null,
    ride: carousel = null,
    slide: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CarouselProps, default[T], Unit, CarouselProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("previous")(previous.toJsFn)
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTouch)) __obj.updateDynamic("enableTouch")(enableTouch.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    mouseEnter.foreach(p => __obj.updateDynamic("mouseEnter")(p.toJsFn))
    mouseExit.foreach(p => __obj.updateDynamic("mouseExit")(p.toJsFn))
    if (pause != null) __obj.updateDynamic("pause")(pause.asInstanceOf[js.Any])
    if (ride != null) __obj.updateDynamic("ride")(ride.asInstanceOf[js.Any])
    if (!js.isUndefined(slide)) __obj.updateDynamic("slide")(slide.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactstrap.carouselMod.CarouselProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactstrap.carouselMod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactstrap.carouselMod.CarouselProps])(children: _*)
  }
  @JSImport("reactstrap/lib/Carousel", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

