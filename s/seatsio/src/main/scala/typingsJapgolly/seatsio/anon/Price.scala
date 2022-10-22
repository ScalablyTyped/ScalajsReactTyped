package typingsJapgolly.seatsio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Price extends StObject {
  
  var price: Double
  
  var ticketType: js.UndefOr[String] = js.undefined
}
object Price {
  
  inline def apply(price: Double): Price = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any])
    __obj.asInstanceOf[Price]
  }
  
  extension [Self <: Price](x: Self) {
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setTicketType(value: String): Self = StObject.set(x, "ticketType", value.asInstanceOf[js.Any])
    
    inline def setTicketTypeUndefined: Self = StObject.set(x, "ticketType", js.undefined)
  }
}
