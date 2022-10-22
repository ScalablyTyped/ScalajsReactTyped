package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNamedRangeRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `namedRange` is implied and should not be specified. A single `"*"` can be used as short-hand for
    * listing every field.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /** The named range to update with the new properties. */
  var namedRange: js.UndefOr[NamedRange] = js.undefined
}
object UpdateNamedRangeRequest {
  
  inline def apply(): UpdateNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateNamedRangeRequest]
  }
  
  extension [Self <: UpdateNamedRangeRequest](x: Self) {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setNamedRange(value: NamedRange): Self = StObject.set(x, "namedRange", value.asInstanceOf[js.Any])
    
    inline def setNamedRangeUndefined: Self = StObject.set(x, "namedRange", js.undefined)
  }
}
