package typingsJapgolly.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFiltersResponse extends StObject {
  
  /** List of a user's filters. */
  var filter: js.UndefOr[js.Array[Filter]] = js.undefined
}
object ListFiltersResponse {
  
  inline def apply(): ListFiltersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFiltersResponse]
  }
  
  extension [Self <: ListFiltersResponse](x: Self) {
    
    inline def setFilter(value: js.Array[Filter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: Filter*): Self = StObject.set(x, "filter", js.Array(value*))
  }
}
