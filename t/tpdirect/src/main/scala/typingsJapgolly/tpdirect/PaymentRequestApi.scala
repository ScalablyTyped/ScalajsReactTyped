package typingsJapgolly.tpdirect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tpdirect.anon.BaseResultMerchantReferen
import typingsJapgolly.tpdirect.anon.BrowserSupportPaymentRequest
import typingsJapgolly.tpdirect.anon.CountryCode_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentRequestApi extends StObject {
  
  /**
    * ```markdown
    * `true` support payment request api
    * `false` doesn't support payment request api
    * ```
    */
  def checkAvailability(): Boolean
  
  def getPrime(callback: js.Function1[/* result */ BaseResultMerchantReferen, Unit]): Unit
  
  def setupApplePay(applePaySetting: CountryCode_): Unit
  
  def setupPaymentRequest(
    paymentRequestData: PaymentRequestData,
    callback: js.Function1[/* result */ BrowserSupportPaymentRequest, Unit]
  ): Unit
}
object PaymentRequestApi {
  
  inline def apply(
    checkAvailability: CallbackTo[Boolean],
    getPrime: js.Function1[/* result */ BaseResultMerchantReferen, Unit] => Callback,
    setupApplePay: CountryCode_ => Callback,
    setupPaymentRequest: (PaymentRequestData, js.Function1[/* result */ BrowserSupportPaymentRequest, Unit]) => Callback
  ): PaymentRequestApi = {
    val __obj = js.Dynamic.literal(checkAvailability = checkAvailability.toJsFn, getPrime = js.Any.fromFunction1((t0: js.Function1[/* result */ BaseResultMerchantReferen, Unit]) => getPrime(t0).runNow()), setupApplePay = js.Any.fromFunction1((t0: CountryCode_) => setupApplePay(t0).runNow()), setupPaymentRequest = js.Any.fromFunction2((t0: PaymentRequestData, t1: js.Function1[/* result */ BrowserSupportPaymentRequest, Unit]) => (setupPaymentRequest(t0, t1)).runNow()))
    __obj.asInstanceOf[PaymentRequestApi]
  }
  
  extension [Self <: PaymentRequestApi](x: Self) {
    
    inline def setCheckAvailability(value: CallbackTo[Boolean]): Self = StObject.set(x, "checkAvailability", value.toJsFn)
    
    inline def setGetPrime(value: js.Function1[/* result */ BaseResultMerchantReferen, Unit] => Callback): Self = StObject.set(x, "getPrime", js.Any.fromFunction1((t0: js.Function1[/* result */ BaseResultMerchantReferen, Unit]) => value(t0).runNow()))
    
    inline def setSetupApplePay(value: CountryCode_ => Callback): Self = StObject.set(x, "setupApplePay", js.Any.fromFunction1((t0: CountryCode_) => value(t0).runNow()))
    
    inline def setSetupPaymentRequest(
      value: (PaymentRequestData, js.Function1[/* result */ BrowserSupportPaymentRequest, Unit]) => Callback
    ): Self = StObject.set(x, "setupPaymentRequest", js.Any.fromFunction2((t0: PaymentRequestData, t1: js.Function1[/* result */ BrowserSupportPaymentRequest, Unit]) => (value(t0, t1)).runNow()))
  }
}
