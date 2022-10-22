package typingsJapgolly.tpdirect

import japgolly.scalajs.react.Callback
import typingsJapgolly.tpdirect.anon.AllowPrepaidCards
import typingsJapgolly.tpdirect.anon.Color
import typingsJapgolly.tpdirect.anon.Msg
import typingsJapgolly.tpdirect.anon.PickBaseResultclientipcar
import typingsJapgolly.tpdirect.anon.PickBaseResultprime
import typingsJapgolly.tpdirect.anon.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePay extends StObject {
  
  /**
    * @description Use either TPDirect.googlePay.getPrime(callback) or TPDirect.googlePay.setupGooglePayButton({getPrimeCallback})
    */
  def getPrime(
    callback: js.Function3[
      /* err */ Msg, 
      /* prime */ PickBaseResultprime, 
      /* result */ PickBaseResultclientipcar, 
      Unit
    ]
  ): Unit
  
  def setupGooglePay(setting: AllowPrepaidCards): Unit
  
  def setupGooglePayButton(setting: Color): Unit
  
  def setupPaymentRequest(paymentReqeuestData: typingsJapgolly.tpdirect.anon.AllowedNetworks): Unit
  
  def setupTransactionPrice(transactionPrice: Price): Unit
}
object GooglePay {
  
  inline def apply(
    getPrime: js.Function3[
      /* err */ Msg, 
      /* prime */ PickBaseResultprime, 
      /* result */ PickBaseResultclientipcar, 
      Unit
    ] => Callback,
    setupGooglePay: AllowPrepaidCards => Callback,
    setupGooglePayButton: Color => Callback,
    setupPaymentRequest: typingsJapgolly.tpdirect.anon.AllowedNetworks => Callback,
    setupTransactionPrice: Price => Callback
  ): GooglePay = {
    val __obj = js.Dynamic.literal(getPrime = js.Any.fromFunction1((t0: js.Function3[
      /* err */ Msg, 
      /* prime */ PickBaseResultprime, 
      /* result */ PickBaseResultclientipcar, 
      Unit
    ]) => getPrime(t0).runNow()), setupGooglePay = js.Any.fromFunction1((t0: AllowPrepaidCards) => setupGooglePay(t0).runNow()), setupGooglePayButton = js.Any.fromFunction1((t0: Color) => setupGooglePayButton(t0).runNow()), setupPaymentRequest = js.Any.fromFunction1((t0: typingsJapgolly.tpdirect.anon.AllowedNetworks) => setupPaymentRequest(t0).runNow()), setupTransactionPrice = js.Any.fromFunction1((t0: Price) => setupTransactionPrice(t0).runNow()))
    __obj.asInstanceOf[GooglePay]
  }
  
  extension [Self <: GooglePay](x: Self) {
    
    inline def setGetPrime(
      value: js.Function3[
          /* err */ Msg, 
          /* prime */ PickBaseResultprime, 
          /* result */ PickBaseResultclientipcar, 
          Unit
        ] => Callback
    ): Self = StObject.set(x, "getPrime", js.Any.fromFunction1((t0: js.Function3[
          /* err */ Msg, 
          /* prime */ PickBaseResultprime, 
          /* result */ PickBaseResultclientipcar, 
          Unit
        ]) => value(t0).runNow()))
    
    inline def setSetupGooglePay(value: AllowPrepaidCards => Callback): Self = StObject.set(x, "setupGooglePay", js.Any.fromFunction1((t0: AllowPrepaidCards) => value(t0).runNow()))
    
    inline def setSetupGooglePayButton(value: Color => Callback): Self = StObject.set(x, "setupGooglePayButton", js.Any.fromFunction1((t0: Color) => value(t0).runNow()))
    
    inline def setSetupPaymentRequest(value: typingsJapgolly.tpdirect.anon.AllowedNetworks => Callback): Self = StObject.set(x, "setupPaymentRequest", js.Any.fromFunction1((t0: typingsJapgolly.tpdirect.anon.AllowedNetworks) => value(t0).runNow()))
    
    inline def setSetupTransactionPrice(value: Price => Callback): Self = StObject.set(x, "setupTransactionPrice", js.Any.fromFunction1((t0: Price) => value(t0).runNow()))
  }
}
