package typingsJapgolly.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeocodingComponents extends StObject {
  
  /** matches all the administrative_area levels. */
  var administrative_area: js.UndefOr[String] = js.undefined
  
  /**
    * matches a country name or a two letter [ISO 3166-1](https://en.wikipedia.org/wiki/ISO_3166-1) country code.
    * **Note:** The API follows the ISO standard for defining countries, and the filtering works best when using
    * the corresponding ISO code of the country
    */
  var country: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** matches against `locality` and `sublocality` types. */
  var locality: js.UndefOr[String] = js.undefined
  
  /** matches `postal_code` and `postal_code_prefix`. */
  var postal_code: js.UndefOr[String] = js.undefined
  
  /** matches the long or short name of a route. */
  var route: js.UndefOr[String] = js.undefined
}
object GeocodingComponents {
  
  inline def apply(): GeocodingComponents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocodingComponents]
  }
  
  extension [Self <: GeocodingComponents](x: Self) {
    
    inline def setAdministrative_area(value: String): Self = StObject.set(x, "administrative_area", value.asInstanceOf[js.Any])
    
    inline def setAdministrative_areaUndefined: Self = StObject.set(x, "administrative_area", js.undefined)
    
    inline def setCountry(value: String | js.Array[String]): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCountryVarargs(value: String*): Self = StObject.set(x, "country", js.Array(value*))
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    inline def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
    
    inline def setPostal_codeUndefined: Self = StObject.set(x, "postal_code", js.undefined)
    
    inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
  }
}
