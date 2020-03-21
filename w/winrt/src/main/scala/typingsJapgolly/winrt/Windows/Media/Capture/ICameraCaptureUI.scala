package typingsJapgolly.winrt.Windows.Media.Capture

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICameraCaptureUI extends js.Object {
  var photoSettings: CameraCaptureUIPhotoCaptureSettings
  var videoSettings: CameraCaptureUIVideoCaptureSettings
  def captureFileAsync(mode: CameraCaptureUIMode): IAsyncOperation[StorageFile]
}

object ICameraCaptureUI {
  @scala.inline
  def apply(
    captureFileAsync: CameraCaptureUIMode => CallbackTo[IAsyncOperation[StorageFile]],
    photoSettings: CameraCaptureUIPhotoCaptureSettings,
    videoSettings: CameraCaptureUIVideoCaptureSettings
  ): ICameraCaptureUI = {
    val __obj = js.Dynamic.literal(photoSettings = photoSettings.asInstanceOf[js.Any], videoSettings = videoSettings.asInstanceOf[js.Any])
    __obj.updateDynamic("captureFileAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Media.Capture.CameraCaptureUIMode) => captureFileAsync(t0).runNow()))
    __obj.asInstanceOf[ICameraCaptureUI]
  }
}

