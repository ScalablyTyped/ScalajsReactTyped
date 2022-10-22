package typingsJapgolly.uapiJson.libAirMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTicketParams extends StObject {
  
  var ticketNumber: String
}
object GetTicketParams {
  
  inline def apply(ticketNumber: String): GetTicketParams = {
    val __obj = js.Dynamic.literal(ticketNumber = ticketNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTicketParams]
  }
  
  extension [Self <: GetTicketParams](x: Self) {
    
    inline def setTicketNumber(value: String): Self = StObject.set(x, "ticketNumber", value.asInstanceOf[js.Any])
  }
}
