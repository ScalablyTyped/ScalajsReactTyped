package typingsJapgolly.tpdirect

import japgolly.scalajs.react.Callback
import typingsJapgolly.tpdirect.tpdirectStrings.production
import typingsJapgolly.tpdirect.tpdirectStrings.sandbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TPDirect extends StObject {
  
  var card: DirectPay
  
  var easyWallet: EasyWallet
  
  var googlePay: GooglePay
  
  var jkoPay: JkoPay
  
  var linePay: LinePay
  
  var paymentRequestApi: PaymentRequestApi
  
  var samsungPay: SamsungPay
  
  def setupSDK(appId: Double, appKey: String, environment: sandbox | production): Unit
}
object TPDirect {
  
  inline def apply(
    card: DirectPay,
    easyWallet: EasyWallet,
    googlePay: GooglePay,
    jkoPay: JkoPay,
    linePay: LinePay,
    paymentRequestApi: PaymentRequestApi,
    samsungPay: SamsungPay,
    setupSDK: (Double, String, sandbox | production) => Callback
  ): TPDirect = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], easyWallet = easyWallet.asInstanceOf[js.Any], googlePay = googlePay.asInstanceOf[js.Any], jkoPay = jkoPay.asInstanceOf[js.Any], linePay = linePay.asInstanceOf[js.Any], paymentRequestApi = paymentRequestApi.asInstanceOf[js.Any], samsungPay = samsungPay.asInstanceOf[js.Any], setupSDK = js.Any.fromFunction3((t0: Double, t1: String, t2: sandbox | production) => (setupSDK(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[TPDirect]
  }
  
  extension [Self <: TPDirect](x: Self) {
    
    inline def setCard(value: DirectPay): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setEasyWallet(value: EasyWallet): Self = StObject.set(x, "easyWallet", value.asInstanceOf[js.Any])
    
    inline def setGooglePay(value: GooglePay): Self = StObject.set(x, "googlePay", value.asInstanceOf[js.Any])
    
    inline def setJkoPay(value: JkoPay): Self = StObject.set(x, "jkoPay", value.asInstanceOf[js.Any])
    
    inline def setLinePay(value: LinePay): Self = StObject.set(x, "linePay", value.asInstanceOf[js.Any])
    
    inline def setPaymentRequestApi(value: PaymentRequestApi): Self = StObject.set(x, "paymentRequestApi", value.asInstanceOf[js.Any])
    
    inline def setSamsungPay(value: SamsungPay): Self = StObject.set(x, "samsungPay", value.asInstanceOf[js.Any])
    
    inline def setSetupSDK(value: (Double, String, sandbox | production) => Callback): Self = StObject.set(x, "setupSDK", js.Any.fromFunction3((t0: Double, t1: String, t2: sandbox | production) => (value(t0, t1, t2)).runNow()))
  }
}
