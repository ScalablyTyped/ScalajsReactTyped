package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAlertnumberOwnerRepo extends StObject {
  
  var path: AlertnumberOwnerRepo
}
object PathAlertnumberOwnerRepo {
  
  inline def apply(path: AlertnumberOwnerRepo): PathAlertnumberOwnerRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAlertnumberOwnerRepo]
  }
  
  extension [Self <: PathAlertnumberOwnerRepo](x: Self) {
    
    inline def setPath(value: AlertnumberOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
