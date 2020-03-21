package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.MaterialUI.Styles.MuiTheme
import typingsJapgolly.materialUi.MaterialUI.Styles.MuiThemeProviderProps
import typingsJapgolly.materialUi.muiThemeProviderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MuiThemeProvider {
  def apply(
    muiTheme: MuiTheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MuiThemeProviderProps, default, Unit, MuiThemeProviderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (muiTheme != null) __obj.updateDynamic("muiTheme")(muiTheme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.MaterialUI.Styles.MuiThemeProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.muiThemeProviderMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.MaterialUI.Styles.MuiThemeProviderProps])(children: _*)
  }
  @JSImport("material-ui/styles/MuiThemeProvider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

