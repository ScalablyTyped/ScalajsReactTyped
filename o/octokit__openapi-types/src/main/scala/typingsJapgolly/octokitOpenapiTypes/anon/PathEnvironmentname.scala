package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnvironmentname extends StObject {
  
  var path: Environmentname
}
object PathEnvironmentname {
  
  inline def apply(path: Environmentname): PathEnvironmentname = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnvironmentname]
  }
  
  extension [Self <: PathEnvironmentname](x: Self) {
    
    inline def setPath(value: Environmentname): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
