package typingsJapgolly.tpdirect

import japgolly.scalajs.react.Callback
import typingsJapgolly.tpdirect.anon.BaseResultMerchantReferenCard
import typingsJapgolly.tpdirect.anon.Countrycode
import typingsJapgolly.tpdirect.anon.Shape
import typingsJapgolly.tpdirect.anon.SupportedNetworks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SamsungPay extends StObject {
  
  def getPrime(callback: js.Function1[/* result */ BaseResultMerchantReferenCard, Unit]): Unit
  
  def setup(setting: Countrycode): Unit
  
  def setupPaymentRequest(paymentReqeuestData: SupportedNetworks): Unit
  
  def setupSamsungPayButton(element: String, setting: Shape): Unit
}
object SamsungPay {
  
  inline def apply(
    getPrime: js.Function1[/* result */ BaseResultMerchantReferenCard, Unit] => Callback,
    setup: Countrycode => Callback,
    setupPaymentRequest: SupportedNetworks => Callback,
    setupSamsungPayButton: (String, Shape) => Callback
  ): SamsungPay = {
    val __obj = js.Dynamic.literal(getPrime = js.Any.fromFunction1((t0: js.Function1[/* result */ BaseResultMerchantReferenCard, Unit]) => getPrime(t0).runNow()), setup = js.Any.fromFunction1((t0: Countrycode) => setup(t0).runNow()), setupPaymentRequest = js.Any.fromFunction1((t0: SupportedNetworks) => setupPaymentRequest(t0).runNow()), setupSamsungPayButton = js.Any.fromFunction2((t0: String, t1: Shape) => (setupSamsungPayButton(t0, t1)).runNow()))
    __obj.asInstanceOf[SamsungPay]
  }
  
  extension [Self <: SamsungPay](x: Self) {
    
    inline def setGetPrime(value: js.Function1[/* result */ BaseResultMerchantReferenCard, Unit] => Callback): Self = StObject.set(x, "getPrime", js.Any.fromFunction1((t0: js.Function1[/* result */ BaseResultMerchantReferenCard, Unit]) => value(t0).runNow()))
    
    inline def setSetup(value: Countrycode => Callback): Self = StObject.set(x, "setup", js.Any.fromFunction1((t0: Countrycode) => value(t0).runNow()))
    
    inline def setSetupPaymentRequest(value: SupportedNetworks => Callback): Self = StObject.set(x, "setupPaymentRequest", js.Any.fromFunction1((t0: SupportedNetworks) => value(t0).runNow()))
    
    inline def setSetupSamsungPayButton(value: (String, Shape) => Callback): Self = StObject.set(x, "setupSamsungPayButton", js.Any.fromFunction2((t0: String, t1: Shape) => (value(t0, t1)).runNow()))
  }
}
