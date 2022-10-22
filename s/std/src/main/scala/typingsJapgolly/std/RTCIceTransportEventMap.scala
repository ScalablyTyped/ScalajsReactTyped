package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCIceTransportEventMap extends StObject {
  
  /* standard dom */
  var gatheringstatechange: org.scalajs.dom.Event
  
  /* standard dom */
  var statechange: org.scalajs.dom.Event
}
object RTCIceTransportEventMap {
  
  inline def apply(gatheringstatechange: org.scalajs.dom.Event, statechange: org.scalajs.dom.Event): RTCIceTransportEventMap = {
    val __obj = js.Dynamic.literal(gatheringstatechange = gatheringstatechange.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceTransportEventMap]
  }
  
  extension [Self <: RTCIceTransportEventMap](x: Self) {
    
    inline def setGatheringstatechange(value: org.scalajs.dom.Event): Self = StObject.set(x, "gatheringstatechange", value.asInstanceOf[js.Any])
    
    inline def setStatechange(value: org.scalajs.dom.Event): Self = StObject.set(x, "statechange", value.asInstanceOf[js.Any])
  }
}
