package typingsJapgolly.materialDashUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialDashUi.__MaterialUI.Styles.MuiTheme
import typingsJapgolly.materialDashUi.__MaterialUI.Styles.MuiThemeProviderProps
import typingsJapgolly.materialDashUi.stylesMuiThemeProviderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MuiThemeProvider {
  def apply(
    muiTheme: MuiTheme = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MuiThemeProviderProps, default, Unit, MuiThemeProviderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (muiTheme != null) __obj.updateDynamic("muiTheme")(muiTheme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialDashUi.__MaterialUI.Styles.MuiThemeProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialDashUi.stylesMuiThemeProviderMod.default](js.constructorOf[typingsJapgolly.materialDashUi.stylesMuiThemeProviderMod.default])
    f(__obj.asInstanceOf[typingsJapgolly.materialDashUi.__MaterialUI.Styles.MuiThemeProviderProps])(children: _*)
  }
}

