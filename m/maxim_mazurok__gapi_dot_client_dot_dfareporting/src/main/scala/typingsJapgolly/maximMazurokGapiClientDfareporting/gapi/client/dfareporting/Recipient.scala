package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recipient extends StObject {
  
  /** The delivery type for the recipient. */
  var deliveryType: js.UndefOr[String] = js.undefined
  
  /** The email address of the recipient. */
  var email: js.UndefOr[String] = js.undefined
  
  /** The kind of resource this is, in this case dfareporting#recipient. */
  var kind: js.UndefOr[String] = js.undefined
}
object Recipient {
  
  inline def apply(): Recipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recipient]
  }
  
  extension [Self <: Recipient](x: Self) {
    
    inline def setDeliveryType(value: String): Self = StObject.set(x, "deliveryType", value.asInstanceOf[js.Any])
    
    inline def setDeliveryTypeUndefined: Self = StObject.set(x, "deliveryType", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
