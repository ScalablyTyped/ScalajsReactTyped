package typingsJapgolly.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpcodeccapability
trait RTCRtpCodecCapability extends StObject {
  
  var mimeType: String
}
object RTCRtpCodecCapability {
  
  inline def apply(mimeType: String): RTCRtpCodecCapability = {
    val __obj = js.Dynamic.literal(mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpCodecCapability]
  }
  
  extension [Self <: RTCRtpCodecCapability](x: Self) {
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
  }
}
