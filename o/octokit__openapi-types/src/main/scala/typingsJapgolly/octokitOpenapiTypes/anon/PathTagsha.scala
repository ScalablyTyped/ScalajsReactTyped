package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTagsha extends StObject {
  
  var path: Tagsha
}
object PathTagsha {
  
  inline def apply(path: Tagsha): PathTagsha = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTagsha]
  }
  
  extension [Self <: PathTagsha](x: Self) {
    
    inline def setPath(value: Tagsha): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
