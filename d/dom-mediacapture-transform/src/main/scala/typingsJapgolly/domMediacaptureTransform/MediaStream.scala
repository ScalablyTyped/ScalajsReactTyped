package typingsJapgolly.domMediacaptureTransform

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Assert that getAudioTracks and getVideoTracks return the tracks with the appropriate kind. */
trait MediaStream extends StObject {
  
  def getAudioTracks(): js.Array[MediaStreamAudioTrack]
  
  def getVideoTracks(): js.Array[MediaStreamVideoTrack]
}
object MediaStream {
  
  inline def apply(
    getAudioTracks: CallbackTo[js.Array[MediaStreamAudioTrack]],
    getVideoTracks: CallbackTo[js.Array[MediaStreamVideoTrack]]
  ): MediaStream = {
    val __obj = js.Dynamic.literal(getAudioTracks = getAudioTracks.toJsFn, getVideoTracks = getVideoTracks.toJsFn)
    __obj.asInstanceOf[MediaStream]
  }
  
  extension [Self <: MediaStream](x: Self) {
    
    inline def setGetAudioTracks(value: CallbackTo[js.Array[MediaStreamAudioTrack]]): Self = StObject.set(x, "getAudioTracks", value.toJsFn)
    
    inline def setGetVideoTracks(value: CallbackTo[js.Array[MediaStreamVideoTrack]]): Self = StObject.set(x, "getVideoTracks", value.toJsFn)
  }
}
