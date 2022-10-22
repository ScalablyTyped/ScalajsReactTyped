package typingsJapgolly.simperium.mod

import typingsJapgolly.simperium.simperiumInts.`400`
import typingsJapgolly.simperium.simperiumInts.`401`
import typingsJapgolly.simperium.simperiumInts.`500`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedAuthDetails extends StObject {
  
  var code: `400` | `401` | `500`
  
  var msg: String
}
object FailedAuthDetails {
  
  inline def apply(code: `400` | `401` | `500`, msg: String): FailedAuthDetails = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedAuthDetails]
  }
  
  extension [Self <: FailedAuthDetails](x: Self) {
    
    inline def setCode(value: `400` | `401` | `500`): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
  }
}
