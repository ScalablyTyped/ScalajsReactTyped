package typingsJapgolly.winrt.Windows.Media.PlayTo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToReceiver extends js.Object {
  var friendlyName: String
  var oncurrenttimechangerequested: js.Any
  var onmutechangerequested: js.Any
  var onpauserequested: js.Any
  var onplaybackratechangerequested: js.Any
  var onplayrequested: js.Any
  var onsourcechangerequested: js.Any
  var onstoprequested: js.Any
  var ontimeupdaterequested: js.Any
  var onvolumechangerequested: js.Any
  var properties: IPropertySet
  var supportsAudio: Boolean
  var supportsImage: Boolean
  var supportsVideo: Boolean
  def notifyDurationChange(duration: Double): Unit
  def notifyEnded(): Unit
  def notifyError(): Unit
  def notifyLoadedMetadata(): Unit
  def notifyPaused(): Unit
  def notifyPlaying(): Unit
  def notifyRateChange(rate: Double): Unit
  def notifySeeked(): Unit
  def notifySeeking(): Unit
  def notifyStopped(): Unit
  def notifyTimeUpdate(currentTime: Double): Unit
  def notifyVolumeChange(volume: Double, mute: Boolean): Unit
  def startAsync(): IAsyncAction
  def stopAsync(): IAsyncAction
}

object IPlayToReceiver {
  @scala.inline
  def apply(
    friendlyName: String,
    notifyDurationChange: Double => Callback,
    notifyEnded: Callback,
    notifyError: Callback,
    notifyLoadedMetadata: Callback,
    notifyPaused: Callback,
    notifyPlaying: Callback,
    notifyRateChange: Double => Callback,
    notifySeeked: Callback,
    notifySeeking: Callback,
    notifyStopped: Callback,
    notifyTimeUpdate: Double => Callback,
    notifyVolumeChange: (Double, Boolean) => Callback,
    oncurrenttimechangerequested: js.Any,
    onmutechangerequested: js.Any,
    onpauserequested: js.Any,
    onplaybackratechangerequested: js.Any,
    onplayrequested: js.Any,
    onsourcechangerequested: js.Any,
    onstoprequested: js.Any,
    ontimeupdaterequested: js.Any,
    onvolumechangerequested: js.Any,
    properties: IPropertySet,
    startAsync: CallbackTo[IAsyncAction],
    stopAsync: CallbackTo[IAsyncAction],
    supportsAudio: Boolean,
    supportsImage: Boolean,
    supportsVideo: Boolean
  ): IPlayToReceiver = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], oncurrenttimechangerequested = oncurrenttimechangerequested.asInstanceOf[js.Any], onmutechangerequested = onmutechangerequested.asInstanceOf[js.Any], onpauserequested = onpauserequested.asInstanceOf[js.Any], onplaybackratechangerequested = onplaybackratechangerequested.asInstanceOf[js.Any], onplayrequested = onplayrequested.asInstanceOf[js.Any], onsourcechangerequested = onsourcechangerequested.asInstanceOf[js.Any], onstoprequested = onstoprequested.asInstanceOf[js.Any], ontimeupdaterequested = ontimeupdaterequested.asInstanceOf[js.Any], onvolumechangerequested = onvolumechangerequested.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], supportsAudio = supportsAudio.asInstanceOf[js.Any], supportsImage = supportsImage.asInstanceOf[js.Any], supportsVideo = supportsVideo.asInstanceOf[js.Any])
    __obj.updateDynamic("notifyDurationChange")(js.Any.fromFunction1((t0: scala.Double) => notifyDurationChange(t0).runNow()))
    __obj.updateDynamic("notifyEnded")(notifyEnded.toJsFn)
    __obj.updateDynamic("notifyError")(notifyError.toJsFn)
    __obj.updateDynamic("notifyLoadedMetadata")(notifyLoadedMetadata.toJsFn)
    __obj.updateDynamic("notifyPaused")(notifyPaused.toJsFn)
    __obj.updateDynamic("notifyPlaying")(notifyPlaying.toJsFn)
    __obj.updateDynamic("notifyRateChange")(js.Any.fromFunction1((t0: scala.Double) => notifyRateChange(t0).runNow()))
    __obj.updateDynamic("notifySeeked")(notifySeeked.toJsFn)
    __obj.updateDynamic("notifySeeking")(notifySeeking.toJsFn)
    __obj.updateDynamic("notifyStopped")(notifyStopped.toJsFn)
    __obj.updateDynamic("notifyTimeUpdate")(js.Any.fromFunction1((t0: scala.Double) => notifyTimeUpdate(t0).runNow()))
    __obj.updateDynamic("notifyVolumeChange")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => notifyVolumeChange(t0, t1).runNow()))
    __obj.updateDynamic("startAsync")(startAsync.toJsFn)
    __obj.updateDynamic("stopAsync")(stopAsync.toJsFn)
    __obj.asInstanceOf[IPlayToReceiver]
  }
}

