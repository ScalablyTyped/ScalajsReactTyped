package typingsJapgolly.winrt.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaCaptureInitializationSettings extends js.Object {
  var audioDeviceId: String
  var photoCaptureSource: PhotoCaptureSource
  var streamingCaptureMode: StreamingCaptureMode
  var videoDeviceId: String
}

object IMediaCaptureInitializationSettings {
  @scala.inline
  def apply(
    audioDeviceId: String,
    photoCaptureSource: PhotoCaptureSource,
    streamingCaptureMode: StreamingCaptureMode,
    videoDeviceId: String
  ): IMediaCaptureInitializationSettings = {
    val __obj = js.Dynamic.literal(audioDeviceId = audioDeviceId.asInstanceOf[js.Any], photoCaptureSource = photoCaptureSource.asInstanceOf[js.Any], streamingCaptureMode = streamingCaptureMode.asInstanceOf[js.Any], videoDeviceId = videoDeviceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMediaCaptureInitializationSettings]
  }
}

