package typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalAddress extends StObject {
  
  var admin_area_1: js.UndefOr[InternalAddressComponent] = js.undefined
  
  var admin_area_2: js.UndefOr[InternalAddressComponent] = js.undefined
  
  var admin_area_3: js.UndefOr[InternalAddressComponent] = js.undefined
  
  var admin_area_4: js.UndefOr[InternalAddressComponent] = js.undefined
  
  var city: js.UndefOr[String] = js.undefined
  
  var country: js.UndefOr[String | InternalAddressComponent] = js.undefined
  
  var formatted: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var locality: js.UndefOr[InternalAddressComponent] = js.undefined
  
  var location: js.UndefOr[InternalLocation] = js.undefined
  
  var postalCode: js.UndefOr[String] = js.undefined
  
  var postal_code: js.UndefOr[InternalAddressComponent] = js.undefined
  
  var route: js.UndefOr[InternalAddressComponent] = js.undefined
  
  var streetAddress: js.UndefOr[StreetAddress] = js.undefined
  
  var street_number: js.UndefOr[InternalAddressComponent] = js.undefined
  
  var subdivision: js.UndefOr[String] = js.undefined
}
object InternalAddress {
  
  inline def apply(): InternalAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalAddress]
  }
  
  extension [Self <: InternalAddress](x: Self) {
    
    inline def setAdmin_area_1(value: InternalAddressComponent): Self = StObject.set(x, "admin_area_1", value.asInstanceOf[js.Any])
    
    inline def setAdmin_area_1Undefined: Self = StObject.set(x, "admin_area_1", js.undefined)
    
    inline def setAdmin_area_2(value: InternalAddressComponent): Self = StObject.set(x, "admin_area_2", value.asInstanceOf[js.Any])
    
    inline def setAdmin_area_2Undefined: Self = StObject.set(x, "admin_area_2", js.undefined)
    
    inline def setAdmin_area_3(value: InternalAddressComponent): Self = StObject.set(x, "admin_area_3", value.asInstanceOf[js.Any])
    
    inline def setAdmin_area_3Undefined: Self = StObject.set(x, "admin_area_3", js.undefined)
    
    inline def setAdmin_area_4(value: InternalAddressComponent): Self = StObject.set(x, "admin_area_4", value.asInstanceOf[js.Any])
    
    inline def setAdmin_area_4Undefined: Self = StObject.set(x, "admin_area_4", js.undefined)
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setCountry(value: String | InternalAddressComponent): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
    
    inline def setFormattedUndefined: Self = StObject.set(x, "formatted", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLocality(value: InternalAddressComponent): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    inline def setLocation(value: InternalLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setPostal_code(value: InternalAddressComponent): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
    
    inline def setPostal_codeUndefined: Self = StObject.set(x, "postal_code", js.undefined)
    
    inline def setRoute(value: InternalAddressComponent): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    inline def setStreetAddress(value: StreetAddress): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    
    inline def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
    
    inline def setStreet_number(value: InternalAddressComponent): Self = StObject.set(x, "street_number", value.asInstanceOf[js.Any])
    
    inline def setStreet_numberUndefined: Self = StObject.set(x, "street_number", js.undefined)
    
    inline def setSubdivision(value: String): Self = StObject.set(x, "subdivision", value.asInstanceOf[js.Any])
    
    inline def setSubdivisionUndefined: Self = StObject.set(x, "subdivision", js.undefined)
  }
}
