package typingsJapgolly.braintreeWebDropIn.mod

import typingsJapgolly.braintreeWebDropIn.braintreeWebDropInStrings.card
import typingsJapgolly.braintreeWebDropIn.braintreeWebDropInStrings.paypal
import typingsJapgolly.braintreeWebDropIn.braintreeWebDropInStrings.paypalCredit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentOptionSelectedPayload extends StObject {
  
  var paymentOption: card | paypal | paypalCredit
}
object PaymentOptionSelectedPayload {
  
  inline def apply(paymentOption: card | paypal | paypalCredit): PaymentOptionSelectedPayload = {
    val __obj = js.Dynamic.literal(paymentOption = paymentOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentOptionSelectedPayload]
  }
  
  extension [Self <: PaymentOptionSelectedPayload](x: Self) {
    
    inline def setPaymentOption(value: card | paypal | paypalCredit): Self = StObject.set(x, "paymentOption", value.asInstanceOf[js.Any])
  }
}
