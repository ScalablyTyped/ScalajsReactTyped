package typingsJapgolly.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phone extends StObject {
  
  var country_code: String
  
  var national_number: String
}
object Phone {
  
  inline def apply(country_code: String, national_number: String): Phone = {
    val __obj = js.Dynamic.literal(country_code = country_code.asInstanceOf[js.Any], national_number = national_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phone]
  }
  
  extension [Self <: Phone](x: Self) {
    
    inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
    
    inline def setNational_number(value: String): Self = StObject.set(x, "national_number", value.asInstanceOf[js.Any])
  }
}
