package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.PartialLocale
import typingsJapgolly.antDesignReactNative.PartialTheme
import typingsJapgolly.antDesignReactNative.providerMod.ProviderProps
import typingsJapgolly.antDesignReactNative.providerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Provider {
  def apply(
    locale: PartialLocale = null,
    theme: PartialTheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ProviderProps, default, Unit, ProviderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.providerMod.ProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.providerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.providerMod.ProviderProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/provider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

