package typingsJapgolly.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenOptions extends StObject {
  
  var address_city: js.UndefOr[String] = js.undefined
  
  var address_country: js.UndefOr[String] = js.undefined
  
  var address_line1: js.UndefOr[String] = js.undefined
  
  var address_line2: js.UndefOr[String] = js.undefined
  
  var address_state: js.UndefOr[String] = js.undefined
  
  var address_zip: js.UndefOr[String] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object TokenOptions {
  
  inline def apply(): TokenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenOptions]
  }
  
  extension [Self <: TokenOptions](x: Self) {
    
    inline def setAddress_city(value: String): Self = StObject.set(x, "address_city", value.asInstanceOf[js.Any])
    
    inline def setAddress_cityUndefined: Self = StObject.set(x, "address_city", js.undefined)
    
    inline def setAddress_country(value: String): Self = StObject.set(x, "address_country", value.asInstanceOf[js.Any])
    
    inline def setAddress_countryUndefined: Self = StObject.set(x, "address_country", js.undefined)
    
    inline def setAddress_line1(value: String): Self = StObject.set(x, "address_line1", value.asInstanceOf[js.Any])
    
    inline def setAddress_line1Undefined: Self = StObject.set(x, "address_line1", js.undefined)
    
    inline def setAddress_line2(value: String): Self = StObject.set(x, "address_line2", value.asInstanceOf[js.Any])
    
    inline def setAddress_line2Undefined: Self = StObject.set(x, "address_line2", js.undefined)
    
    inline def setAddress_state(value: String): Self = StObject.set(x, "address_state", value.asInstanceOf[js.Any])
    
    inline def setAddress_stateUndefined: Self = StObject.set(x, "address_state", js.undefined)
    
    inline def setAddress_zip(value: String): Self = StObject.set(x, "address_zip", value.asInstanceOf[js.Any])
    
    inline def setAddress_zipUndefined: Self = StObject.set(x, "address_zip", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
