package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAffiliationPagePerpage extends StObject {
  
  var path: `389`
  
  var query: AffiliationPagePerpage
}
object QueryAffiliationPagePerpage {
  
  inline def apply(path: `389`, query: AffiliationPagePerpage): QueryAffiliationPagePerpage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAffiliationPagePerpage]
  }
  
  extension [Self <: QueryAffiliationPagePerpage](x: Self) {
    
    inline def setPath(value: `389`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: AffiliationPagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
