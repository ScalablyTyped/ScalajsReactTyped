package typingsJapgolly.webrtc

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtpreceiver
trait RTCRtpReceiver extends StObject {
  
  def getContributingSources(): js.Array[RTCRtpContributingSource]
  
  //readonly track?: MediaStreamTrack;
  //readonly transport?: RTCDtlsTransport;
  //readonly rtcpTransport?: RTCDtlsTransport;
  def getParameters(): RTCRtpParameters
}
object RTCRtpReceiver {
  
  inline def apply(
    getContributingSources: CallbackTo[js.Array[RTCRtpContributingSource]],
    getParameters: CallbackTo[RTCRtpParameters]
  ): RTCRtpReceiver = {
    val __obj = js.Dynamic.literal(getContributingSources = getContributingSources.toJsFn, getParameters = getParameters.toJsFn)
    __obj.asInstanceOf[RTCRtpReceiver]
  }
  
  extension [Self <: RTCRtpReceiver](x: Self) {
    
    inline def setGetContributingSources(value: CallbackTo[js.Array[RTCRtpContributingSource]]): Self = StObject.set(x, "getContributingSources", value.toJsFn)
    
    inline def setGetParameters(value: CallbackTo[RTCRtpParameters]): Self = StObject.set(x, "getParameters", value.toJsFn)
  }
}
