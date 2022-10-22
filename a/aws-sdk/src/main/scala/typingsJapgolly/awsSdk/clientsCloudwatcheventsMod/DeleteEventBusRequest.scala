package typingsJapgolly.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEventBusRequest extends StObject {
  
  /**
    * The name of the event bus to delete.
    */
  var Name: EventBusName
}
object DeleteEventBusRequest {
  
  inline def apply(Name: EventBusName): DeleteEventBusRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEventBusRequest]
  }
  
  extension [Self <: DeleteEventBusRequest](x: Self) {
    
    inline def setName(value: EventBusName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
