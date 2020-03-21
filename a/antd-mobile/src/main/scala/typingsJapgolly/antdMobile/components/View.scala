package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.antdMobile.viewMod.ViewProps
import typingsJapgolly.antdMobile.viewMod.default
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object View {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLDivElement] = null,
    ClassAttributes: ClassAttributes[HTMLDivElement] = null,
    Component: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ViewProps[HTMLDivElement], default, Unit, ViewProps[HTMLDivElement]] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.viewMod.ViewProps[org.scalajs.dom.raw.HTMLDivElement], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.viewMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.viewMod.ViewProps[org.scalajs.dom.raw.HTMLDivElement]])(children: _*)
  }
  @JSImport("antd-mobile/lib/view", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

