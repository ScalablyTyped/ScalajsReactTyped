package typingsJapgolly.stripeV3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Addressline1check extends StObject {
  
  var address_line1_check: Boolean | Null
  
  var address_postal_code_check: Boolean | Null
  
  var cvc_check: Boolean | Null
}
object Addressline1check {
  
  inline def apply(): Addressline1check = {
    val __obj = js.Dynamic.literal(address_line1_check = null, address_postal_code_check = null, cvc_check = null)
    __obj.asInstanceOf[Addressline1check]
  }
  
  extension [Self <: Addressline1check](x: Self) {
    
    inline def setAddress_line1_check(value: Boolean): Self = StObject.set(x, "address_line1_check", value.asInstanceOf[js.Any])
    
    inline def setAddress_line1_checkNull: Self = StObject.set(x, "address_line1_check", null)
    
    inline def setAddress_postal_code_check(value: Boolean): Self = StObject.set(x, "address_postal_code_check", value.asInstanceOf[js.Any])
    
    inline def setAddress_postal_code_checkNull: Self = StObject.set(x, "address_postal_code_check", null)
    
    inline def setCvc_check(value: Boolean): Self = StObject.set(x, "cvc_check", value.asInstanceOf[js.Any])
    
    inline def setCvc_checkNull: Self = StObject.set(x, "cvc_check", null)
  }
}
