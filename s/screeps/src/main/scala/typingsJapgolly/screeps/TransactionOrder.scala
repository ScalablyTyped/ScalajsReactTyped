package typingsJapgolly.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionOrder extends StObject {
  
  var id: String
  
  var price: Double
  
  var `type`: String
}
object TransactionOrder {
  
  inline def apply(id: String, price: Double, `type`: String): TransactionOrder = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionOrder]
  }
  
  extension [Self <: TransactionOrder](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
