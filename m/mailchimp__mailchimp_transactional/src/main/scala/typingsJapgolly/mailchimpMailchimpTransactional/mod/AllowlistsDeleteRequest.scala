package typingsJapgolly.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowlistsDeleteRequest
  extends StObject
     with BaseRequest {
  
  /** the email address to remove from the allowlist */
  var email: String
}
object AllowlistsDeleteRequest {
  
  inline def apply(email: String): AllowlistsDeleteRequest = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowlistsDeleteRequest]
  }
  
  extension [Self <: AllowlistsDeleteRequest](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
