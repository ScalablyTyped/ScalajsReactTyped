package typingsJapgolly.naja.anon

import org.scalajs.dom.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  var error: js.Error
  
  var options: typingsJapgolly.naja.distNajaMod.Options
  
  var request: org.scalajs.dom.Request
  
  var response: js.UndefOr[Response] = js.undefined
}
object Request {
  
  inline def apply(
    error: js.Error,
    options: typingsJapgolly.naja.distNajaMod.Options,
    request: org.scalajs.dom.Request
  ): Request = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  extension [Self <: Request](x: Self) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: typingsJapgolly.naja.distNajaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: org.scalajs.dom.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
