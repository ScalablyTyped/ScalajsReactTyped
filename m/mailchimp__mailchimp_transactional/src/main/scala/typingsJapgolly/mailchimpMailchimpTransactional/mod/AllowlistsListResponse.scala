package typingsJapgolly.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowlistsListResponse extends StObject {
  
  /** when the email was added to the allowlist */
  var created_at: String
  
  /** a description of why the email was allowlisted */
  var detail: String
  
  /** the email that is allowlisted */
  var email: String
}
object AllowlistsListResponse {
  
  inline def apply(created_at: String, detail: String, email: String): AllowlistsListResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowlistsListResponse]
  }
  
  extension [Self <: AllowlistsListResponse](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
