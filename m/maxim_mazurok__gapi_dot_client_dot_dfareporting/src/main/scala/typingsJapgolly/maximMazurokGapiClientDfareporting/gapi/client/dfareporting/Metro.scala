package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metro extends StObject {
  
  /** Country code of the country to which this metro region belongs. */
  var countryCode: js.UndefOr[String] = js.undefined
  
  /** DART ID of the country to which this metro region belongs. */
  var countryDartId: js.UndefOr[String] = js.undefined
  
  /** DART ID of this metro region. */
  var dartId: js.UndefOr[String] = js.undefined
  
  /** DMA ID of this metro region. This is the ID used for targeting and generating reports, and is equivalent to metro_code. */
  var dmaId: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#metro". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Metro code of this metro region. This is equivalent to dma_id. */
  var metroCode: js.UndefOr[String] = js.undefined
  
  /** Name of this metro region. */
  var name: js.UndefOr[String] = js.undefined
}
object Metro {
  
  inline def apply(): Metro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metro]
  }
  
  extension [Self <: Metro](x: Self) {
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setCountryDartId(value: String): Self = StObject.set(x, "countryDartId", value.asInstanceOf[js.Any])
    
    inline def setCountryDartIdUndefined: Self = StObject.set(x, "countryDartId", js.undefined)
    
    inline def setDartId(value: String): Self = StObject.set(x, "dartId", value.asInstanceOf[js.Any])
    
    inline def setDartIdUndefined: Self = StObject.set(x, "dartId", js.undefined)
    
    inline def setDmaId(value: String): Self = StObject.set(x, "dmaId", value.asInstanceOf[js.Any])
    
    inline def setDmaIdUndefined: Self = StObject.set(x, "dmaId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetroCode(value: String): Self = StObject.set(x, "metroCode", value.asInstanceOf[js.Any])
    
    inline def setMetroCodeUndefined: Self = StObject.set(x, "metroCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
