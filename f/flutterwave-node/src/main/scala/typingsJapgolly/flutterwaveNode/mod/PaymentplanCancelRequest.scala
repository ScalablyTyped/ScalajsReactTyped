package typingsJapgolly.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentplanCancelRequest extends StObject {
  
  var id: String
}
object PaymentplanCancelRequest {
  
  inline def apply(id: String): PaymentplanCancelRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentplanCancelRequest]
  }
  
  extension [Self <: PaymentplanCancelRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
