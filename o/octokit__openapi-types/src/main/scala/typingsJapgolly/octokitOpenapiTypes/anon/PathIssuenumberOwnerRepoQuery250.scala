package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathIssuenumberOwnerRepoQuery250 extends StObject {
  
  var path: IssuenumberOwnerRepo
  
  var query: `250`
}
object PathIssuenumberOwnerRepoQuery250 {
  
  inline def apply(path: IssuenumberOwnerRepo, query: `250`): PathIssuenumberOwnerRepoQuery250 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathIssuenumberOwnerRepoQuery250]
  }
  
  extension [Self <: PathIssuenumberOwnerRepoQuery250](x: Self) {
    
    inline def setPath(value: IssuenumberOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `250`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
