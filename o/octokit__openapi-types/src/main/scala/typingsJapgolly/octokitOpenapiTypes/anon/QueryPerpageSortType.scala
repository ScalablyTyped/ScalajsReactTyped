package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPerpageSortType extends StObject {
  
  var path: `300`
  
  var query: PerpageSortType
}
object QueryPerpageSortType {
  
  inline def apply(path: `300`, query: PerpageSortType): QueryPerpageSortType = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPerpageSortType]
  }
  
  extension [Self <: QueryPerpageSortType](x: Self) {
    
    inline def setPath(value: `300`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageSortType): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
