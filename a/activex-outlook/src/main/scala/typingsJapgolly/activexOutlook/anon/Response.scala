package typingsJapgolly.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response extends StObject {
  
  var Cancel: Boolean
  
  val Response: Any
}
object Response {
  
  inline def apply(Cancel: Boolean, Response: Any): Response = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  
  extension [Self <: Response](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: Any): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
  }
}
