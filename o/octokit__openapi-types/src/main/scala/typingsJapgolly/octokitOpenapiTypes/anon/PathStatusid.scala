package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathStatusid extends StObject {
  
  var path: Statusid
}
object PathStatusid {
  
  inline def apply(path: Statusid): PathStatusid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathStatusid]
  }
  
  extension [Self <: PathStatusid](x: Self) {
    
    inline def setPath(value: Statusid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
