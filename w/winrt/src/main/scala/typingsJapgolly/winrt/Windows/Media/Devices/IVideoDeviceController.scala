package typingsJapgolly.winrt.Windows.Media.Devices

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.AnonValue
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Media.Capture.MediaStreamType
import typingsJapgolly.winrt.Windows.Media.Capture.PowerlineFrequency
import typingsJapgolly.winrt.Windows.Media.MediaProperties.IMediaEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVideoDeviceController extends IMediaDeviceController {
  var backlightCompensation: MediaDeviceControl
  var brightness: MediaDeviceControl
  var contrast: MediaDeviceControl
  var exposure: MediaDeviceControl
  var focus: MediaDeviceControl
  var hue: MediaDeviceControl
  var pan: MediaDeviceControl
  var roll: MediaDeviceControl
  var tilt: MediaDeviceControl
  var whiteBalance: MediaDeviceControl
  var zoom: MediaDeviceControl
  def tryGetPowerlineFrequency(): AnonValue
  def trySetPowerlineFrequency(value: PowerlineFrequency): Boolean
}

object IVideoDeviceController {
  @scala.inline
  def apply(
    backlightCompensation: MediaDeviceControl,
    brightness: MediaDeviceControl,
    contrast: MediaDeviceControl,
    exposure: MediaDeviceControl,
    focus: MediaDeviceControl,
    getAvailableMediaStreamProperties: MediaStreamType => CallbackTo[IVectorView[IMediaEncodingProperties]],
    getMediaStreamProperties: MediaStreamType => CallbackTo[IMediaEncodingProperties],
    hue: MediaDeviceControl,
    pan: MediaDeviceControl,
    roll: MediaDeviceControl,
    setMediaStreamPropertiesAsync: (MediaStreamType, IMediaEncodingProperties) => CallbackTo[IAsyncAction],
    tilt: MediaDeviceControl,
    tryGetPowerlineFrequency: CallbackTo[AnonValue],
    trySetPowerlineFrequency: PowerlineFrequency => CallbackTo[Boolean],
    whiteBalance: MediaDeviceControl,
    zoom: MediaDeviceControl
  ): IVideoDeviceController = {
    val __obj = js.Dynamic.literal(backlightCompensation = backlightCompensation.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], exposure = exposure.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], pan = pan.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any], tilt = tilt.asInstanceOf[js.Any], whiteBalance = whiteBalance.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.updateDynamic("getAvailableMediaStreamProperties")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Media.Capture.MediaStreamType) => getAvailableMediaStreamProperties(t0).runNow()))
    __obj.updateDynamic("getMediaStreamProperties")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Media.Capture.MediaStreamType) => getMediaStreamProperties(t0).runNow()))
    __obj.updateDynamic("setMediaStreamPropertiesAsync")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Media.Capture.MediaStreamType, t1: typingsJapgolly.winrt.Windows.Media.MediaProperties.IMediaEncodingProperties) => setMediaStreamPropertiesAsync(t0, t1).runNow()))
    __obj.updateDynamic("tryGetPowerlineFrequency")(tryGetPowerlineFrequency.toJsFn)
    __obj.updateDynamic("trySetPowerlineFrequency")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Media.Capture.PowerlineFrequency) => trySetPowerlineFrequency(t0).runNow()))
    __obj.asInstanceOf[IVideoDeviceController]
  }
}

