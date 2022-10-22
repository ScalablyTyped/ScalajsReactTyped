package typingsJapgolly.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  /** Valid email address */
  var email: String
  
  /** Email address to display in the “To” header instead of address.email (for CC and BCC) */
  var header_to: js.UndefOr[String] = js.undefined
  
  /** User-friendly name for the email address */
  var name: js.UndefOr[String] = js.undefined
}
object Address {
  
  inline def apply(email: String): Address = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setHeader_to(value: String): Self = StObject.set(x, "header_to", value.asInstanceOf[js.Any])
    
    inline def setHeader_toUndefined: Self = StObject.set(x, "header_to", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
