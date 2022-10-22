package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathIssuenumberQuerySince extends StObject {
  
  var path: Issuenumber
  
  var query: Since
}
object PathIssuenumberQuerySince {
  
  inline def apply(path: Issuenumber, query: Since): PathIssuenumberQuerySince = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathIssuenumberQuerySince]
  }
  
  extension [Self <: PathIssuenumberQuerySince](x: Self) {
    
    inline def setPath(value: Issuenumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Since): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
