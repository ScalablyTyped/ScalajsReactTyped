package typingsJapgolly.braintreeWebDropIn.mod

import typingsJapgolly.braintreeWebDropIn.anon.CardType
import typingsJapgolly.braintreeWebDropIn.braintreeWebDropInStrings.AndroidPayCard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait googlePayPaymentMethodPayload
  extends StObject
     with PaymentMethodPayload {
  
  var binData: typingsJapgolly.braintreeWebDropIn.mod.binData
  
  var details: CardType
  
  var deviceData: js.UndefOr[String] = js.undefined
  
  var nonce: String
  
  var `type`: AndroidPayCard
}
object googlePayPaymentMethodPayload {
  
  inline def apply(binData: binData, details: CardType, nonce: String): googlePayPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AndroidPayCard")
    __obj.asInstanceOf[googlePayPaymentMethodPayload]
  }
  
  extension [Self <: googlePayPaymentMethodPayload](x: Self) {
    
    inline def setBinData(value: binData): Self = StObject.set(x, "binData", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: CardType): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDeviceData(value: String): Self = StObject.set(x, "deviceData", value.asInstanceOf[js.Any])
    
    inline def setDeviceDataUndefined: Self = StObject.set(x, "deviceData", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setType(value: AndroidPayCard): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
