package typingsJapgolly.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMandateData2 extends StObject {
  
  val CustomerAcceptance: Any
}
object TypeofMandateData2 {
  
  inline def apply(CustomerAcceptance: Any): TypeofMandateData2 = {
    val __obj = js.Dynamic.literal(CustomerAcceptance = CustomerAcceptance.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMandateData2]
  }
  
  extension [Self <: TypeofMandateData2](x: Self) {
    
    inline def setCustomerAcceptance(value: Any): Self = StObject.set(x, "CustomerAcceptance", value.asInstanceOf[js.Any])
  }
}
