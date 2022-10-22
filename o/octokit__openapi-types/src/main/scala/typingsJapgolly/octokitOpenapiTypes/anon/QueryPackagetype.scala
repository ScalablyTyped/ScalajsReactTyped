package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPackagetype extends StObject {
  
  var path: OrgString
  
  var query: Packagetype
}
object QueryPackagetype {
  
  inline def apply(path: OrgString, query: Packagetype): QueryPackagetype = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPackagetype]
  }
  
  extension [Self <: QueryPackagetype](x: Self) {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Packagetype): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
