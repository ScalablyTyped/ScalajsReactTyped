package typingsJapgolly.facebookJsSdk.facebook

import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.completed
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.initiated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayDialogResponse
  extends StObject
     with DialogResponse {
  
  var amount: String
  
  var currency: String
  
  var payment_id: String
  
  var quantity: String
  
  var request_id: js.UndefOr[String] = js.undefined
  
  var signed_request: String
  
  var status: completed | initiated
}
object PayDialogResponse {
  
  inline def apply(
    amount: String,
    currency: String,
    payment_id: String,
    quantity: String,
    signed_request: String,
    status: completed | initiated
  ): PayDialogResponse = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], payment_id = payment_id.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], signed_request = signed_request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayDialogResponse]
  }
  
  extension [Self <: PayDialogResponse](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setPayment_id(value: String): Self = StObject.set(x, "payment_id", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: String): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
    
    inline def setRequest_idUndefined: Self = StObject.set(x, "request_id", js.undefined)
    
    inline def setSigned_request(value: String): Self = StObject.set(x, "signed_request", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: completed | initiated): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
