package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPagePermission extends StObject {
  
  var path: `292`
  
  var query: PagePermission
}
object QueryPagePermission {
  
  inline def apply(path: `292`, query: PagePermission): QueryPagePermission = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPagePermission]
  }
  
  extension [Self <: QueryPagePermission](x: Self) {
    
    inline def setPath(value: `292`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePermission): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
