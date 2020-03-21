package typingsJapgolly.reactScroll.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactScroll.elementMod.ElementProps
import typingsJapgolly.reactScroll.elementMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Element {
  def apply(
    name: String,
    AllHTMLAttributes: AllHTMLAttributes[HTMLDivElement] = null,
    ClassAttributes: ClassAttributes[HTMLDivElement] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ElementProps, default, Unit, ElementProps] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactScroll.elementMod.ElementProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactScroll.elementMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactScroll.elementMod.ElementProps])(children: _*)
  }
  @JSImport("react-scroll/modules/components/Element", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

