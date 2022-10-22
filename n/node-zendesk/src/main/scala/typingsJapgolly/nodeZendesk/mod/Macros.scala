package typingsJapgolly.nodeZendesk.mod

import typingsJapgolly.nodeZendesk.anon.Comment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Macros {
  
  trait ApplyTicketResponsePayload extends StObject {
    
    var result: Comment
  }
  object ApplyTicketResponsePayload {
    
    inline def apply(result: Comment): ApplyTicketResponsePayload = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplyTicketResponsePayload]
    }
    
    extension [Self <: ApplyTicketResponsePayload](x: Self) {
      
      inline def setResult(value: Comment): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Methods extends StObject {
    
    def applyTicket(ticketId: ZendeskID, macroId: Double): js.Promise[ApplyTicketResponsePayload] = js.native
    def applyTicket(ticketId: ZendeskID, macroId: Double, cb: ZendeskCallback[Any, Any]): ApplyTicketResponsePayload = js.native
  }
}
