package typingsJapgolly.reactJss.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.NonNullable
import typingsJapgolly.theming.mod.DefaultTheme
import typingsJapgolly.theming.mod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeProvider {
  def apply(
    theme: NonNullable[DefaultTheme] | (js.Function1[DefaultTheme, NonNullable[DefaultTheme]]) = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ThemeProviderProps[DefaultTheme], 
    typingsJapgolly.reactJss.mod.ThemeProvider, 
    Unit, 
    ThemeProviderProps[DefaultTheme]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.theming.mod.ThemeProviderProps[typingsJapgolly.theming.mod.DefaultTheme], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactJss.mod.ThemeProvider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.theming.mod.ThemeProviderProps[typingsJapgolly.theming.mod.DefaultTheme]])(children: _*)
  }
  @JSImport("react-jss", "ThemeProvider")
  @js.native
  object componentImport extends js.Object
  
}

