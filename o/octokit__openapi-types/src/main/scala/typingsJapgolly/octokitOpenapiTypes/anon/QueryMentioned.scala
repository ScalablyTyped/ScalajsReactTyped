package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryMentioned extends StObject {
  
  var path: OwnerRepo
  
  var query: Mentioned
}
object QueryMentioned {
  
  inline def apply(path: OwnerRepo, query: Mentioned): QueryMentioned = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryMentioned]
  }
  
  extension [Self <: QueryMentioned](x: Self) {
    
    inline def setPath(value: OwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Mentioned): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
