package typingsJapgolly.strongholdPayJs.mod.global.Stronghold

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePaymentSourceOptions
  extends StObject
     with Options {
  
  var onSuccess: js.UndefOr[UpdatePaymentSourceOnSuccess] = js.undefined
  
  var paymentSourceId: String
}
object UpdatePaymentSourceOptions {
  
  inline def apply(paymentSourceId: String): UpdatePaymentSourceOptions = {
    val __obj = js.Dynamic.literal(paymentSourceId = paymentSourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePaymentSourceOptions]
  }
  
  extension [Self <: UpdatePaymentSourceOptions](x: Self) {
    
    inline def setOnSuccess(value: /* paymentSource */ PaymentSource => Callback): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1((t0: /* paymentSource */ PaymentSource) => value(t0).runNow()))
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    
    inline def setPaymentSourceId(value: String): Self = StObject.set(x, "paymentSourceId", value.asInstanceOf[js.Any])
  }
}
