package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoTagsha extends StObject {
  
  var path: RepoTagsha
}
object PathRepoTagsha {
  
  inline def apply(path: RepoTagsha): PathRepoTagsha = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoTagsha]
  }
  
  extension [Self <: PathRepoTagsha](x: Self) {
    
    inline def setPath(value: RepoTagsha): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
