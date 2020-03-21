package typingsJapgolly.reactstrap.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactstrap.carouselItemMod.CarouselItemProps
import typingsJapgolly.reactstrap.carouselItemMod.default
import typingsJapgolly.reactstrap.mod.CSSModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CarouselItem {
  def apply[T](
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    cssModule: CSSModule = null,
    in: js.UndefOr[Boolean] = js.undefined,
    onEnter: js.UndefOr[Callback] = js.undefined,
    onEntered: js.UndefOr[Callback] = js.undefined,
    onEntering: js.UndefOr[Callback] = js.undefined,
    onExit: js.UndefOr[Callback] = js.undefined,
    onExited: js.UndefOr[Callback] = js.undefined,
    onExiting: js.UndefOr[Callback] = js.undefined,
    slide: js.UndefOr[Boolean] = js.undefined,
    tag: String | ReactType[_] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CarouselItemProps, default[T], Unit, CarouselItemProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    onEnter.foreach(p => __obj.updateDynamic("onEnter")(p.toJsFn))
    onEntered.foreach(p => __obj.updateDynamic("onEntered")(p.toJsFn))
    onEntering.foreach(p => __obj.updateDynamic("onEntering")(p.toJsFn))
    onExit.foreach(p => __obj.updateDynamic("onExit")(p.toJsFn))
    onExited.foreach(p => __obj.updateDynamic("onExited")(p.toJsFn))
    onExiting.foreach(p => __obj.updateDynamic("onExiting")(p.toJsFn))
    if (!js.isUndefined(slide)) __obj.updateDynamic("slide")(slide.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactstrap.carouselItemMod.CarouselItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactstrap.carouselItemMod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactstrap.carouselItemMod.CarouselItemProps])(children: _*)
  }
  @JSImport("reactstrap/lib/CarouselItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

