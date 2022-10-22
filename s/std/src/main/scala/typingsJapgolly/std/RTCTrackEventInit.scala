package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCTrackEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var receiver: RTCRtpReceiver
  
  /* standard dom */
  var streams: js.UndefOr[js.Array[org.scalajs.dom.MediaStream]] = js.undefined
  
  /* standard dom */
  var track: org.scalajs.dom.MediaStreamTrack
  
  /* standard dom */
  var transceiver: RTCRtpTransceiver
}
object RTCTrackEventInit {
  
  inline def apply(receiver: RTCRtpReceiver, track: org.scalajs.dom.MediaStreamTrack, transceiver: RTCRtpTransceiver): RTCTrackEventInit = {
    val __obj = js.Dynamic.literal(receiver = receiver.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], transceiver = transceiver.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCTrackEventInit]
  }
  
  extension [Self <: RTCTrackEventInit](x: Self) {
    
    inline def setReceiver(value: RTCRtpReceiver): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    inline def setStreams(value: js.Array[org.scalajs.dom.MediaStream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
    
    inline def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
    
    inline def setStreamsVarargs(value: org.scalajs.dom.MediaStream*): Self = StObject.set(x, "streams", js.Array(value*))
    
    inline def setTrack(value: org.scalajs.dom.MediaStreamTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTransceiver(value: RTCRtpTransceiver): Self = StObject.set(x, "transceiver", value.asInstanceOf[js.Any])
  }
}
