package typingsJapgolly.atMaterialDashUiCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atMaterialDashUiCore.stylesCreateMuiThemeMod.Theme
import typingsJapgolly.atMaterialDashUiCore.stylesMuiThemeProviderMod.MuiThemeProviderProps
import typingsJapgolly.atMaterialDashUiCore.stylesMuiThemeProviderMod.SheetManagerTheme
import typingsJapgolly.atMaterialDashUiCore.stylesMuiThemeProviderMod.default
import typingsJapgolly.atMaterialDashUiCore.stylesWithStylesMod.StylesCreator
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
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MuiThemeProviderProps, default, Unit, MuiThemeProviderProps] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
  
      if (!js.isUndefined(disableStylesGeneration)) __obj.updateDynamic("disableStylesGeneration")(disableStylesGeneration.asInstanceOf[js.Any])
    if (sheetsManager != null) __obj.updateDynamic("sheetsManager")(sheetsManager.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atMaterialDashUiCore.stylesMuiThemeProviderMod.MuiThemeProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atMaterialDashUiCore.stylesMuiThemeProviderMod.default](js.constructorOf[typingsJapgolly.atMaterialDashUiCore.stylesMuiThemeProviderMod.default])
    f(__obj.asInstanceOf[typingsJapgolly.atMaterialDashUiCore.stylesMuiThemeProviderMod.MuiThemeProviderProps])(children: _*)
  }
}

