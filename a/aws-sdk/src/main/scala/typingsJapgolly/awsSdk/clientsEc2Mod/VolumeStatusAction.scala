package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeStatusAction extends StObject {
  
  /**
    * The code identifying the operation, for example, enable-volume-io.
    */
  var Code: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the operation.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the event associated with this operation.
    */
  var EventId: js.UndefOr[String] = js.undefined
  
  /**
    * The event type associated with this operation.
    */
  var EventType: js.UndefOr[String] = js.undefined
}
object VolumeStatusAction {
  
  inline def apply(): VolumeStatusAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeStatusAction]
  }
  
  extension [Self <: VolumeStatusAction](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEventId(value: String): Self = StObject.set(x, "EventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "EventId", js.undefined)
    
    inline def setEventType(value: String): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "EventType", js.undefined)
  }
}
