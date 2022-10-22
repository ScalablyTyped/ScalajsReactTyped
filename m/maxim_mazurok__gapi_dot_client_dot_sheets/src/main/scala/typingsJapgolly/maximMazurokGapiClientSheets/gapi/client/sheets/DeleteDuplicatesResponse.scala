package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDuplicatesResponse extends StObject {
  
  /** The number of duplicate rows removed. */
  var duplicatesRemovedCount: js.UndefOr[Double] = js.undefined
}
object DeleteDuplicatesResponse {
  
  inline def apply(): DeleteDuplicatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDuplicatesResponse]
  }
  
  extension [Self <: DeleteDuplicatesResponse](x: Self) {
    
    inline def setDuplicatesRemovedCount(value: Double): Self = StObject.set(x, "duplicatesRemovedCount", value.asInstanceOf[js.Any])
    
    inline def setDuplicatesRemovedCountUndefined: Self = StObject.set(x, "duplicatesRemovedCount", js.undefined)
  }
}
