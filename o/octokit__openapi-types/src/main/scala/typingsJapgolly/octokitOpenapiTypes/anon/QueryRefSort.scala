package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRefSort extends StObject {
  
  var path: `292`
  
  var query: RefSort
}
object QueryRefSort {
  
  inline def apply(path: `292`, query: RefSort): QueryRefSort = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRefSort]
  }
  
  extension [Self <: QueryRefSort](x: Self) {
    
    inline def setPath(value: `292`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: RefSort): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
