package typingsJapgolly.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendEnrollmentTicketData extends StObject {
  
  var send_mail: js.UndefOr[Boolean] = js.undefined
  
  var user_id: String
}
object SendEnrollmentTicketData {
  
  inline def apply(user_id: String): SendEnrollmentTicketData = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendEnrollmentTicketData]
  }
  
  extension [Self <: SendEnrollmentTicketData](x: Self) {
    
    inline def setSend_mail(value: Boolean): Self = StObject.set(x, "send_mail", value.asInstanceOf[js.Any])
    
    inline def setSend_mailUndefined: Self = StObject.set(x, "send_mail", js.undefined)
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
