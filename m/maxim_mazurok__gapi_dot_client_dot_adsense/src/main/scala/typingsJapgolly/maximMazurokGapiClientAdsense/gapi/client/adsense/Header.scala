package typingsJapgolly.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Header extends StObject {
  
  /** The [ISO-4217 currency code](https://en.wikipedia.org/wiki/ISO_4217) of this column. Only present if the header type is METRIC_CURRENCY. */
  var currencyCode: js.UndefOr[String] = js.undefined
  
  /** Required. Name of the header. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Required. Type of the header. */
  var `type`: js.UndefOr[String] = js.undefined
}
object Header {
  
  inline def apply(): Header = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Header]
  }
  
  extension [Self <: Header](x: Self) {
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
