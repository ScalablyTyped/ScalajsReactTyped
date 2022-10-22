package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCStats extends StObject {
  
  /* standard dom */
  var id: java.lang.String
  
  /* standard dom */
  var timestamp: DOMHighResTimeStamp
  
  /* standard dom */
  var `type`: org.scalajs.dom.RTCStatsType
}
object RTCStats {
  
  inline def apply(id: java.lang.String, timestamp: DOMHighResTimeStamp, `type`: org.scalajs.dom.RTCStatsType): RTCStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCStats]
  }
  
  extension [Self <: RTCStats](x: Self) {
    
    inline def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: DOMHighResTimeStamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: org.scalajs.dom.RTCStatsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
