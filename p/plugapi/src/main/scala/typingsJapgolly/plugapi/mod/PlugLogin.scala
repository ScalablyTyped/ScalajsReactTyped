package typingsJapgolly.plugapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlugLogin extends StObject {
  
  var email: String
  
  var password: String
}
object PlugLogin {
  
  inline def apply(email: String, password: String): PlugLogin = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlugLogin]
  }
  
  extension [Self <: PlugLogin](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
