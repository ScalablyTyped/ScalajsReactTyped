package typingsJapgolly.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentLink extends StObject {
  
  val AfterCompletion: Any
  
  val ConsentCollection: Any
  
  val PaymentIntentData: Any
  
  val ShippingAddressCollection: Any
}
object TypeofPaymentLink {
  
  inline def apply(
    AfterCompletion: Any,
    ConsentCollection: Any,
    PaymentIntentData: Any,
    ShippingAddressCollection: Any
  ): TypeofPaymentLink = {
    val __obj = js.Dynamic.literal(AfterCompletion = AfterCompletion.asInstanceOf[js.Any], ConsentCollection = ConsentCollection.asInstanceOf[js.Any], PaymentIntentData = PaymentIntentData.asInstanceOf[js.Any], ShippingAddressCollection = ShippingAddressCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentLink]
  }
  
  extension [Self <: TypeofPaymentLink](x: Self) {
    
    inline def setAfterCompletion(value: Any): Self = StObject.set(x, "AfterCompletion", value.asInstanceOf[js.Any])
    
    inline def setConsentCollection(value: Any): Self = StObject.set(x, "ConsentCollection", value.asInstanceOf[js.Any])
    
    inline def setPaymentIntentData(value: Any): Self = StObject.set(x, "PaymentIntentData", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressCollection(value: Any): Self = StObject.set(x, "ShippingAddressCollection", value.asInstanceOf[js.Any])
  }
}
