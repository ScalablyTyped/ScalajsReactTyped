package typingsJapgolly.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCustomer extends StObject {
  
  val InvoiceSettings: Any
  
  val Tax: TypeofTax
}
object TypeofCustomer {
  
  inline def apply(InvoiceSettings: Any, Tax: TypeofTax): TypeofCustomer = {
    val __obj = js.Dynamic.literal(InvoiceSettings = InvoiceSettings.asInstanceOf[js.Any], Tax = Tax.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCustomer]
  }
  
  extension [Self <: TypeofCustomer](x: Self) {
    
    inline def setInvoiceSettings(value: Any): Self = StObject.set(x, "InvoiceSettings", value.asInstanceOf[js.Any])
    
    inline def setTax(value: TypeofTax): Self = StObject.set(x, "Tax", value.asInstanceOf[js.Any])
  }
}
