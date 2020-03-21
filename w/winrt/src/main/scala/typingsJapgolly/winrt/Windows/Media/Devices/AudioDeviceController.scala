package typingsJapgolly.winrt.Windows.Media.Devices

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Media.Capture.MediaStreamType
import typingsJapgolly.winrt.Windows.Media.MediaProperties.IMediaEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Devices.AudioDeviceController")
@js.native
class AudioDeviceController () extends IAudioDeviceController {
  /* CompleteClass */
  override var muted: Boolean = js.native
  /* CompleteClass */
  override var volumePercent: Double = js.native
  /* CompleteClass */
  override def getAvailableMediaStreamProperties(mediaStreamType: MediaStreamType): IVectorView[IMediaEncodingProperties] = js.native
  /* CompleteClass */
  override def getMediaStreamProperties(mediaStreamType: MediaStreamType): IMediaEncodingProperties = js.native
  /* CompleteClass */
  override def setMediaStreamPropertiesAsync(mediaStreamType: MediaStreamType, mediaEncodingProperties: IMediaEncodingProperties): IAsyncAction = js.native
}

