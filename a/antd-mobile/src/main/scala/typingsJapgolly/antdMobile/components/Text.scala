package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLSpanElement
import typingsJapgolly.antdMobile.textMod.default
import typingsJapgolly.antdMobile.viewMod.ViewProps
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Text {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLSpanElement] = null,
    ClassAttributes: ClassAttributes[HTMLSpanElement] = null,
    Component: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ViewProps[HTMLSpanElement], default, Unit, ViewProps[HTMLSpanElement]] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.viewMod.ViewProps[org.scalajs.dom.raw.HTMLSpanElement], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.textMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.viewMod.ViewProps[org.scalajs.dom.raw.HTMLSpanElement]])(children: _*)
  }
  @JSImport("antd-mobile/lib/text", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

