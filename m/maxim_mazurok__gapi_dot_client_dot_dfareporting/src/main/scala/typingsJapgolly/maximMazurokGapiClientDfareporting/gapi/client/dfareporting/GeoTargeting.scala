package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoTargeting extends StObject {
  
  /**
    * Cities to be targeted. For each city only dartId is required. The other fields are populated automatically when the ad is inserted or updated. If targeting a city, do not target or
    * exclude the country of the city, and do not target the metro or region of the city.
    */
  var cities: js.UndefOr[js.Array[City]] = js.undefined
  
  /**
    * Countries to be targeted or excluded from targeting, depending on the setting of the excludeCountries field. For each country only dartId is required. The other fields are populated
    * automatically when the ad is inserted or updated. If targeting or excluding a country, do not target regions, cities, metros, or postal codes in the same country.
    */
  var countries: js.UndefOr[js.Array[Country]] = js.undefined
  
  /** Whether or not to exclude the countries in the countries field from targeting. If false, the countries field refers to countries which will be targeted by the ad. */
  var excludeCountries: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Metros to be targeted. For each metro only dmaId is required. The other fields are populated automatically when the ad is inserted or updated. If targeting a metro, do not target or
    * exclude the country of the metro.
    */
  var metros: js.UndefOr[js.Array[Metro]] = js.undefined
  
  /**
    * Postal codes to be targeted. For each postal code only id is required. The other fields are populated automatically when the ad is inserted or updated. If targeting a postal code,
    * do not target or exclude the country of the postal code.
    */
  var postalCodes: js.UndefOr[js.Array[PostalCode]] = js.undefined
  
  /**
    * Regions to be targeted. For each region only dartId is required. The other fields are populated automatically when the ad is inserted or updated. If targeting a region, do not
    * target or exclude the country of the region.
    */
  var regions: js.UndefOr[js.Array[Region]] = js.undefined
}
object GeoTargeting {
  
  inline def apply(): GeoTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoTargeting]
  }
  
  extension [Self <: GeoTargeting](x: Self) {
    
    inline def setCities(value: js.Array[City]): Self = StObject.set(x, "cities", value.asInstanceOf[js.Any])
    
    inline def setCitiesUndefined: Self = StObject.set(x, "cities", js.undefined)
    
    inline def setCitiesVarargs(value: City*): Self = StObject.set(x, "cities", js.Array(value*))
    
    inline def setCountries(value: js.Array[Country]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
    
    inline def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
    
    inline def setCountriesVarargs(value: Country*): Self = StObject.set(x, "countries", js.Array(value*))
    
    inline def setExcludeCountries(value: Boolean): Self = StObject.set(x, "excludeCountries", value.asInstanceOf[js.Any])
    
    inline def setExcludeCountriesUndefined: Self = StObject.set(x, "excludeCountries", js.undefined)
    
    inline def setMetros(value: js.Array[Metro]): Self = StObject.set(x, "metros", value.asInstanceOf[js.Any])
    
    inline def setMetrosUndefined: Self = StObject.set(x, "metros", js.undefined)
    
    inline def setMetrosVarargs(value: Metro*): Self = StObject.set(x, "metros", js.Array(value*))
    
    inline def setPostalCodes(value: js.Array[PostalCode]): Self = StObject.set(x, "postalCodes", value.asInstanceOf[js.Any])
    
    inline def setPostalCodesUndefined: Self = StObject.set(x, "postalCodes", js.undefined)
    
    inline def setPostalCodesVarargs(value: PostalCode*): Self = StObject.set(x, "postalCodes", js.Array(value*))
    
    inline def setRegions(value: js.Array[Region]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    inline def setRegionsVarargs(value: Region*): Self = StObject.set(x, "regions", js.Array(value*))
  }
}
