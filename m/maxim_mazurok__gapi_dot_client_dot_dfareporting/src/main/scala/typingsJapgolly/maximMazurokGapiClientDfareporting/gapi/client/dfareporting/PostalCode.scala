package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostalCode extends StObject {
  
  /** Postal code. This is equivalent to the id field. */
  var code: js.UndefOr[String] = js.undefined
  
  /** Country code of the country to which this postal code belongs. */
  var countryCode: js.UndefOr[String] = js.undefined
  
  /** DART ID of the country to which this postal code belongs. */
  var countryDartId: js.UndefOr[String] = js.undefined
  
  /** ID of this postal code. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#postalCode". */
  var kind: js.UndefOr[String] = js.undefined
}
object PostalCode {
  
  inline def apply(): PostalCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostalCode]
  }
  
  extension [Self <: PostalCode](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setCountryDartId(value: String): Self = StObject.set(x, "countryDartId", value.asInstanceOf[js.Any])
    
    inline def setCountryDartIdUndefined: Self = StObject.set(x, "countryDartId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
