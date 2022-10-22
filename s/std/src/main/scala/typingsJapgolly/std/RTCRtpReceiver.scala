package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This WebRTC API interface manages the reception and decoding of data for a MediaStreamTrack on an RTCPeerConnection. */
trait RTCRtpReceiver extends StObject {
  
  /* standard dom */
  def getContributingSources(): js.Array[RTCRtpContributingSource]
  
  /* standard dom */
  def getParameters(): RTCRtpReceiveParameters
  
  /* standard dom */
  def getStats(): js.Promise[org.scalajs.dom.RTCStatsReport]
  
  /* standard dom */
  def getSynchronizationSources(): js.Array[RTCRtpSynchronizationSource]
  
  /* standard dom */
  val track: org.scalajs.dom.MediaStreamTrack
  
  /* standard dom */
  val transport: RTCDtlsTransport | Null
}
object RTCRtpReceiver {
  
  inline def apply(
    getContributingSources: CallbackTo[js.Array[RTCRtpContributingSource]],
    getParameters: CallbackTo[RTCRtpReceiveParameters],
    getStats: CallbackTo[js.Promise[org.scalajs.dom.RTCStatsReport]],
    getSynchronizationSources: CallbackTo[js.Array[RTCRtpSynchronizationSource]],
    track: org.scalajs.dom.MediaStreamTrack
  ): RTCRtpReceiver = {
    val __obj = js.Dynamic.literal(getContributingSources = getContributingSources.toJsFn, getParameters = getParameters.toJsFn, getStats = getStats.toJsFn, getSynchronizationSources = getSynchronizationSources.toJsFn, track = track.asInstanceOf[js.Any], transport = null)
    __obj.asInstanceOf[RTCRtpReceiver]
  }
  
  extension [Self <: RTCRtpReceiver](x: Self) {
    
    inline def setGetContributingSources(value: CallbackTo[js.Array[RTCRtpContributingSource]]): Self = StObject.set(x, "getContributingSources", value.toJsFn)
    
    inline def setGetParameters(value: CallbackTo[RTCRtpReceiveParameters]): Self = StObject.set(x, "getParameters", value.toJsFn)
    
    inline def setGetStats(value: CallbackTo[js.Promise[org.scalajs.dom.RTCStatsReport]]): Self = StObject.set(x, "getStats", value.toJsFn)
    
    inline def setGetSynchronizationSources(value: CallbackTo[js.Array[RTCRtpSynchronizationSource]]): Self = StObject.set(x, "getSynchronizationSources", value.toJsFn)
    
    inline def setTrack(value: org.scalajs.dom.MediaStreamTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTransport(value: RTCDtlsTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportNull: Self = StObject.set(x, "transport", null)
  }
}
