package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCodespacename extends StObject {
  
  var path: Codespacename
}
object PathCodespacename {
  
  inline def apply(path: Codespacename): PathCodespacename = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCodespacename]
  }
  
  extension [Self <: PathCodespacename](x: Self) {
    
    inline def setPath(value: Codespacename): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
