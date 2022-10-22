package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpTransceiverInit extends StObject {
  
  /* standard dom */
  var direction: js.UndefOr[RTCRtpTransceiverDirection] = js.undefined
  
  /* standard dom */
  var sendEncodings: js.UndefOr[js.Array[RTCRtpEncodingParameters]] = js.undefined
  
  /* standard dom */
  var streams: js.UndefOr[js.Array[org.scalajs.dom.MediaStream]] = js.undefined
}
object RTCRtpTransceiverInit {
  
  inline def apply(): RTCRtpTransceiverInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpTransceiverInit]
  }
  
  extension [Self <: RTCRtpTransceiverInit](x: Self) {
    
    inline def setDirection(value: RTCRtpTransceiverDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setSendEncodings(value: js.Array[RTCRtpEncodingParameters]): Self = StObject.set(x, "sendEncodings", value.asInstanceOf[js.Any])
    
    inline def setSendEncodingsUndefined: Self = StObject.set(x, "sendEncodings", js.undefined)
    
    inline def setSendEncodingsVarargs(value: RTCRtpEncodingParameters*): Self = StObject.set(x, "sendEncodings", js.Array(value*))
    
    inline def setStreams(value: js.Array[org.scalajs.dom.MediaStream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
    
    inline def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
    
    inline def setStreamsVarargs(value: org.scalajs.dom.MediaStream*): Self = StObject.set(x, "streams", js.Array(value*))
  }
}
