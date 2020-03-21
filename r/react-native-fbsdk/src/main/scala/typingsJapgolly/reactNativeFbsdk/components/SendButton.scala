package typingsJapgolly.reactNativeFbsdk.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeFbsdk.mod.SendButtonProps
import typingsJapgolly.reactNativeFbsdk.mod.ShareContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SendButton {
  def apply(
    shareContent: ShareContent,
    style: ViewStyle = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SendButtonProps, 
    typingsJapgolly.reactNativeFbsdk.mod.SendButton, 
    Unit, 
    SendButtonProps
  ] = {
    val __obj = js.Dynamic.literal(shareContent = shareContent.asInstanceOf[js.Any])
  
      if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeFbsdk.mod.SendButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeFbsdk.mod.SendButton](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeFbsdk.mod.SendButtonProps])(children: _*)
  }
  @JSImport("react-native-fbsdk", "SendButton")
  @js.native
  object componentImport extends js.Object
  
}

