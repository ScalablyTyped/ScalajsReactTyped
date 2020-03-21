package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.localeProviderMod.Locale
import typingsJapgolly.antd.localeProviderMod.LocaleProviderProps
import typingsJapgolly.antd.localeProviderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LocaleProvider {
  def apply(
    locale: Locale,
    _ANT_MARK__ : String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LocaleProviderProps, default, Unit, LocaleProviderProps] = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
  
      if (_ANT_MARK__ != null) __obj.updateDynamic("_ANT_MARK__")(_ANT_MARK__.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.localeProviderMod.LocaleProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.localeProviderMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.localeProviderMod.LocaleProviderProps])(children: _*)
  }
  @JSImport("antd/lib/locale-provider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

