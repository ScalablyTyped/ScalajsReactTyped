package typingsJapgolly.nodemailer.libSmtpConnectionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credentials extends StObject {
  
  /** then password */
  var pass: String
  
  /** the username */
  var user: String
}
object Credentials {
  
  inline def apply(pass: String, user: String): Credentials = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
  
  extension [Self <: Credentials](x: Self) {
    
    inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
