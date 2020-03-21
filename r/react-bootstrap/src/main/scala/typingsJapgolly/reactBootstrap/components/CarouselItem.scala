package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactBootstrap.carouselItemMod.CarouselItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CarouselItem {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[typingsJapgolly.reactBootstrap.carouselItemMod.CarouselItem] = null,
    ClassAttributes: ClassAttributes[typingsJapgolly.reactBootstrap.carouselItemMod.CarouselItem] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    animateOut: js.UndefOr[Boolean] = js.undefined,
    animtateIn: js.UndefOr[Boolean] = js.undefined,
    direction: String = null,
    index: Int | Double = null,
    onAnimateOutEnd: js.Function = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    CarouselItemProps, 
    typingsJapgolly.reactBootstrap.mod.CarouselItem, 
    Unit, 
    CarouselItemProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(animateOut)) __obj.updateDynamic("animateOut")(animateOut.asInstanceOf[js.Any])
    if (!js.isUndefined(animtateIn)) __obj.updateDynamic("animtateIn")(animtateIn.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onAnimateOutEnd != null) __obj.updateDynamic("onAnimateOutEnd")(onAnimateOutEnd.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrap.carouselItemMod.CarouselItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.mod.CarouselItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrap.carouselItemMod.CarouselItemProps])(children: _*)
  }
  @JSImport("react-bootstrap", "CarouselItem")
  @js.native
  object componentImport extends js.Object
  
}

