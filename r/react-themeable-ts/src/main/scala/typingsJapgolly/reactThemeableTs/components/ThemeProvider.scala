package typingsJapgolly.reactThemeableTs.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactThemeableTs.themeProviderMod.IThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeProvider {
  def apply(
    reactThemeable: js.Any,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Any = null
  ): UnmountedWithRoot[
    IThemeProviderProps, 
    typingsJapgolly.reactThemeableTs.mod.ThemeProvider, 
    Unit, 
    IThemeProviderProps
  ] = {
    val __obj = js.Dynamic.literal(reactThemeable = reactThemeable.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactThemeableTs.themeProviderMod.IThemeProviderProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactThemeableTs.mod.ThemeProvider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactThemeableTs.themeProviderMod.IThemeProviderProps])
  }
  @JSImport("react-themeable-ts", "ThemeProvider")
  @js.native
  object componentImport extends js.Object
  
}

