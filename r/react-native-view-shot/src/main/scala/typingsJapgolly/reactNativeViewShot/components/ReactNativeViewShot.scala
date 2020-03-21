package typingsJapgolly.reactNativeViewShot.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeViewShot.mod.CaptureOptions
import typingsJapgolly.reactNativeViewShot.mod.ViewShotProperties
import typingsJapgolly.reactNativeViewShot.mod.default
import typingsJapgolly.reactNativeViewShot.reactNativeViewShotStrings.continuous
import typingsJapgolly.reactNativeViewShot.reactNativeViewShotStrings.mount
import typingsJapgolly.reactNativeViewShot.reactNativeViewShotStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeViewShot {
  def apply(
    captureMode: mount | continuous | update = null,
    onCapture: /* uri */ String => Callback = null,
    onCaptureFailure: /* error */ js.Error => Callback = null,
    options: CaptureOptions = null,
    style: ViewStyle = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ViewShotProperties, default, Unit, ViewShotProperties] = {
    val __obj = js.Dynamic.literal()
  
      if (captureMode != null) __obj.updateDynamic("captureMode")(captureMode.asInstanceOf[js.Any])
    if (onCapture != null) __obj.updateDynamic("onCapture")(js.Any.fromFunction1((t0: /* uri */ java.lang.String) => onCapture(t0).runNow()))
    if (onCaptureFailure != null) __obj.updateDynamic("onCaptureFailure")(js.Any.fromFunction1((t0: /* error */ js.Error) => onCaptureFailure(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeViewShot.mod.ViewShotProperties, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeViewShot.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeViewShot.mod.ViewShotProperties])(children: _*)
  }
  @JSImport("react-native-view-shot", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

