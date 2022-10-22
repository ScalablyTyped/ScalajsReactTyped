package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFilterViewRequest extends StObject {
  
  /** The ID of the filter to delete. */
  var filterId: js.UndefOr[Double] = js.undefined
}
object DeleteFilterViewRequest {
  
  inline def apply(): DeleteFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFilterViewRequest]
  }
  
  extension [Self <: DeleteFilterViewRequest](x: Self) {
    
    inline def setFilterId(value: Double): Self = StObject.set(x, "filterId", value.asInstanceOf[js.Any])
    
    inline def setFilterIdUndefined: Self = StObject.set(x, "filterId", js.undefined)
  }
}
