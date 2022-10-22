package typingsJapgolly.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEventActionRequest extends StObject {
  
  /**
    * The unique identifier for the event action.
    */
  var EventActionId: string
}
object DeleteEventActionRequest {
  
  inline def apply(EventActionId: string): DeleteEventActionRequest = {
    val __obj = js.Dynamic.literal(EventActionId = EventActionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEventActionRequest]
  }
  
  extension [Self <: DeleteEventActionRequest](x: Self) {
    
    inline def setEventActionId(value: string): Self = StObject.set(x, "EventActionId", value.asInstanceOf[js.Any])
  }
}
