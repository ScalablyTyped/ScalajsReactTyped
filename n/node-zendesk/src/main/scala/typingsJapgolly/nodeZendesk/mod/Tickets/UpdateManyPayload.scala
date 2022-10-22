package typingsJapgolly.nodeZendesk.mod.Tickets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateManyPayload extends StObject {
  
  val tickets: js.Array[UpdateModel]
}
object UpdateManyPayload {
  
  inline def apply(tickets: js.Array[UpdateModel]): UpdateManyPayload = {
    val __obj = js.Dynamic.literal(tickets = tickets.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateManyPayload]
  }
  
  extension [Self <: UpdateManyPayload](x: Self) {
    
    inline def setTickets(value: js.Array[UpdateModel]): Self = StObject.set(x, "tickets", value.asInstanceOf[js.Any])
    
    inline def setTicketsVarargs(value: UpdateModel*): Self = StObject.set(x, "tickets", js.Array(value*))
  }
}
