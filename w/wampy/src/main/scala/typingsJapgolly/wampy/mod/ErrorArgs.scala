package typingsJapgolly.wampy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorArgs extends StObject {
  
  var details: Dict
  
  var error: String
}
object ErrorArgs {
  
  inline def apply(details: Dict, error: String): ErrorArgs = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorArgs]
  }
  
  extension [Self <: ErrorArgs](x: Self) {
    
    inline def setDetails(value: Dict): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
