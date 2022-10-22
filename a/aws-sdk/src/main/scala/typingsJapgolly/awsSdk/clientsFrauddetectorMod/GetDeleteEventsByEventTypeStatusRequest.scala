package typingsJapgolly.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeleteEventsByEventTypeStatusRequest extends StObject {
  
  /**
    * Name of event type for which to get the deletion status.
    */
  var eventTypeName: identifier
}
object GetDeleteEventsByEventTypeStatusRequest {
  
  inline def apply(eventTypeName: identifier): GetDeleteEventsByEventTypeStatusRequest = {
    val __obj = js.Dynamic.literal(eventTypeName = eventTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeleteEventsByEventTypeStatusRequest]
  }
  
  extension [Self <: GetDeleteEventsByEventTypeStatusRequest](x: Self) {
    
    inline def setEventTypeName(value: identifier): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
  }
}
