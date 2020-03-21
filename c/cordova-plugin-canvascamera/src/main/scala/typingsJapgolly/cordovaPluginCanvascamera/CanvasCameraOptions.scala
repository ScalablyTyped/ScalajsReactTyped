package typingsJapgolly.cordovaPluginCanvascamera

import japgolly.scalajs.react.Callback
import typingsJapgolly.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.back
import typingsJapgolly.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.data
import typingsJapgolly.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.file
import typingsJapgolly.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.front
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasCameraOptions extends js.Object {
  /**
    * String, optional, default: file, file to use files for rendering (lower CPU / higher storage) or data to use base64 jpg data for rendering (higher cpu / lower storage).
    */
  var cameraFacing: js.UndefOr[front | back] = js.undefined
  var canvas: js.UndefOr[AnonWidth] = js.undefined
  var capture: js.UndefOr[AnonWidth] = js.undefined
  /**
    * Boolean, optional, default: false, a boolean to set flash mode on/off.
    */
  var flashMode: js.UndefOr[Boolean] = js.undefined
  /**
    * Number, optional, default: 30, desired number of frames per second.
    */
  var fps: js.UndefOr[Double] = js.undefined
  /**
    * Number, optional, default: 288, height in pixels of the video to capture and the output canvas height in pixels.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Function, optional, default : null, callback executed after a frame has been drawn. frame contains the canvas element, the image element, the tracking data.
    */
  // tslint:disable-next-line:prefer-method-signature
  var onAfterDraw: js.UndefOr[js.Function1[/* frame */ js.UndefOr[Frame], Unit]] = js.undefined
  /**
    * Function, optional, default : null, callback executed before a frame has been drawn. frame contains the canvas element, the image element, the tracking data.
    */
  // tslint:disable-next-line:prefer-method-signature
  var onBeforeDraw: js.UndefOr[js.Function1[/* frame */ js.UndefOr[Frame], Unit]] = js.undefined
  /**
    * Number, optional, default: 1/6, a ratio used to scale down the thumbnail.
    */
  var thumbnailRatio: js.UndefOr[Double] = js.undefined
  /**
    * String, optional, default: 'front', 'front' or 'back'.
    */
  var use: js.UndefOr[file | data] = js.undefined
  /**
    * Number, optional, default: 352, width in pixels of the video to capture and the output canvas width in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CanvasCameraOptions {
  @scala.inline
  def apply(
    cameraFacing: front | back = null,
    canvas: AnonWidth = null,
    capture: AnonWidth = null,
    flashMode: js.UndefOr[Boolean] = js.undefined,
    fps: Int | Double = null,
    height: Int | Double = null,
    onAfterDraw: /* frame */ js.UndefOr[Frame] => Callback = null,
    onBeforeDraw: /* frame */ js.UndefOr[Frame] => Callback = null,
    thumbnailRatio: Int | Double = null,
    use: file | data = null,
    width: Int | Double = null
  ): CanvasCameraOptions = {
    val __obj = js.Dynamic.literal()
    if (cameraFacing != null) __obj.updateDynamic("cameraFacing")(cameraFacing.asInstanceOf[js.Any])
    if (canvas != null) __obj.updateDynamic("canvas")(canvas.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (!js.isUndefined(flashMode)) __obj.updateDynamic("flashMode")(flashMode.asInstanceOf[js.Any])
    if (fps != null) __obj.updateDynamic("fps")(fps.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onAfterDraw != null) __obj.updateDynamic("onAfterDraw")(js.Any.fromFunction1((t0: /* frame */ js.UndefOr[typingsJapgolly.cordovaPluginCanvascamera.Frame]) => onAfterDraw(t0).runNow()))
    if (onBeforeDraw != null) __obj.updateDynamic("onBeforeDraw")(js.Any.fromFunction1((t0: /* frame */ js.UndefOr[typingsJapgolly.cordovaPluginCanvascamera.Frame]) => onBeforeDraw(t0).runNow()))
    if (thumbnailRatio != null) __obj.updateDynamic("thumbnailRatio")(thumbnailRatio.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasCameraOptions]
  }
}

