package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query421 extends StObject {
  
  var path: RepoRunid
  
  var query: `421`
}
object Query421 {
  
  inline def apply(path: RepoRunid, query: `421`): Query421 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query421]
  }
  
  extension [Self <: Query421](x: Self) {
    
    inline def setPath(value: RepoRunid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `421`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
