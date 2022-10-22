package typingsJapgolly.nodeZendesk.mod.Requests

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePayload extends StObject {
  
  val request: UpdateModel
}
object UpdatePayload {
  
  inline def apply(request: UpdateModel): UpdatePayload = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePayload]
  }
  
  extension [Self <: UpdatePayload](x: Self) {
    
    inline def setRequest(value: UpdateModel): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
