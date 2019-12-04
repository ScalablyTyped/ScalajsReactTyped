package typingsJapgolly.reactDashNativeDashViewDashShot.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNative.reactDashNativeMod.ViewStyle
import typingsJapgolly.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotMod.CaptureOptions
import typingsJapgolly.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotMod.ViewShotProperties
import typingsJapgolly.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotMod.default
import typingsJapgolly.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotStrings.continuous
import typingsJapgolly.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotStrings.mount
import typingsJapgolly.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashViewDashShot {
  def apply(
    captureMode: mount | continuous | update = null,
    onCapture: /* uri */ String => Callback = null,
    onCaptureFailure: /* error */ js.Error => Callback = null,
    options: CaptureOptions = null,
    style: ViewStyle = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
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
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotMod.ViewShotProperties, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotMod.ViewShotProperties])(children: _*)
  }
  @JSImport("react-native-view-shot", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

