package typingsJapgolly.winrt.Windows.Media.PlayTo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlayToReceiver extends StObject {
  
  var friendlyName: String
  
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
  
  var oncurrenttimechangerequested: Any
  
  var onmutechangerequested: Any
  
  var onpauserequested: Any
  
  var onplaybackratechangerequested: Any
  
  var onplayrequested: Any
  
  var onsourcechangerequested: Any
  
  var onstoprequested: Any
  
  var ontimeupdaterequested: Any
  
  var onvolumechangerequested: Any
  
  var properties: IPropertySet
  
  def startAsync(): IAsyncAction
  
  def stopAsync(): IAsyncAction
  
  var supportsAudio: Boolean
  
  var supportsImage: Boolean
  
  var supportsVideo: Boolean
}
object IPlayToReceiver {
  
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
  ): IPlayToReceiver = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], notifyDurationChange = js.Any.fromFunction1((t0: Double) => notifyDurationChange(t0).runNow()), notifyEnded = notifyEnded.toJsFn, notifyError = notifyError.toJsFn, notifyLoadedMetadata = notifyLoadedMetadata.toJsFn, notifyPaused = notifyPaused.toJsFn, notifyPlaying = notifyPlaying.toJsFn, notifyRateChange = js.Any.fromFunction1((t0: Double) => notifyRateChange(t0).runNow()), notifySeeked = notifySeeked.toJsFn, notifySeeking = notifySeeking.toJsFn, notifyStopped = notifyStopped.toJsFn, notifyTimeUpdate = js.Any.fromFunction1((t0: Double) => notifyTimeUpdate(t0).runNow()), notifyVolumeChange = js.Any.fromFunction2((t0: Double, t1: Boolean) => (notifyVolumeChange(t0, t1)).runNow()), oncurrenttimechangerequested = oncurrenttimechangerequested.asInstanceOf[js.Any], onmutechangerequested = onmutechangerequested.asInstanceOf[js.Any], onpauserequested = onpauserequested.asInstanceOf[js.Any], onplaybackratechangerequested = onplaybackratechangerequested.asInstanceOf[js.Any], onplayrequested = onplayrequested.asInstanceOf[js.Any], onsourcechangerequested = onsourcechangerequested.asInstanceOf[js.Any], onstoprequested = onstoprequested.asInstanceOf[js.Any], ontimeupdaterequested = ontimeupdaterequested.asInstanceOf[js.Any], onvolumechangerequested = onvolumechangerequested.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], startAsync = startAsync.toJsFn, stopAsync = stopAsync.toJsFn, supportsAudio = supportsAudio.asInstanceOf[js.Any], supportsImage = supportsImage.asInstanceOf[js.Any], supportsVideo = supportsVideo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToReceiver]
  }
  
  extension [Self <: IPlayToReceiver](x: Self) {
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setNotifyDurationChange(value: Double => Callback): Self = StObject.set(x, "notifyDurationChange", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setNotifyEnded(value: Callback): Self = StObject.set(x, "notifyEnded", value.toJsFn)
    
    inline def setNotifyError(value: Callback): Self = StObject.set(x, "notifyError", value.toJsFn)
    
    inline def setNotifyLoadedMetadata(value: Callback): Self = StObject.set(x, "notifyLoadedMetadata", value.toJsFn)
    
    inline def setNotifyPaused(value: Callback): Self = StObject.set(x, "notifyPaused", value.toJsFn)
    
    inline def setNotifyPlaying(value: Callback): Self = StObject.set(x, "notifyPlaying", value.toJsFn)
    
    inline def setNotifyRateChange(value: Double => Callback): Self = StObject.set(x, "notifyRateChange", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setNotifySeeked(value: Callback): Self = StObject.set(x, "notifySeeked", value.toJsFn)
    
    inline def setNotifySeeking(value: Callback): Self = StObject.set(x, "notifySeeking", value.toJsFn)
    
    inline def setNotifyStopped(value: Callback): Self = StObject.set(x, "notifyStopped", value.toJsFn)
    
    inline def setNotifyTimeUpdate(value: Double => Callback): Self = StObject.set(x, "notifyTimeUpdate", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setNotifyVolumeChange(value: (Double, Boolean) => Callback): Self = StObject.set(x, "notifyVolumeChange", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setOncurrenttimechangerequested(value: Any): Self = StObject.set(x, "oncurrenttimechangerequested", value.asInstanceOf[js.Any])
    
    inline def setOnmutechangerequested(value: Any): Self = StObject.set(x, "onmutechangerequested", value.asInstanceOf[js.Any])
    
    inline def setOnpauserequested(value: Any): Self = StObject.set(x, "onpauserequested", value.asInstanceOf[js.Any])
    
    inline def setOnplaybackratechangerequested(value: Any): Self = StObject.set(x, "onplaybackratechangerequested", value.asInstanceOf[js.Any])
    
    inline def setOnplayrequested(value: Any): Self = StObject.set(x, "onplayrequested", value.asInstanceOf[js.Any])
    
    inline def setOnsourcechangerequested(value: Any): Self = StObject.set(x, "onsourcechangerequested", value.asInstanceOf[js.Any])
    
    inline def setOnstoprequested(value: Any): Self = StObject.set(x, "onstoprequested", value.asInstanceOf[js.Any])
    
    inline def setOntimeupdaterequested(value: Any): Self = StObject.set(x, "ontimeupdaterequested", value.asInstanceOf[js.Any])
    
    inline def setOnvolumechangerequested(value: Any): Self = StObject.set(x, "onvolumechangerequested", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setStartAsync(value: CallbackTo[IAsyncAction]): Self = StObject.set(x, "startAsync", value.toJsFn)
    
    inline def setStopAsync(value: CallbackTo[IAsyncAction]): Self = StObject.set(x, "stopAsync", value.toJsFn)
    
    inline def setSupportsAudio(value: Boolean): Self = StObject.set(x, "supportsAudio", value.asInstanceOf[js.Any])
    
    inline def setSupportsImage(value: Boolean): Self = StObject.set(x, "supportsImage", value.asInstanceOf[js.Any])
    
    inline def setSupportsVideo(value: Boolean): Self = StObject.set(x, "supportsVideo", value.asInstanceOf[js.Any])
  }
}
