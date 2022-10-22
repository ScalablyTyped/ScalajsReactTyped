package typingsJapgolly.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentSettings extends StObject {
  
  val PaymentMethodOptions: TypeofPaymentMethodOptionBancontact
}
object TypeofPaymentSettings {
  
  inline def apply(PaymentMethodOptions: TypeofPaymentMethodOptionBancontact): TypeofPaymentSettings = {
    val __obj = js.Dynamic.literal(PaymentMethodOptions = PaymentMethodOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentSettings]
  }
  
  extension [Self <: TypeofPaymentSettings](x: Self) {
    
    inline def setPaymentMethodOptions(value: TypeofPaymentMethodOptionBancontact): Self = StObject.set(x, "PaymentMethodOptions", value.asInstanceOf[js.Any])
  }
}
