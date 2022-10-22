package typingsJapgolly.paypalCheckoutComponents.modulesCallbackDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancellationData extends StObject {
  
  var billingID: String
  
  var button_version: String
  
  var cancelUrl: String
  
  var intent: String
  
  var paymentID: String
  
  var paymentToken: String
}
object CancellationData {
  
  inline def apply(
    billingID: String,
    button_version: String,
    cancelUrl: String,
    intent: String,
    paymentID: String,
    paymentToken: String
  ): CancellationData = {
    val __obj = js.Dynamic.literal(billingID = billingID.asInstanceOf[js.Any], button_version = button_version.asInstanceOf[js.Any], cancelUrl = cancelUrl.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], paymentID = paymentID.asInstanceOf[js.Any], paymentToken = paymentToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancellationData]
  }
  
  extension [Self <: CancellationData](x: Self) {
    
    inline def setBillingID(value: String): Self = StObject.set(x, "billingID", value.asInstanceOf[js.Any])
    
    inline def setButton_version(value: String): Self = StObject.set(x, "button_version", value.asInstanceOf[js.Any])
    
    inline def setCancelUrl(value: String): Self = StObject.set(x, "cancelUrl", value.asInstanceOf[js.Any])
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setPaymentID(value: String): Self = StObject.set(x, "paymentID", value.asInstanceOf[js.Any])
    
    inline def setPaymentToken(value: String): Self = StObject.set(x, "paymentToken", value.asInstanceOf[js.Any])
  }
}
