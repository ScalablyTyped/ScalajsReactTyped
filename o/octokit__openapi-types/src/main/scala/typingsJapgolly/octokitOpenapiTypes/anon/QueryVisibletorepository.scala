package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryVisibletorepository extends StObject {
  
  var path: OrgString
  
  var query: Visibletorepository
}
object QueryVisibletorepository {
  
  inline def apply(path: OrgString, query: Visibletorepository): QueryVisibletorepository = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryVisibletorepository]
  }
  
  extension [Self <: QueryVisibletorepository](x: Self) {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Visibletorepository): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
