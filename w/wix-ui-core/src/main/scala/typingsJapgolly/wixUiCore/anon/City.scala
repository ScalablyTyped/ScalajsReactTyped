package typingsJapgolly.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait City extends StObject {
  
  var city: String
  
  var country: String
  
  var formattedAddress: String
  
  var postalCode: String
  
  var streetAddress: String
  
  var subdivision: String
}
object City {
  
  inline def apply(
    city: String,
    country: String,
    formattedAddress: String,
    postalCode: String,
    streetAddress: String,
    subdivision: String
  ): City = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], streetAddress = streetAddress.asInstanceOf[js.Any], subdivision = subdivision.asInstanceOf[js.Any])
    __obj.asInstanceOf[City]
  }
  
  extension [Self <: City](x: Self) {
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setFormattedAddress(value: String): Self = StObject.set(x, "formattedAddress", value.asInstanceOf[js.Any])
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    
    inline def setSubdivision(value: String): Self = StObject.set(x, "subdivision", value.asInstanceOf[js.Any])
  }
}
