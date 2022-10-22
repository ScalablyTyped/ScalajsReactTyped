package typingsJapgolly.imapflow.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailboxDeleteResponse extends StObject {
  
  var path: String
}
object MailboxDeleteResponse {
  
  inline def apply(path: String): MailboxDeleteResponse = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailboxDeleteResponse]
  }
  
  extension [Self <: MailboxDeleteResponse](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
