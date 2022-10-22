package typingsJapgolly.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCharge extends StObject {
  
  val Level3: Any
  
  val Outcome: Any
  
  val PaymentMethodDetails: TypeofPaymentMethodDetail
}
object TypeofCharge {
  
  inline def apply(Level3: Any, Outcome: Any, PaymentMethodDetails: TypeofPaymentMethodDetail): TypeofCharge = {
    val __obj = js.Dynamic.literal(Level3 = Level3.asInstanceOf[js.Any], Outcome = Outcome.asInstanceOf[js.Any], PaymentMethodDetails = PaymentMethodDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCharge]
  }
  
  extension [Self <: TypeofCharge](x: Self) {
    
    inline def setLevel3(value: Any): Self = StObject.set(x, "Level3", value.asInstanceOf[js.Any])
    
    inline def setOutcome(value: Any): Self = StObject.set(x, "Outcome", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodDetails(value: TypeofPaymentMethodDetail): Self = StObject.set(x, "PaymentMethodDetails", value.asInstanceOf[js.Any])
  }
}
