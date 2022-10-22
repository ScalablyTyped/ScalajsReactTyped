package typingsJapgolly.paypalRestSdk.mod.invoice

import typingsJapgolly.paypalRestSdk.mod.Currency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentDetail
  extends StObject
     with Detail {
  
  var method: String
  
  var transaction_type: String
}
object PaymentDetail {
  
  inline def apply(
    amount: Currency,
    date: String,
    method: String,
    transaction_id: String,
    transaction_type: String,
    `type`: String
  ): PaymentDetail = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], transaction_id = transaction_id.asInstanceOf[js.Any], transaction_type = transaction_type.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDetail]
  }
  
  extension [Self <: PaymentDetail](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setTransaction_type(value: String): Self = StObject.set(x, "transaction_type", value.asInstanceOf[js.Any])
  }
}
