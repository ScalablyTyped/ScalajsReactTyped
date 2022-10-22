package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryChecknameFilter extends StObject {
  
  var path: ChecksuiteidOwnerRepo
  
  var query: ChecknameFilter
}
object QueryChecknameFilter {
  
  inline def apply(path: ChecksuiteidOwnerRepo, query: ChecknameFilter): QueryChecknameFilter = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryChecknameFilter]
  }
  
  extension [Self <: QueryChecknameFilter](x: Self) {
    
    inline def setPath(value: ChecksuiteidOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ChecknameFilter): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
