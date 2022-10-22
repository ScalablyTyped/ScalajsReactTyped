package typingsJapgolly.naja.anon

import org.scalajs.dom.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payload extends StObject {
  
  var options: typingsJapgolly.naja.distNajaMod.Options
  
  var payload: typingsJapgolly.naja.distNajaMod.Payload
  
  var request: org.scalajs.dom.Request
  
  var response: Response
}
object Payload {
  
  inline def apply(
    options: typingsJapgolly.naja.distNajaMod.Options,
    payload: typingsJapgolly.naja.distNajaMod.Payload,
    request: org.scalajs.dom.Request,
    response: Response
  ): Payload = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
  
  extension [Self <: Payload](x: Self) {
    
    inline def setOptions(value: typingsJapgolly.naja.distNajaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: typingsJapgolly.naja.distNajaMod.Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: org.scalajs.dom.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
