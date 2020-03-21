package typingsJapgolly.reactNativeShare.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.ImageSourcePropType
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextProps
import typingsJapgolly.reactNative.mod.ViewProps
import typingsJapgolly.reactNativeShare.buttonMod.ButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button {
  def apply(
    iconSrc: ImageSourcePropType,
    onPress: Callback,
    buttonStyle: StyleProp[ViewProps] = null,
    textStyle: StyleProp[TextProps] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ButtonProps, 
    MountedWithRawType[ButtonProps, js.Object, RawMounted[ButtonProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(iconSrc = iconSrc.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onPress")(onPress.toJsFn)
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactNativeShare.buttonMod.ButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeShare.buttonMod.ButtonProps])(children: _*)
  }
  @JSImport("react-native-share/Button", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

