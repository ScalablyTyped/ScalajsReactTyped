package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDeveloperMetadataRequest extends StObject {
  
  /** The data filter describing the criteria used to select which developer metadata entry to delete. */
  var dataFilter: js.UndefOr[DataFilter] = js.undefined
}
object DeleteDeveloperMetadataRequest {
  
  inline def apply(): DeleteDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDeveloperMetadataRequest]
  }
  
  extension [Self <: DeleteDeveloperMetadataRequest](x: Self) {
    
    inline def setDataFilter(value: DataFilter): Self = StObject.set(x, "dataFilter", value.asInstanceOf[js.Any])
    
    inline def setDataFilterUndefined: Self = StObject.set(x, "dataFilter", js.undefined)
  }
}
