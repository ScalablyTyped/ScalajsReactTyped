package typingsJapgolly.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpcodecparameters
trait RTCRtpCodecParameters extends StObject {
  
  //clockRate: number;
  var channels: js.UndefOr[Double] = js.undefined
  
  //payloadType: number;
  var mimeType: String
  
  // default = 1
  var sdpFmtpLine: js.UndefOr[String] = js.undefined
}
object RTCRtpCodecParameters {
  
  inline def apply(mimeType: String): RTCRtpCodecParameters = {
    val __obj = js.Dynamic.literal(mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpCodecParameters]
  }
  
  extension [Self <: RTCRtpCodecParameters](x: Self) {
    
    inline def setChannels(value: Double): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setSdpFmtpLine(value: String): Self = StObject.set(x, "sdpFmtpLine", value.asInstanceOf[js.Any])
    
    inline def setSdpFmtpLineUndefined: Self = StObject.set(x, "sdpFmtpLine", js.undefined)
  }
}
