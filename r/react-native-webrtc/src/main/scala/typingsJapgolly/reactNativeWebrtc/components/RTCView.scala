package typingsJapgolly.reactNativeWebrtc.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeWebrtc.mod.RTCViewProps
import typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.contain
import typingsJapgolly.reactNativeWebrtc.reactNativeWebrtcStrings.cover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RTCView {
  def apply(
    streamURL: String,
    mirror: js.UndefOr[Boolean] = js.undefined,
    objectFit: contain | cover = null,
    style: ViewStyle = null,
    zOrder: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[RTCViewProps, typingsJapgolly.reactNativeWebrtc.mod.RTCView, Unit, RTCViewProps] = {
    val __obj = js.Dynamic.literal(streamURL = streamURL.asInstanceOf[js.Any])
  
      if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror.asInstanceOf[js.Any])
    if (objectFit != null) __obj.updateDynamic("objectFit")(objectFit.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (zOrder != null) __obj.updateDynamic("zOrder")(zOrder.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeWebrtc.mod.RTCViewProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeWebrtc.mod.RTCView](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeWebrtc.mod.RTCViewProps])(children: _*)
  }
  @JSImport("react-native-webrtc", "RTCView")
  @js.native
  object componentImport extends js.Object
  
}

