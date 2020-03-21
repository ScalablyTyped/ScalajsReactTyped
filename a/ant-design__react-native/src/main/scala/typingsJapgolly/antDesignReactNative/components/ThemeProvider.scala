package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.libStyleMod.PartialTheme
import typingsJapgolly.antDesignReactNative.libStyleMod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeProvider {
  def apply(
    value: PartialTheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ThemeProviderProps, 
    MountedWithRawType[ThemeProviderProps, js.Object, RawMounted[ThemeProviderProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antDesignReactNative.libStyleMod.ThemeProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.libStyleMod.ThemeProviderProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/style", "ThemeProvider")
  @js.native
  object componentImport extends js.Object
  
}

