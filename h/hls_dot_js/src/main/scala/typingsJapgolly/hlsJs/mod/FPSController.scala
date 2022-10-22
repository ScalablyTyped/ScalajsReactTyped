package typingsJapgolly.hlsJs.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLVideoElement
import typingsJapgolly.hlsJs.mod.Events.MEDIA_ATTACHING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FPSController
  extends StObject
     with ComponentAPI {
  
  def checkFPS(video: HTMLVideoElement, decodedFrames: Double, droppedFrames: Double): Unit
  
  def checkFPSInterval(): Unit
  
  /* private */ var hls: Any
  
  /* private */ var isVideoPlaybackQualityAvailable: Any
  
  /* private */ var lastDecodedFrames: Any
  
  /* private */ var lastDroppedFrames: Any
  
  /* private */ var lastTime: Any
  
  /* private */ var media: Any
  
  /* protected */ def onMediaAttaching(event: MEDIA_ATTACHING, data: MediaAttachingData): Unit
  
  /* protected */ def registerListeners(): Unit
  
  def setStreamController(streamController: StreamController): Unit
  
  /* private */ var streamController: Any
  
  /* private */ var timer: Any
  
  /* protected */ def unregisterListeners(): Unit
}
object FPSController {
  
  inline def apply(
    checkFPS: (HTMLVideoElement, Double, Double) => Callback,
    checkFPSInterval: Callback,
    destroy: Callback,
    hls: Any,
    isVideoPlaybackQualityAvailable: Any,
    lastDecodedFrames: Any,
    lastDroppedFrames: Any,
    lastTime: Any,
    media: Any,
    onMediaAttaching: (MEDIA_ATTACHING, MediaAttachingData) => Callback,
    registerListeners: Callback,
    setStreamController: StreamController => Callback,
    streamController: Any,
    timer: Any,
    unregisterListeners: Callback
  ): FPSController = {
    val __obj = js.Dynamic.literal(checkFPS = js.Any.fromFunction3((t0: HTMLVideoElement, t1: Double, t2: Double) => (checkFPS(t0, t1, t2)).runNow()), checkFPSInterval = checkFPSInterval.toJsFn, destroy = destroy.toJsFn, hls = hls.asInstanceOf[js.Any], isVideoPlaybackQualityAvailable = isVideoPlaybackQualityAvailable.asInstanceOf[js.Any], lastDecodedFrames = lastDecodedFrames.asInstanceOf[js.Any], lastDroppedFrames = lastDroppedFrames.asInstanceOf[js.Any], lastTime = lastTime.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], onMediaAttaching = js.Any.fromFunction2((t0: MEDIA_ATTACHING, t1: MediaAttachingData) => (onMediaAttaching(t0, t1)).runNow()), registerListeners = registerListeners.toJsFn, setStreamController = js.Any.fromFunction1((t0: StreamController) => setStreamController(t0).runNow()), streamController = streamController.asInstanceOf[js.Any], timer = timer.asInstanceOf[js.Any], unregisterListeners = unregisterListeners.toJsFn)
    __obj.asInstanceOf[FPSController]
  }
  
  extension [Self <: FPSController](x: Self) {
    
    inline def setCheckFPS(value: (HTMLVideoElement, Double, Double) => Callback): Self = StObject.set(x, "checkFPS", js.Any.fromFunction3((t0: HTMLVideoElement, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setCheckFPSInterval(value: Callback): Self = StObject.set(x, "checkFPSInterval", value.toJsFn)
    
    inline def setHls(value: Any): Self = StObject.set(x, "hls", value.asInstanceOf[js.Any])
    
    inline def setIsVideoPlaybackQualityAvailable(value: Any): Self = StObject.set(x, "isVideoPlaybackQualityAvailable", value.asInstanceOf[js.Any])
    
    inline def setLastDecodedFrames(value: Any): Self = StObject.set(x, "lastDecodedFrames", value.asInstanceOf[js.Any])
    
    inline def setLastDroppedFrames(value: Any): Self = StObject.set(x, "lastDroppedFrames", value.asInstanceOf[js.Any])
    
    inline def setLastTime(value: Any): Self = StObject.set(x, "lastTime", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: Any): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setOnMediaAttaching(value: (MEDIA_ATTACHING, MediaAttachingData) => Callback): Self = StObject.set(x, "onMediaAttaching", js.Any.fromFunction2((t0: MEDIA_ATTACHING, t1: MediaAttachingData) => (value(t0, t1)).runNow()))
    
    inline def setRegisterListeners(value: Callback): Self = StObject.set(x, "registerListeners", value.toJsFn)
    
    inline def setSetStreamController(value: StreamController => Callback): Self = StObject.set(x, "setStreamController", js.Any.fromFunction1((t0: StreamController) => value(t0).runNow()))
    
    inline def setStreamController(value: Any): Self = StObject.set(x, "streamController", value.asInstanceOf[js.Any])
    
    inline def setTimer(value: Any): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
    
    inline def setUnregisterListeners(value: Callback): Self = StObject.set(x, "unregisterListeners", value.toJsFn)
  }
}
