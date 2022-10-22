package typingsJapgolly.seatsio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelPrice extends StObject {
  
  var label: js.UndefOr[String] = js.undefined
  
  var price: Double
  
  var ticketType: String
}
object LabelPrice {
  
  inline def apply(price: Double, ticketType: String): LabelPrice = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any], ticketType = ticketType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelPrice]
  }
  
  extension [Self <: LabelPrice](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setTicketType(value: String): Self = StObject.set(x, "ticketType", value.asInstanceOf[js.Any])
  }
}
