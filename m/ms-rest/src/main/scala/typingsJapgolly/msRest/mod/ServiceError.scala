package typingsJapgolly.msRest.mod

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceError
  extends StObject
     with Error {
  
  var body: Any
  
  var request: WebResource
  
  var response: typingsJapgolly.node.httpMod.IncomingMessage
  
  var statusCode: Double
}
object ServiceError {
  
  inline def apply(
    body: Any,
    message: String,
    name: String,
    request: WebResource,
    response: typingsJapgolly.node.httpMod.IncomingMessage,
    statusCode: Double
  ): ServiceError = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceError]
  }
  
  extension [Self <: ServiceError](x: Self) {
    
    inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: WebResource): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: typingsJapgolly.node.httpMod.IncomingMessage): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
