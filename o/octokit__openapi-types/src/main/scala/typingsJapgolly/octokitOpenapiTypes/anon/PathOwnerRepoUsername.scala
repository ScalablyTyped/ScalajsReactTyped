package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerRepoUsername extends StObject {
  
  var path: OwnerRepoUsername
}
object PathOwnerRepoUsername {
  
  inline def apply(path: OwnerRepoUsername): PathOwnerRepoUsername = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerRepoUsername]
  }
  
  extension [Self <: PathOwnerRepoUsername](x: Self) {
    
    inline def setPath(value: OwnerRepoUsername): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
