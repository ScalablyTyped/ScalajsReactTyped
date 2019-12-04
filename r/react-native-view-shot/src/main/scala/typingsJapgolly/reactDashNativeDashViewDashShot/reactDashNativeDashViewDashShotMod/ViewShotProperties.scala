package typingsJapgolly.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactDashNative.reactDashNativeMod.ViewStyle
import typingsJapgolly.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotStrings.continuous
import typingsJapgolly.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotStrings.mount
import typingsJapgolly.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewShotProperties extends js.Object {
  /**
    * - if not defined (default). the capture is not automatic and you need to use the ref and call capture()
    *   yourself.
    * - "mount". Capture the view once at mount. (It is important to understand image loading won't be waited, in
    *   such case you want to use "none" with viewShotRef.capture() after Image#onLoad.)
    * - "continuous" EXPERIMENTAL, this will capture A LOT of images continuously. For very specific use-cases.
    * - "update" EXPERIMENTAL, this will capture images each time React redraw (on did update). For very specific
    *   use-cases.
    */
  var captureMode: js.UndefOr[mount | continuous | update] = js.undefined
  /**
    * when a captureMode is defined, this callback will be called with the capture result.
    * @param {string} uri
    */
  var onCapture: js.UndefOr[js.Function1[/* uri */ String, Unit]] = js.undefined
  /**
    * when a captureMode is defined, this callback will be called when a capture fails.
    * @param {Error} error
    */
  var onCaptureFailure: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  var options: js.UndefOr[CaptureOptions] = js.undefined
  /**
    * style prop as ViewStyle
    */
  var style: js.UndefOr[ViewStyle] = js.undefined
}

object ViewShotProperties {
  @scala.inline
  def apply(
    captureMode: mount | continuous | update = null,
    onCapture: /* uri */ String => Callback = null,
    onCaptureFailure: /* error */ js.Error => Callback = null,
    options: CaptureOptions = null,
    style: ViewStyle = null
  ): ViewShotProperties = {
    val __obj = js.Dynamic.literal()
    if (captureMode != null) __obj.updateDynamic("captureMode")(captureMode.asInstanceOf[js.Any])
    if (onCapture != null) __obj.updateDynamic("onCapture")(js.Any.fromFunction1((t0: /* uri */ java.lang.String) => onCapture(t0).runNow()))
    if (onCaptureFailure != null) __obj.updateDynamic("onCaptureFailure")(js.Any.fromFunction1((t0: /* error */ js.Error) => onCaptureFailure(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewShotProperties]
  }
}

