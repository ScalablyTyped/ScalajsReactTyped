package typingsJapgolly.natsHemera.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerRequest extends StObject {
  
  var error: js.Error
  
  var payload: HemeraMessagePayload
}
object ServerRequest {
  
  inline def apply(error: js.Error, payload: HemeraMessagePayload): ServerRequest = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerRequest]
  }
  
  extension [Self <: ServerRequest](x: Self) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: HemeraMessagePayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
