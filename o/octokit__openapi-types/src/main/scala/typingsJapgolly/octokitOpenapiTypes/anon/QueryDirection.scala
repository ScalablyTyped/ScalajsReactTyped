package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDirection extends StObject {
  
  var path: Enterprise
  
  var query: Direction
}
object QueryDirection {
  
  inline def apply(path: Enterprise, query: Direction): QueryDirection = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDirection]
  }
  
  extension [Self <: QueryDirection](x: Self) {
    
    inline def setPath(value: Enterprise): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Direction): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
