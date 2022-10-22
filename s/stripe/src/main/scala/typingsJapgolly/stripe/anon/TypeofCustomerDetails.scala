package typingsJapgolly.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCustomerDetails extends StObject {
  
  val TaxId: Any
}
object TypeofCustomerDetails {
  
  inline def apply(TaxId: Any): TypeofCustomerDetails = {
    val __obj = js.Dynamic.literal(TaxId = TaxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCustomerDetails]
  }
  
  extension [Self <: TypeofCustomerDetails](x: Self) {
    
    inline def setTaxId(value: Any): Self = StObject.set(x, "TaxId", value.asInstanceOf[js.Any])
  }
}
