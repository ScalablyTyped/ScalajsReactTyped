package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathNameRunnerid extends StObject {
  
  var path: NameRunnerid
}
object PathNameRunnerid {
  
  inline def apply(path: NameRunnerid): PathNameRunnerid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathNameRunnerid]
  }
  
  extension [Self <: PathNameRunnerid](x: Self) {
    
    inline def setPath(value: NameRunnerid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
