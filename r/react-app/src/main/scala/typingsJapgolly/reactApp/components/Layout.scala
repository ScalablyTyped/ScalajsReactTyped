package typingsJapgolly.reactApp.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactApp.mod.LayoutProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Layout {
  def apply(
    className: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LayoutProps, typingsJapgolly.reactApp.mod.Layout, Unit, LayoutProps] = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactApp.mod.LayoutProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactApp.mod.Layout](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactApp.mod.LayoutProps])(children: _*)
  }
  @JSImport("react-app", "Layout")
  @js.native
  object componentImport extends js.Object
  
}

