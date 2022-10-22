package typingsJapgolly.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbSignUpResults extends StObject {
  
  /** user's email */
  var email: String
  
  /** if the user's email was verified */
  var emailVerified: Boolean
}
object DbSignUpResults {
  
  inline def apply(email: String, emailVerified: Boolean): DbSignUpResults = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], emailVerified = emailVerified.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbSignUpResults]
  }
  
  extension [Self <: DbSignUpResults](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailVerified(value: Boolean): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
  }
}
