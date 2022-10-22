package typingsJapgolly.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountryName extends StObject {
  
  var company: js.UndefOr[String] = js.undefined
  
  var countryName: js.UndefOr[String] = js.undefined
  
  var extendedAddress: js.UndefOr[String] = js.undefined
  
  var firstName: js.UndefOr[String] = js.undefined
  
  var lastName: js.UndefOr[String] = js.undefined
  
  var locality: js.UndefOr[String] = js.undefined
  
  var postalCode: js.UndefOr[String] = js.undefined
  
  var region: js.UndefOr[String] = js.undefined
  
  var streetAddress: js.UndefOr[String] = js.undefined
}
object CountryName {
  
  inline def apply(): CountryName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountryName]
  }
  
  extension [Self <: CountryName](x: Self) {
    
    inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    inline def setCountryName(value: String): Self = StObject.set(x, "countryName", value.asInstanceOf[js.Any])
    
    inline def setCountryNameUndefined: Self = StObject.set(x, "countryName", js.undefined)
    
    inline def setExtendedAddress(value: String): Self = StObject.set(x, "extendedAddress", value.asInstanceOf[js.Any])
    
    inline def setExtendedAddressUndefined: Self = StObject.set(x, "extendedAddress", js.undefined)
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    
    inline def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
  }
}
