package typingsJapgolly.winrt.Windows.Media.Devices

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaDeviceStatics extends js.Object {
  var ondefaultaudiocapturedevicechanged: js.Any
  var ondefaultaudiorenderdevicechanged: js.Any
  def getAudioCaptureSelector(): String
  def getAudioRenderSelector(): String
  def getDefaultAudioCaptureId(role: AudioDeviceRole): String
  def getDefaultAudioRenderId(role: AudioDeviceRole): String
  def getVideoCaptureSelector(): String
}

object IMediaDeviceStatics {
  @scala.inline
  def apply(
    getAudioCaptureSelector: CallbackTo[String],
    getAudioRenderSelector: CallbackTo[String],
    getDefaultAudioCaptureId: AudioDeviceRole => CallbackTo[String],
    getDefaultAudioRenderId: AudioDeviceRole => CallbackTo[String],
    getVideoCaptureSelector: CallbackTo[String],
    ondefaultaudiocapturedevicechanged: js.Any,
    ondefaultaudiorenderdevicechanged: js.Any
  ): IMediaDeviceStatics = {
    val __obj = js.Dynamic.literal(ondefaultaudiocapturedevicechanged = ondefaultaudiocapturedevicechanged.asInstanceOf[js.Any], ondefaultaudiorenderdevicechanged = ondefaultaudiorenderdevicechanged.asInstanceOf[js.Any])
    __obj.updateDynamic("getAudioCaptureSelector")(getAudioCaptureSelector.toJsFn)
    __obj.updateDynamic("getAudioRenderSelector")(getAudioRenderSelector.toJsFn)
    __obj.updateDynamic("getDefaultAudioCaptureId")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Media.Devices.AudioDeviceRole) => getDefaultAudioCaptureId(t0).runNow()))
    __obj.updateDynamic("getDefaultAudioRenderId")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Media.Devices.AudioDeviceRole) => getDefaultAudioRenderId(t0).runNow()))
    __obj.updateDynamic("getVideoCaptureSelector")(getVideoCaptureSelector.toJsFn)
    __obj.asInstanceOf[IMediaDeviceStatics]
  }
}

