package typingsJapgolly.reactCssThemr.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactCssThemr.mod.TReactCSSThemrTheme
import typingsJapgolly.reactCssThemr.mod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeProvider {
  def apply(
    theme: TReactCSSThemrTheme,
    innerRef: js.Function = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ThemeProviderProps, 
    typingsJapgolly.reactCssThemr.mod.ThemeProvider, 
    Unit, 
    ThemeProviderProps
  ] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
  
      if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCssThemr.mod.ThemeProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactCssThemr.mod.ThemeProvider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCssThemr.mod.ThemeProviderProps])(children: _*)
  }
  @JSImport("react-css-themr", "ThemeProvider")
  @js.native
  object componentImport extends js.Object
  
}

