package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPackageversionidUsername extends StObject {
  
  var path: PackageversionidUsername
}
object PathPackageversionidUsername {
  
  inline def apply(path: PackageversionidUsername): PathPackageversionidUsername = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPackageversionidUsername]
  }
  
  extension [Self <: PathPackageversionidUsername](x: Self) {
    
    inline def setPath(value: PackageversionidUsername): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
