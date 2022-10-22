package typingsJapgolly.webrtc

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.MediaDeviceInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaDevices extends StObject {
  
  def enumerateDevices(): js.Promise[js.Array[MediaDeviceInfo]]
  
  def getSupportedConstraints(): MediaTrackSupportedConstraints
  
  def getUserMedia(constraints: MediaStreamConstraints): js.Promise[MediaStream]
}
object MediaDevices {
  
  inline def apply(
    enumerateDevices: CallbackTo[js.Promise[js.Array[MediaDeviceInfo]]],
    getSupportedConstraints: CallbackTo[MediaTrackSupportedConstraints],
    getUserMedia: MediaStreamConstraints => js.Promise[MediaStream]
  ): MediaDevices = {
    val __obj = js.Dynamic.literal(enumerateDevices = enumerateDevices.toJsFn, getSupportedConstraints = getSupportedConstraints.toJsFn, getUserMedia = js.Any.fromFunction1(getUserMedia))
    __obj.asInstanceOf[MediaDevices]
  }
  
  extension [Self <: MediaDevices](x: Self) {
    
    inline def setEnumerateDevices(value: CallbackTo[js.Promise[js.Array[MediaDeviceInfo]]]): Self = StObject.set(x, "enumerateDevices", value.toJsFn)
    
    inline def setGetSupportedConstraints(value: CallbackTo[MediaTrackSupportedConstraints]): Self = StObject.set(x, "getSupportedConstraints", value.toJsFn)
    
    inline def setGetUserMedia(value: MediaStreamConstraints => js.Promise[MediaStream]): Self = StObject.set(x, "getUserMedia", js.Any.fromFunction1(value))
  }
}
