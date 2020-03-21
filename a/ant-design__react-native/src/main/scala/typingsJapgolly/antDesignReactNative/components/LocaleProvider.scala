package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.PartialLocale
import typingsJapgolly.antDesignReactNative.localeProviderMod.LocaleProviderProps
import typingsJapgolly.antDesignReactNative.localeProviderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LocaleProvider {
  def apply(
    locale: PartialLocale = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LocaleProviderProps, default, Unit, LocaleProviderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.localeProviderMod.LocaleProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.localeProviderMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.localeProviderMod.LocaleProviderProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/locale-provider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

