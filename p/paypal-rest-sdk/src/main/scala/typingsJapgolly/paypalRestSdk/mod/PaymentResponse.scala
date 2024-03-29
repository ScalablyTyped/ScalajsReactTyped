package typingsJapgolly.paypalRestSdk.mod

import typingsJapgolly.paypalRestSdk.anon.Paymentmethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentResponse
  extends StObject
     with Payment_
     with Response {
  
  /* InferMemberOverrides */
  override val create_time: js.UndefOr[String] = js.undefined
}
object PaymentResponse {
  
  inline def apply(httpStatusCode: Double, intent: String, payer: Paymentmethod, transactions: js.Array[Transaction]): PaymentResponse = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], payer = payer.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentResponse]
  }
  
  extension [Self <: PaymentResponse](x: Self) {
    
    inline def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
    
    inline def setCreate_timeUndefined: Self = StObject.set(x, "create_time", js.undefined)
  }
}
