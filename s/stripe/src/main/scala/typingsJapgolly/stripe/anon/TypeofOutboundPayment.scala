package typingsJapgolly.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofOutboundPayment extends StObject {
  
  val DestinationPaymentMethodDetails: TypeofDestinationPaymentM
  
  val ReturnedDetails: Any
}
object TypeofOutboundPayment {
  
  inline def apply(DestinationPaymentMethodDetails: TypeofDestinationPaymentM, ReturnedDetails: Any): TypeofOutboundPayment = {
    val __obj = js.Dynamic.literal(DestinationPaymentMethodDetails = DestinationPaymentMethodDetails.asInstanceOf[js.Any], ReturnedDetails = ReturnedDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofOutboundPayment]
  }
  
  extension [Self <: TypeofOutboundPayment](x: Self) {
    
    inline def setDestinationPaymentMethodDetails(value: TypeofDestinationPaymentM): Self = StObject.set(x, "DestinationPaymentMethodDetails", value.asInstanceOf[js.Any])
    
    inline def setReturnedDetails(value: Any): Self = StObject.set(x, "ReturnedDetails", value.asInstanceOf[js.Any])
  }
}
