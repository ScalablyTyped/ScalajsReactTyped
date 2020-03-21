package typingsJapgolly.reactstrap.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactstrap.carouselIndicatorsMod.CarouselIndicatorsProps
import typingsJapgolly.reactstrap.carouselIndicatorsMod.default
import typingsJapgolly.reactstrap.mod.CSSModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CarouselIndicators {
  def apply[T](
    activeIndex: Double,
    items: js.Array[js.Object],
    onClickHandler: Double => Callback,
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    cssModule: CSSModule = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CarouselIndicatorsProps, default[T], Unit, CarouselIndicatorsProps] = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onClickHandler")(js.Any.fromFunction1((t0: scala.Double) => onClickHandler(t0).runNow()))
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactstrap.carouselIndicatorsMod.CarouselIndicatorsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactstrap.carouselIndicatorsMod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactstrap.carouselIndicatorsMod.CarouselIndicatorsProps])(children: _*)
  }
  @JSImport("reactstrap/lib/CarouselIndicators", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

