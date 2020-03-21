package typingsJapgolly.winrt.Windows.Media.Devices

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Media.Capture.MediaStreamType
import typingsJapgolly.winrt.Windows.Media.MediaProperties.IMediaEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAudioDeviceController extends IMediaDeviceController {
  var muted: Boolean
  var volumePercent: Double
}

object IAudioDeviceController {
  @scala.inline
  def apply(
    getAvailableMediaStreamProperties: MediaStreamType => CallbackTo[IVectorView[IMediaEncodingProperties]],
    getMediaStreamProperties: MediaStreamType => CallbackTo[IMediaEncodingProperties],
    muted: Boolean,
    setMediaStreamPropertiesAsync: (MediaStreamType, IMediaEncodingProperties) => CallbackTo[IAsyncAction],
    volumePercent: Double
  ): IAudioDeviceController = {
    val __obj = js.Dynamic.literal(muted = muted.asInstanceOf[js.Any], volumePercent = volumePercent.asInstanceOf[js.Any])
    __obj.updateDynamic("getAvailableMediaStreamProperties")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Media.Capture.MediaStreamType) => getAvailableMediaStreamProperties(t0).runNow()))
    __obj.updateDynamic("getMediaStreamProperties")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Media.Capture.MediaStreamType) => getMediaStreamProperties(t0).runNow()))
    __obj.updateDynamic("setMediaStreamPropertiesAsync")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Media.Capture.MediaStreamType, t1: typingsJapgolly.winrt.Windows.Media.MediaProperties.IMediaEncodingProperties) => setMediaStreamPropertiesAsync(t0, t1).runNow()))
    __obj.asInstanceOf[IAudioDeviceController]
  }
}

