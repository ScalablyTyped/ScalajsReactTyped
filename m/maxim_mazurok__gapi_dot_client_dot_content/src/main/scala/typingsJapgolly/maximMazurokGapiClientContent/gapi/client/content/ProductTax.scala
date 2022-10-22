package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductTax extends StObject {
  
  /** The country within which the item is taxed, specified as a CLDR territory code. */
  var country: js.UndefOr[String] = js.undefined
  
  /** The numeric ID of a location that the tax rate applies to as defined in the AdWords API. */
  var locationId: js.UndefOr[String] = js.undefined
  
  /**
    * The postal code range that the tax rate applies to, represented by a ZIP code, a ZIP code prefix using * wildcard, a range between two ZIP codes or two ZIP code prefixes of equal
    * length. Examples: 94114, 94*, 94002-95460, 94*-95*.
    */
  var postalCode: js.UndefOr[String] = js.undefined
  
  /** The percentage of tax rate that applies to the item price. */
  var rate: js.UndefOr[Double] = js.undefined
  
  /** The geographic region to which the tax rate applies. */
  var region: js.UndefOr[String] = js.undefined
  
  /** Should be set to true if tax is charged on shipping. */
  var taxShip: js.UndefOr[Boolean] = js.undefined
}
object ProductTax {
  
  inline def apply(): ProductTax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductTax]
  }
  
  extension [Self <: ProductTax](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setTaxShip(value: Boolean): Self = StObject.set(x, "taxShip", value.asInstanceOf[js.Any])
    
    inline def setTaxShipUndefined: Self = StObject.set(x, "taxShip", js.undefined)
  }
}
