package typingsJapgolly.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentSettingsPaymentMethodOptions extends StObject {
  
  val PaymentMethodOptions: TypeofPaymentMethodOptionCard
}
object TypeofPaymentSettingsPaymentMethodOptions {
  
  inline def apply(PaymentMethodOptions: TypeofPaymentMethodOptionCard): TypeofPaymentSettingsPaymentMethodOptions = {
    val __obj = js.Dynamic.literal(PaymentMethodOptions = PaymentMethodOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentSettingsPaymentMethodOptions]
  }
  
  extension [Self <: TypeofPaymentSettingsPaymentMethodOptions](x: Self) {
    
    inline def setPaymentMethodOptions(value: TypeofPaymentMethodOptionCard): Self = StObject.set(x, "PaymentMethodOptions", value.asInstanceOf[js.Any])
  }
}
