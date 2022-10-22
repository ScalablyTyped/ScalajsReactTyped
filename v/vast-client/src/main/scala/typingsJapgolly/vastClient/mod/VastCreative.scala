package typingsJapgolly.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VastCreative extends StObject {
  
  var adId: String | Null
  
  var apiFramework: String | Null
  
  var id: String | Null
  
  var sequence: String | Double | Null
  
  var trackingEvents: VastTrackingEvents
  
  var `type`: String
}
object VastCreative {
  
  inline def apply(trackingEvents: VastTrackingEvents, `type`: String): VastCreative = {
    val __obj = js.Dynamic.literal(trackingEvents = trackingEvents.asInstanceOf[js.Any], adId = null, apiFramework = null, id = null, sequence = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCreative]
  }
  
  extension [Self <: VastCreative](x: Self) {
    
    inline def setAdId(value: String): Self = StObject.set(x, "adId", value.asInstanceOf[js.Any])
    
    inline def setAdIdNull: Self = StObject.set(x, "adId", null)
    
    inline def setApiFramework(value: String): Self = StObject.set(x, "apiFramework", value.asInstanceOf[js.Any])
    
    inline def setApiFrameworkNull: Self = StObject.set(x, "apiFramework", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setSequence(value: String | Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceNull: Self = StObject.set(x, "sequence", null)
    
    inline def setTrackingEvents(value: VastTrackingEvents): Self = StObject.set(x, "trackingEvents", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
