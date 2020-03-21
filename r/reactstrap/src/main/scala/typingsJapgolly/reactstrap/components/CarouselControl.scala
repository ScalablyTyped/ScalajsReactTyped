package typingsJapgolly.reactstrap.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactstrap.carouselControlMod.CarouselControlProps
import typingsJapgolly.reactstrap.carouselControlMod.default
import typingsJapgolly.reactstrap.mod.CSSModule
import typingsJapgolly.reactstrap.reactstrapStrings.next
import typingsJapgolly.reactstrap.reactstrapStrings.prev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CarouselControl {
  def apply[T](
    direction: prev | next,
    directionText: String,
    onClickHandler: Callback,
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    StringDictionary: /* s */ StringDictionary[js.Any] = null,
    cssModule: CSSModule = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CarouselControlProps, default[T], Unit, CarouselControlProps] = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], directionText = directionText.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onClickHandler")(onClickHandler.toJsFn)
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactstrap.carouselControlMod.CarouselControlProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactstrap.carouselControlMod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactstrap.carouselControlMod.CarouselControlProps])(children: _*)
  }
  @JSImport("reactstrap/lib/CarouselControl", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

