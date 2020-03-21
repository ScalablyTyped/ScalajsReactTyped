package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUiCore.createMuiThemeMod.Theme
import typingsJapgolly.materialUiCore.muiThemeProviderMod.MuiThemeProviderProps
import typingsJapgolly.materialUiCore.muiThemeProviderMod.SheetManagerTheme
import typingsJapgolly.materialUiCore.muiThemeProviderMod.default
import typingsJapgolly.materialUiCore.withStylesMod.StylesCreator
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MuiThemeProvider {
  def apply(
    theme: Theme | (js.Function1[/* outer */ Theme | Null, Theme]),
    disableStylesGeneration: js.UndefOr[Boolean] = js.undefined,
    sheetsManager: Map[StylesCreator, Map[Theme, SheetManagerTheme]] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MuiThemeProviderProps, default, Unit, MuiThemeProviderProps] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
  
      if (!js.isUndefined(disableStylesGeneration)) __obj.updateDynamic("disableStylesGeneration")(disableStylesGeneration.asInstanceOf[js.Any])
    if (sheetsManager != null) __obj.updateDynamic("sheetsManager")(sheetsManager.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUiCore.muiThemeProviderMod.MuiThemeProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUiCore.muiThemeProviderMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUiCore.muiThemeProviderMod.MuiThemeProviderProps])(children: _*)
  }
  @JSImport("@material-ui/core/styles/MuiThemeProvider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

