package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.libStyleMod.Theme
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WithTheme {
  def apply[T, S](
    themeStyles: Theme => CallbackTo[T],
    styles: S = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: (T with StringDictionary[js.Any], Theme) => CallbackTo[Node]
  ): UnmountedWithRoot[
    WithThemeProps[T, S], 
    typingsJapgolly.antDesignReactNative.libStyleMod.WithTheme[T, S], 
    Unit, 
    WithThemeProps[T, S]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction2((t0: T with org.scalablytyped.runtime.StringDictionary[js.Any], t1: typingsJapgolly.antDesignReactNative.libStyleMod.Theme) => children(t0, t1).runNow()))
    __obj.updateDynamic("themeStyles")(js.Any.fromFunction1((t0: typingsJapgolly.antDesignReactNative.libStyleMod.Theme) => themeStyles(t0).runNow()))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeProps[T, S], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.antDesignReactNative.libStyleMod.WithTheme[T, S]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeProps[T, S]])
  }
  @JSImport("@ant-design/react-native/lib/style", "WithTheme")
  @js.native
  object componentImport extends js.Object
  
}

