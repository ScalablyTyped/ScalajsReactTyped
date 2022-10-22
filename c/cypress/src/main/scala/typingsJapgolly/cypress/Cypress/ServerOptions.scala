package typingsJapgolly.cypress.Cypress

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Setting default options for cy.server()
  * @see https://on.cypress.io/server
  */
trait ServerOptions extends StObject {
  
  var delay: Double
  
  var enable: Boolean
  
  var force404: Boolean
  
  var headers: js.Object
  
  def ignore(xhr: Request): Unit
  
  var method: HttpMethod
  
  def onAbort(args: Any*): Unit
  
  def onAnyAbort(route: RouteOptions, proxy: Any): Unit
  
  def onAnyRequest(route: RouteOptions, proxy: Any): Unit
  
  def onAnyResponse(route: RouteOptions, proxy: Any): Unit
  
  def onRequest(args: Any*): Unit
  
  def onResponse(args: Any*): Unit
  
  var response: Any
  
  var status: Double
  
  var urlMatchingOptions: js.Object
}
object ServerOptions {
  
  inline def apply(
    delay: Double,
    enable: Boolean,
    force404: Boolean,
    headers: js.Object,
    ignore: Request => Callback,
    method: HttpMethod,
    onAbort: /* repeated */ Any => Callback,
    onAnyAbort: (RouteOptions, Any) => Callback,
    onAnyRequest: (RouteOptions, Any) => Callback,
    onAnyResponse: (RouteOptions, Any) => Callback,
    onRequest: /* repeated */ Any => Callback,
    onResponse: /* repeated */ Any => Callback,
    response: Any,
    status: Double,
    urlMatchingOptions: js.Object
  ): ServerOptions = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], force404 = force404.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ignore = js.Any.fromFunction1((t0: Request) => ignore(t0).runNow()), method = method.asInstanceOf[js.Any], onAbort = js.Any.fromFunction1((t0: /* repeated */ Any) => onAbort(t0).runNow()), onAnyAbort = js.Any.fromFunction2((t0: RouteOptions, t1: Any) => (onAnyAbort(t0, t1)).runNow()), onAnyRequest = js.Any.fromFunction2((t0: RouteOptions, t1: Any) => (onAnyRequest(t0, t1)).runNow()), onAnyResponse = js.Any.fromFunction2((t0: RouteOptions, t1: Any) => (onAnyResponse(t0, t1)).runNow()), onRequest = js.Any.fromFunction1((t0: /* repeated */ Any) => onRequest(t0).runNow()), onResponse = js.Any.fromFunction1((t0: /* repeated */ Any) => onResponse(t0).runNow()), response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], urlMatchingOptions = urlMatchingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
  
  extension [Self <: ServerOptions](x: Self) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setForce404(value: Boolean): Self = StObject.set(x, "force404", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setIgnore(value: Request => Callback): Self = StObject.set(x, "ignore", js.Any.fromFunction1((t0: Request) => value(t0).runNow()))
    
    inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setOnAbort(value: /* repeated */ Any => Callback): Self = StObject.set(x, "onAbort", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setOnAnyAbort(value: (RouteOptions, Any) => Callback): Self = StObject.set(x, "onAnyAbort", js.Any.fromFunction2((t0: RouteOptions, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setOnAnyRequest(value: (RouteOptions, Any) => Callback): Self = StObject.set(x, "onAnyRequest", js.Any.fromFunction2((t0: RouteOptions, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setOnAnyResponse(value: (RouteOptions, Any) => Callback): Self = StObject.set(x, "onAnyResponse", js.Any.fromFunction2((t0: RouteOptions, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setOnRequest(value: /* repeated */ Any => Callback): Self = StObject.set(x, "onRequest", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setOnResponse(value: /* repeated */ Any => Callback): Self = StObject.set(x, "onResponse", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrlMatchingOptions(value: js.Object): Self = StObject.set(x, "urlMatchingOptions", value.asInstanceOf[js.Any])
  }
}
