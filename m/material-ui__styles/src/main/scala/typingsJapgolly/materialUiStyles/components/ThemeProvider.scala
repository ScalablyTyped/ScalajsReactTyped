package typingsJapgolly.materialUiStyles.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUiStyles.themeProviderThemeProviderMod.ThemeProviderProps
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeProvider {
  def apply[T](
    theme: Partial[T] | (js.Function1[T, T]),
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ThemeProviderProps[T], 
    MountedWithRawType[ThemeProviderProps[T], js.Object, RawMounted[ThemeProviderProps[T], js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.materialUiStyles.themeProviderThemeProviderMod.ThemeProviderProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUiStyles.themeProviderThemeProviderMod.ThemeProviderProps[T]])(children: _*)
  }
  @JSImport("@material-ui/styles/ThemeProvider/ThemeProvider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

