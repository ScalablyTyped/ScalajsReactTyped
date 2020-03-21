package typingsJapgolly.reactNativeElements.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeElements.mod.Theme
import typingsJapgolly.reactNativeElements.mod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeProvider {
  def apply[T](
    theme: Theme[T] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ThemeProviderProps[T], 
    typingsJapgolly.reactNativeElements.mod.ThemeProvider[T], 
    Unit, 
    ThemeProviderProps[T]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeElements.mod.ThemeProviderProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeElements.mod.ThemeProvider[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeElements.mod.ThemeProviderProps[T]])(children: _*)
  }
  @JSImport("react-native-elements", "ThemeProvider")
  @js.native
  object componentImport extends js.Object
  
}

