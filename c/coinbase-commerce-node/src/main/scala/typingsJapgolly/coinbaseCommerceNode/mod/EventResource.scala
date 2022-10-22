package typingsJapgolly.coinbaseCommerceNode.mod

import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColonconfirmed
import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColoncreated
import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColondelayed
import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColonfailed
import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColonpending
import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColonresolved
import typingsJapgolly.coinbaseCommerceNode.coinbaseCommerceNodeStrings.event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event Resource.
  *
  * @link
  */
trait EventResource[T] extends StObject {
  
  /**
    * API version of the `data` payload.
    */
  var api_version: String
  
  /**
    * Event creation time.
    */
  var created_at: Timestamp
  
  /**
    * Event Payload.
    * Resource of the associated object at the time of the event.
    */
  var data: T
  
  /**
    * Event UUID.
    */
  var id: String
  
  /**
    * Resource name.
    */
  var resource: event
  
  /**
    * Event type.
    */
  var `type`: chargeColoncreated | chargeColonconfirmed | chargeColonfailed | chargeColondelayed | chargeColonpending | chargeColonresolved
}
object EventResource {
  
  inline def apply[T](
    api_version: String,
    created_at: Timestamp,
    data: T,
    id: String,
    `type`: chargeColoncreated | chargeColonconfirmed | chargeColonfailed | chargeColondelayed | chargeColonpending | chargeColonresolved
  ): EventResource[T] = {
    val __obj = js.Dynamic.literal(api_version = api_version.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resource = "event")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventResource[T]]
  }
  
  extension [Self <: EventResource[?], T](x: Self & EventResource[T]) {
    
    inline def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: Timestamp): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setResource(value: event): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: chargeColoncreated | chargeColonconfirmed | chargeColonfailed | chargeColondelayed | chargeColonpending | chargeColonresolved
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
