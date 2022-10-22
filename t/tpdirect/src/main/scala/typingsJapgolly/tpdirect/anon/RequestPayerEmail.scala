package typingsJapgolly.tpdirect.anon

import typingsJapgolly.tpdirect.tpdirectStrings.delivery
import typingsJapgolly.tpdirect.tpdirectStrings.pickup
import typingsJapgolly.tpdirect.tpdirectStrings.shipping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestPayerEmail extends StObject {
  
  var requestPayerEmail: Boolean
  
  var requestPayerName: Boolean
  
  var requestPayerPhone: Boolean
  
  var requestShipping: Boolean
  
  var shippingType: shipping | delivery | pickup
}
object RequestPayerEmail {
  
  inline def apply(
    requestPayerEmail: Boolean,
    requestPayerName: Boolean,
    requestPayerPhone: Boolean,
    requestShipping: Boolean,
    shippingType: shipping | delivery | pickup
  ): RequestPayerEmail = {
    val __obj = js.Dynamic.literal(requestPayerEmail = requestPayerEmail.asInstanceOf[js.Any], requestPayerName = requestPayerName.asInstanceOf[js.Any], requestPayerPhone = requestPayerPhone.asInstanceOf[js.Any], requestShipping = requestShipping.asInstanceOf[js.Any], shippingType = shippingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPayerEmail]
  }
  
  extension [Self <: RequestPayerEmail](x: Self) {
    
    inline def setRequestPayerEmail(value: Boolean): Self = StObject.set(x, "requestPayerEmail", value.asInstanceOf[js.Any])
    
    inline def setRequestPayerName(value: Boolean): Self = StObject.set(x, "requestPayerName", value.asInstanceOf[js.Any])
    
    inline def setRequestPayerPhone(value: Boolean): Self = StObject.set(x, "requestPayerPhone", value.asInstanceOf[js.Any])
    
    inline def setRequestShipping(value: Boolean): Self = StObject.set(x, "requestShipping", value.asInstanceOf[js.Any])
    
    inline def setShippingType(value: shipping | delivery | pickup): Self = StObject.set(x, "shippingType", value.asInstanceOf[js.Any])
  }
}
