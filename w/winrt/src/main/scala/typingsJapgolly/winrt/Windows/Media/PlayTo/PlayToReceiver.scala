package typingsJapgolly.winrt.Windows.Media.PlayTo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayToReceiver
  extends StObject
     with IPlayToReceiver
object PlayToReceiver {
  
  inline def apply(
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
    oncurrenttimechangerequested: Any,
    onmutechangerequested: Any,
    onpauserequested: Any,
    onplaybackratechangerequested: Any,
    onplayrequested: Any,
    onsourcechangerequested: Any,
    onstoprequested: Any,
    ontimeupdaterequested: Any,
    onvolumechangerequested: Any,
    properties: IPropertySet,
    startAsync: CallbackTo[IAsyncAction],
    stopAsync: CallbackTo[IAsyncAction],
    supportsAudio: Boolean,
    supportsImage: Boolean,
    supportsVideo: Boolean
  ): PlayToReceiver = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], notifyDurationChange = js.Any.fromFunction1((t0: Double) => notifyDurationChange(t0).runNow()), notifyEnded = notifyEnded.toJsFn, notifyError = notifyError.toJsFn, notifyLoadedMetadata = notifyLoadedMetadata.toJsFn, notifyPaused = notifyPaused.toJsFn, notifyPlaying = notifyPlaying.toJsFn, notifyRateChange = js.Any.fromFunction1((t0: Double) => notifyRateChange(t0).runNow()), notifySeeked = notifySeeked.toJsFn, notifySeeking = notifySeeking.toJsFn, notifyStopped = notifyStopped.toJsFn, notifyTimeUpdate = js.Any.fromFunction1((t0: Double) => notifyTimeUpdate(t0).runNow()), notifyVolumeChange = js.Any.fromFunction2((t0: Double, t1: Boolean) => (notifyVolumeChange(t0, t1)).runNow()), oncurrenttimechangerequested = oncurrenttimechangerequested.asInstanceOf[js.Any], onmutechangerequested = onmutechangerequested.asInstanceOf[js.Any], onpauserequested = onpauserequested.asInstanceOf[js.Any], onplaybackratechangerequested = onplaybackratechangerequested.asInstanceOf[js.Any], onplayrequested = onplayrequested.asInstanceOf[js.Any], onsourcechangerequested = onsourcechangerequested.asInstanceOf[js.Any], onstoprequested = onstoprequested.asInstanceOf[js.Any], ontimeupdaterequested = ontimeupdaterequested.asInstanceOf[js.Any], onvolumechangerequested = onvolumechangerequested.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], startAsync = startAsync.toJsFn, stopAsync = stopAsync.toJsFn, supportsAudio = supportsAudio.asInstanceOf[js.Any], supportsImage = supportsImage.asInstanceOf[js.Any], supportsVideo = supportsVideo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToReceiver]
  }
}
