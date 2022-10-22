package typingsJapgolly.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenChargeCardRequest extends StObject {
  
  var IP: js.UndefOr[String] = js.undefined
  
  var amount: String
  
  var country: js.UndefOr[String] = js.undefined
  
  var currency: String
  
  var device_fingerprint: js.UndefOr[String] = js.undefined
  
  var email: String
  
  var firstname: js.UndefOr[String] = js.undefined
  
  var lastname: js.UndefOr[String] = js.undefined
  
  var meta: js.UndefOr[String] = js.undefined
  
  var narration: js.UndefOr[String] = js.undefined
  
  var payment_plan: js.UndefOr[String] = js.undefined
  
  var subaccounts: js.UndefOr[js.Array[Any]] = js.undefined
  
  var token: String
  
  var txRef: String
}
object TokenChargeCardRequest {
  
  inline def apply(amount: String, currency: String, email: String, token: String, txRef: String): TokenChargeCardRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], txRef = txRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenChargeCardRequest]
  }
  
  extension [Self <: TokenChargeCardRequest](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDevice_fingerprint(value: String): Self = StObject.set(x, "device_fingerprint", value.asInstanceOf[js.Any])
    
    inline def setDevice_fingerprintUndefined: Self = StObject.set(x, "device_fingerprint", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setFirstname(value: String): Self = StObject.set(x, "firstname", value.asInstanceOf[js.Any])
    
    inline def setFirstnameUndefined: Self = StObject.set(x, "firstname", js.undefined)
    
    inline def setIP(value: String): Self = StObject.set(x, "IP", value.asInstanceOf[js.Any])
    
    inline def setIPUndefined: Self = StObject.set(x, "IP", js.undefined)
    
    inline def setLastname(value: String): Self = StObject.set(x, "lastname", value.asInstanceOf[js.Any])
    
    inline def setLastnameUndefined: Self = StObject.set(x, "lastname", js.undefined)
    
    inline def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setNarration(value: String): Self = StObject.set(x, "narration", value.asInstanceOf[js.Any])
    
    inline def setNarrationUndefined: Self = StObject.set(x, "narration", js.undefined)
    
    inline def setPayment_plan(value: String): Self = StObject.set(x, "payment_plan", value.asInstanceOf[js.Any])
    
    inline def setPayment_planUndefined: Self = StObject.set(x, "payment_plan", js.undefined)
    
    inline def setSubaccounts(value: js.Array[Any]): Self = StObject.set(x, "subaccounts", value.asInstanceOf[js.Any])
    
    inline def setSubaccountsUndefined: Self = StObject.set(x, "subaccounts", js.undefined)
    
    inline def setSubaccountsVarargs(value: Any*): Self = StObject.set(x, "subaccounts", js.Array(value*))
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTxRef(value: String): Self = StObject.set(x, "txRef", value.asInstanceOf[js.Any])
  }
}
