package typingsJapgolly.braintreeWebDropIn.mod

import typingsJapgolly.braintreeWebDropIn.anon.BillingAddress
import typingsJapgolly.braintreeWebDropIn.anon.Bin
import typingsJapgolly.braintreeWebDropIn.anon.CardHolderName
import typingsJapgolly.braintreeWebDropIn.anon.CardType
import typingsJapgolly.braintreeWebDropIn.anon.Username
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.braintreeWebDropIn.mod.applePayPaymentMethodPayload
  - typingsJapgolly.braintreeWebDropIn.mod.cardPaymentMethodPayload
  - typingsJapgolly.braintreeWebDropIn.mod.googlePayPaymentMethodPayload
  - typingsJapgolly.braintreeWebDropIn.mod.paypalPaymentMethodPayload
  - typingsJapgolly.braintreeWebDropIn.mod.venmoPaymentMethodPayload
*/
trait PaymentMethodPayload extends StObject
object PaymentMethodPayload {
  
  inline def applePayPaymentMethodPayload(binData: binData, description: String, details: CardHolderName, nonce: String): typingsJapgolly.braintreeWebDropIn.mod.applePayPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ApplePayCard")
    __obj.asInstanceOf[typingsJapgolly.braintreeWebDropIn.mod.applePayPaymentMethodPayload]
  }
  
  inline def cardPaymentMethodPayload(binData: binData, details: Bin, nonce: String): typingsJapgolly.braintreeWebDropIn.mod.cardPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CreditCard")
    __obj.asInstanceOf[typingsJapgolly.braintreeWebDropIn.mod.cardPaymentMethodPayload]
  }
  
  inline def googlePayPaymentMethodPayload(binData: binData, details: CardType, nonce: String): typingsJapgolly.braintreeWebDropIn.mod.googlePayPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AndroidPayCard")
    __obj.asInstanceOf[typingsJapgolly.braintreeWebDropIn.mod.googlePayPaymentMethodPayload]
  }
  
  inline def paypalPaymentMethodPayload(details: BillingAddress, nonce: String): typingsJapgolly.braintreeWebDropIn.mod.paypalPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PayPalAccount")
    __obj.asInstanceOf[typingsJapgolly.braintreeWebDropIn.mod.paypalPaymentMethodPayload]
  }
  
  inline def venmoPaymentMethodPayload(details: Username, nonce: String): typingsJapgolly.braintreeWebDropIn.mod.venmoPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VenmoAccount")
    __obj.asInstanceOf[typingsJapgolly.braintreeWebDropIn.mod.venmoPaymentMethodPayload]
  }
}
