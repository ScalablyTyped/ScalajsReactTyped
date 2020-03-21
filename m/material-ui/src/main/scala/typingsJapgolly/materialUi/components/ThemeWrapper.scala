package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.MaterialUI.Styles.MuiTheme
import typingsJapgolly.materialUi.MaterialUI.ThemeWrapperProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeWrapper {
  def apply(
    theme: MuiTheme,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ThemeWrapperProps, 
    typingsJapgolly.materialUi.MaterialUI.ThemeWrapper, 
    Unit, 
    ThemeWrapperProps
  ] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.MaterialUI.ThemeWrapperProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.MaterialUI.ThemeWrapper](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.MaterialUI.ThemeWrapperProps])(children: _*)
  }
  @JSGlobal("__MaterialUI.ThemeWrapper")
  @js.native
  object componentImport extends js.Object
  
}

