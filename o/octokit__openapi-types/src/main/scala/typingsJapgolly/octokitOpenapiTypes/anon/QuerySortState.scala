package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuerySortState extends StObject {
  
  var path: OwnerRepo
  
  var query: SortState
}
object QuerySortState {
  
  inline def apply(path: OwnerRepo, query: SortState): QuerySortState = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuerySortState]
  }
  
  extension [Self <: QuerySortState](x: Self) {
    
    inline def setPath(value: OwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: SortState): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
