package typingsJapgolly.seleniumWebdriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var error: String
  
  var message: String
}
object Error {
  
  inline def apply(error: String, message: String): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
