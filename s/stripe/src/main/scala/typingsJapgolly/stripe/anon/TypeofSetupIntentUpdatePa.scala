package typingsJapgolly.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSetupIntentUpdatePa extends StObject {
  
  val PaymentMethodData: TypeofPaymentMethodData
  
  val PaymentMethodOptions: TypeofPaymentMethodOptionSepaDebit
}
object TypeofSetupIntentUpdatePa {
  
  inline def apply(
    PaymentMethodData: TypeofPaymentMethodData,
    PaymentMethodOptions: TypeofPaymentMethodOptionSepaDebit
  ): TypeofSetupIntentUpdatePa = {
    val __obj = js.Dynamic.literal(PaymentMethodData = PaymentMethodData.asInstanceOf[js.Any], PaymentMethodOptions = PaymentMethodOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSetupIntentUpdatePa]
  }
  
  extension [Self <: TypeofSetupIntentUpdatePa](x: Self) {
    
    inline def setPaymentMethodData(value: TypeofPaymentMethodData): Self = StObject.set(x, "PaymentMethodData", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodOptions(value: TypeofPaymentMethodOptionSepaDebit): Self = StObject.set(x, "PaymentMethodOptions", value.asInstanceOf[js.Any])
  }
}
