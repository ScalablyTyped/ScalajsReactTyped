package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query358 extends StObject {
  
  var path: `300`
  
  var query: `358`
}
object Query358 {
  
  inline def apply(path: `300`, query: `358`): Query358 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query358]
  }
  
  extension [Self <: Query358](x: Self) {
    
    inline def setPath(value: `300`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `358`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
