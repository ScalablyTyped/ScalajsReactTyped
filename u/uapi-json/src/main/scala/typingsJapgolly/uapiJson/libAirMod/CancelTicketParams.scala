package typingsJapgolly.uapiJson.libAirMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelTicketParams extends StObject {
  
  var ticketNumber: String
}
object CancelTicketParams {
  
  inline def apply(ticketNumber: String): CancelTicketParams = {
    val __obj = js.Dynamic.literal(ticketNumber = ticketNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelTicketParams]
  }
  
  extension [Self <: CancelTicketParams](x: Self) {
    
    inline def setTicketNumber(value: String): Self = StObject.set(x, "ticketNumber", value.asInstanceOf[js.Any])
  }
}
