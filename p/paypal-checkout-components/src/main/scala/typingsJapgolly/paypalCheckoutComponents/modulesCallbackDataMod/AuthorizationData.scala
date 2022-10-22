package typingsJapgolly.paypalCheckoutComponents.modulesCallbackDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationData extends StObject {
  
  var billingToken: js.UndefOr[String] = js.undefined
  
  var payerId: String
  
  var paymentId: js.UndefOr[String] = js.undefined
  
  var vault: js.UndefOr[Boolean] = js.undefined
}
object AuthorizationData {
  
  inline def apply(payerId: String): AuthorizationData = {
    val __obj = js.Dynamic.literal(payerId = payerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationData]
  }
  
  extension [Self <: AuthorizationData](x: Self) {
    
    inline def setBillingToken(value: String): Self = StObject.set(x, "billingToken", value.asInstanceOf[js.Any])
    
    inline def setBillingTokenUndefined: Self = StObject.set(x, "billingToken", js.undefined)
    
    inline def setPayerId(value: String): Self = StObject.set(x, "payerId", value.asInstanceOf[js.Any])
    
    inline def setPaymentId(value: String): Self = StObject.set(x, "paymentId", value.asInstanceOf[js.Any])
    
    inline def setPaymentIdUndefined: Self = StObject.set(x, "paymentId", js.undefined)
    
    inline def setVault(value: Boolean): Self = StObject.set(x, "vault", value.asInstanceOf[js.Any])
    
    inline def setVaultUndefined: Self = StObject.set(x, "vault", js.undefined)
  }
}
