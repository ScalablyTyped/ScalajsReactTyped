package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query309 extends StObject {
  
  var path: OrgSecretname
  
  var query: `309`
}
object Query309 {
  
  inline def apply(path: OrgSecretname, query: `309`): Query309 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query309]
  }
  
  extension [Self <: Query309](x: Self) {
    
    inline def setPath(value: OrgSecretname): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `309`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
