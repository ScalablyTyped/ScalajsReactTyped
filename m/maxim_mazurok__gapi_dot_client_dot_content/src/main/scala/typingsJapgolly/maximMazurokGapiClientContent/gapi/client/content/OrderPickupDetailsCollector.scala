package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderPickupDetailsCollector extends StObject {
  
  /** Name of the person picking up the shipment. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Phone number of the person picking up the shipment. */
  var phoneNumber: js.UndefOr[String] = js.undefined
}
object OrderPickupDetailsCollector {
  
  inline def apply(): OrderPickupDetailsCollector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderPickupDetailsCollector]
  }
  
  extension [Self <: OrderPickupDetailsCollector](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}
