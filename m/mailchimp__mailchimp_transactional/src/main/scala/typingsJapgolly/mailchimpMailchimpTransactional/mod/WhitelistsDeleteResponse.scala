package typingsJapgolly.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhitelistsDeleteResponse extends StObject {
  
  /** whether the address was deleted successfully */
  var deleted: Boolean
  
  /** the email address that was removed from the denylist */
  var email: String
}
object WhitelistsDeleteResponse {
  
  inline def apply(deleted: Boolean, email: String): WhitelistsDeleteResponse = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhitelistsDeleteResponse]
  }
  
  extension [Self <: WhitelistsDeleteResponse](x: Self) {
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
