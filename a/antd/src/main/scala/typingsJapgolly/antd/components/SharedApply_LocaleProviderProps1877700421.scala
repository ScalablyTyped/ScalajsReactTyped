package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.libLocaleDashProviderMod.Locale
import typingsJapgolly.antd.libLocaleDashProviderMod.LocaleProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_LocaleProviderProps1877700421[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    locale: Locale,
    _ANT_MARK__ : String = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LocaleProviderProps, ComponentRef, Unit, LocaleProviderProps] = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
  
      if (_ANT_MARK__ != null) __obj.updateDynamic("_ANT_MARK__")(_ANT_MARK__.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libLocaleDashProviderMod.LocaleProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libLocaleDashProviderMod.LocaleProviderProps])(children: _*)
  }
}

