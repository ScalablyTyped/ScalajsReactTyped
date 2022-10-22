package typingsJapgolly.webrtc

import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCIceTransportEventMap extends StObject {
  
  var gatheringstatechange: Event
  
  var selectedcandidatepairchange: Event
  
  var statechange: Event
}
object RTCIceTransportEventMap {
  
  inline def apply(gatheringstatechange: Event, selectedcandidatepairchange: Event, statechange: Event): RTCIceTransportEventMap = {
    val __obj = js.Dynamic.literal(gatheringstatechange = gatheringstatechange.asInstanceOf[js.Any], selectedcandidatepairchange = selectedcandidatepairchange.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceTransportEventMap]
  }
  
  extension [Self <: RTCIceTransportEventMap](x: Self) {
    
    inline def setGatheringstatechange(value: Event): Self = StObject.set(x, "gatheringstatechange", value.asInstanceOf[js.Any])
    
    inline def setSelectedcandidatepairchange(value: Event): Self = StObject.set(x, "selectedcandidatepairchange", value.asInstanceOf[js.Any])
    
    inline def setStatechange(value: Event): Self = StObject.set(x, "statechange", value.asInstanceOf[js.Any])
  }
}
