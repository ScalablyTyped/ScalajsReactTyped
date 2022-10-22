package typingsJapgolly.strongholdPayJs.mod.global.Stronghold

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddPaymentSourceOptions
  extends StObject
     with Options {
  
  def onSuccess(paymentSource: PaymentSource): Unit
  @JSName("onSuccess")
  var onSuccess_Original: AddPaymentSourceOnSuccess
}
object AddPaymentSourceOptions {
  
  inline def apply(onSuccess: /* paymentSource */ PaymentSource => Callback): AddPaymentSourceOptions = {
    val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction1((t0: /* paymentSource */ PaymentSource) => onSuccess(t0).runNow()))
    __obj.asInstanceOf[AddPaymentSourceOptions]
  }
  
  extension [Self <: AddPaymentSourceOptions](x: Self) {
    
    inline def setOnSuccess(value: /* paymentSource */ PaymentSource => Callback): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1((t0: /* paymentSource */ PaymentSource) => value(t0).runNow()))
  }
}
