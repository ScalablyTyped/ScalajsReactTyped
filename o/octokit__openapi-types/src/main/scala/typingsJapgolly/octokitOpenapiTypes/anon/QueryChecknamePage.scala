package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryChecknamePage extends StObject {
  
  var path: OwnerRef
  
  var query: ChecknamePage
}
object QueryChecknamePage {
  
  inline def apply(path: OwnerRef, query: ChecknamePage): QueryChecknamePage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryChecknamePage]
  }
  
  extension [Self <: QueryChecknamePage](x: Self) {
    
    inline def setPath(value: OwnerRef): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ChecknamePage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
