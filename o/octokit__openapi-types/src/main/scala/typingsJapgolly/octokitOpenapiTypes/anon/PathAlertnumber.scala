package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAlertnumber extends StObject {
  
  var path: Alertnumber
}
object PathAlertnumber {
  
  inline def apply(path: Alertnumber): PathAlertnumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAlertnumber]
  }
  
  extension [Self <: PathAlertnumber](x: Self) {
    
    inline def setPath(value: Alertnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
