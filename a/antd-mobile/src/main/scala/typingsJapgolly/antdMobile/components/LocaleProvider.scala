package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.AnonDatePicker
import typingsJapgolly.antdMobile.localeProviderLocaleProviderMod.LocaleProviderProps
import typingsJapgolly.antdMobile.localeProviderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LocaleProvider {
  def apply(
    locale: AnonDatePicker,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LocaleProviderProps, default, Unit, LocaleProviderProps] = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.localeProviderLocaleProviderMod.LocaleProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.localeProviderMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.localeProviderLocaleProviderMod.LocaleProviderProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/locale-provider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

