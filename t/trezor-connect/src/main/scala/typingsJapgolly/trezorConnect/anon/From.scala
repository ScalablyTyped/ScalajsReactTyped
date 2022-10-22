package typingsJapgolly.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  var from: String
  
  var memo: String
  
  var quantity: String
  
  var to: String
}
object From {
  
  inline def apply(from: String, memo: String, quantity: String, to: String): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], memo = memo.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  extension [Self <: From](x: Self) {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setMemo(value: String): Self = StObject.set(x, "memo", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: String): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
