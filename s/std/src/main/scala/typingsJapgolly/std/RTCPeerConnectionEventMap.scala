package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCPeerConnectionEventMap extends StObject {
  
  /* standard dom */
  var connectionstatechange: org.scalajs.dom.Event
  
  /* standard dom */
  var datachannel: org.scalajs.dom.RTCDataChannelEvent
  
  /* standard dom */
  var icecandidate: org.scalajs.dom.RTCPeerConnectionIceEvent
  
  /* standard dom */
  var icecandidateerror: org.scalajs.dom.Event
  
  /* standard dom */
  var iceconnectionstatechange: org.scalajs.dom.Event
  
  /* standard dom */
  var icegatheringstatechange: org.scalajs.dom.Event
  
  /* standard dom */
  var negotiationneeded: org.scalajs.dom.Event
  
  /* standard dom */
  var signalingstatechange: org.scalajs.dom.Event
  
  /* standard dom */
  var track: RTCTrackEvent
}
object RTCPeerConnectionEventMap {
  
  inline def apply(
    connectionstatechange: org.scalajs.dom.Event,
    datachannel: org.scalajs.dom.RTCDataChannelEvent,
    icecandidate: org.scalajs.dom.RTCPeerConnectionIceEvent,
    icecandidateerror: org.scalajs.dom.Event,
    iceconnectionstatechange: org.scalajs.dom.Event,
    icegatheringstatechange: org.scalajs.dom.Event,
    negotiationneeded: org.scalajs.dom.Event,
    signalingstatechange: org.scalajs.dom.Event,
    track: RTCTrackEvent
  ): RTCPeerConnectionEventMap = {
    val __obj = js.Dynamic.literal(connectionstatechange = connectionstatechange.asInstanceOf[js.Any], datachannel = datachannel.asInstanceOf[js.Any], icecandidate = icecandidate.asInstanceOf[js.Any], icecandidateerror = icecandidateerror.asInstanceOf[js.Any], iceconnectionstatechange = iceconnectionstatechange.asInstanceOf[js.Any], icegatheringstatechange = icegatheringstatechange.asInstanceOf[js.Any], negotiationneeded = negotiationneeded.asInstanceOf[js.Any], signalingstatechange = signalingstatechange.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCPeerConnectionEventMap]
  }
  
  extension [Self <: RTCPeerConnectionEventMap](x: Self) {
    
    inline def setConnectionstatechange(value: org.scalajs.dom.Event): Self = StObject.set(x, "connectionstatechange", value.asInstanceOf[js.Any])
    
    inline def setDatachannel(value: org.scalajs.dom.RTCDataChannelEvent): Self = StObject.set(x, "datachannel", value.asInstanceOf[js.Any])
    
    inline def setIcecandidate(value: org.scalajs.dom.RTCPeerConnectionIceEvent): Self = StObject.set(x, "icecandidate", value.asInstanceOf[js.Any])
    
    inline def setIcecandidateerror(value: org.scalajs.dom.Event): Self = StObject.set(x, "icecandidateerror", value.asInstanceOf[js.Any])
    
    inline def setIceconnectionstatechange(value: org.scalajs.dom.Event): Self = StObject.set(x, "iceconnectionstatechange", value.asInstanceOf[js.Any])
    
    inline def setIcegatheringstatechange(value: org.scalajs.dom.Event): Self = StObject.set(x, "icegatheringstatechange", value.asInstanceOf[js.Any])
    
    inline def setNegotiationneeded(value: org.scalajs.dom.Event): Self = StObject.set(x, "negotiationneeded", value.asInstanceOf[js.Any])
    
    inline def setSignalingstatechange(value: org.scalajs.dom.Event): Self = StObject.set(x, "signalingstatechange", value.asInstanceOf[js.Any])
    
    inline def setTrack(value: RTCTrackEvent): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
