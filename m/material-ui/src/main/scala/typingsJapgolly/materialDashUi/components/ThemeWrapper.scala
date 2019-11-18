package typingsJapgolly.materialDashUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialDashUi.__MaterialUI.Styles.MuiTheme
import typingsJapgolly.materialDashUi.__MaterialUI.ThemeWrapperProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeWrapper {
  def apply(
    theme: MuiTheme,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ThemeWrapperProps, 
    typingsJapgolly.materialDashUi.__MaterialUI.ThemeWrapper, 
    Unit, 
    ThemeWrapperProps
  ] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialDashUi.__MaterialUI.ThemeWrapperProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialDashUi.__MaterialUI.ThemeWrapper](js.constructorOf[typingsJapgolly.materialDashUi.__MaterialUI.ThemeWrapper])
    f(__obj.asInstanceOf[typingsJapgolly.materialDashUi.__MaterialUI.ThemeWrapperProps])(children: _*)
  }
}

