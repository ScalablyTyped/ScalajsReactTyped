package typingsJapgolly.uifabricFoundation.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.uifabricFoundation.themeProviderMod.IThemeProviderProps
import typingsJapgolly.uifabricStyling.ithemeMod.ISchemeNames
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeProvider {
  def apply(
    scheme: ISchemeNames = null,
    theme: ITheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    IThemeProviderProps, 
    MountedWithRawType[IThemeProviderProps, js.Object, RawMounted[IThemeProviderProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.uifabricFoundation.themeProviderMod.IThemeProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.uifabricFoundation.themeProviderMod.IThemeProviderProps])(children: _*)
  }
  @JSImport("@uifabric/foundation", "ThemeProvider")
  @js.native
  object componentImport extends js.Object
  
}

