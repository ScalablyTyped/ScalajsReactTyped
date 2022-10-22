package typingsJapgolly.cypress.Cypress

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteOptions extends StObject {
  
  var delay: Double
  
  var force404: Boolean
  
  var headers: js.Object | Null
  
  var method: HttpMethod
  
  def onAbort(args: Any*): Unit
  
  def onRequest(args: Any*): Unit
  
  def onResponse(args: Any*): Unit
  
  var response: Any
  
  var status: Double
  
  var url: String | js.RegExp
}
object RouteOptions {
  
  inline def apply(
    delay: Double,
    force404: Boolean,
    method: HttpMethod,
    onAbort: /* repeated */ Any => Callback,
    onRequest: /* repeated */ Any => Callback,
    onResponse: /* repeated */ Any => Callback,
    response: Any,
    status: Double,
    url: String | js.RegExp
  ): RouteOptions = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], force404 = force404.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], onAbort = js.Any.fromFunction1((t0: /* repeated */ Any) => onAbort(t0).runNow()), onRequest = js.Any.fromFunction1((t0: /* repeated */ Any) => onRequest(t0).runNow()), onResponse = js.Any.fromFunction1((t0: /* repeated */ Any) => onResponse(t0).runNow()), response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], headers = null)
    __obj.asInstanceOf[RouteOptions]
  }
  
  extension [Self <: RouteOptions](x: Self) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setForce404(value: Boolean): Self = StObject.set(x, "force404", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersNull: Self = StObject.set(x, "headers", null)
    
    inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setOnAbort(value: /* repeated */ Any => Callback): Self = StObject.set(x, "onAbort", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setOnRequest(value: /* repeated */ Any => Callback): Self = StObject.set(x, "onRequest", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setOnResponse(value: /* repeated */ Any => Callback): Self = StObject.set(x, "onResponse", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String | js.RegExp): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
