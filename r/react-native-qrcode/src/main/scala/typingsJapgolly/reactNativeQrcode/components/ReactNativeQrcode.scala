package typingsJapgolly.reactNativeQrcode.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeQrcode.mod.QRCodeProperties
import typingsJapgolly.reactNativeQrcode.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeQrcode {
  def apply(
    bgColor: String = null,
    fgColor: String = null,
    size: Int | Double = null,
    value: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[QRCodeProperties, default, Unit, QRCodeProperties] = {
    val __obj = js.Dynamic.literal()
  
      if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (fgColor != null) __obj.updateDynamic("fgColor")(fgColor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeQrcode.mod.QRCodeProperties, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeQrcode.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeQrcode.mod.QRCodeProperties])(children: _*)
  }
  @JSImport("react-native-qrcode", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

