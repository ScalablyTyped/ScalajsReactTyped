package typingsJapgolly.jasmineAjax

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JasmineAjaxRequestStub extends StObject {
  
  def andCallFunction(functionToCall: js.Function1[/* request */ JasmineAjaxRequest, Unit]): Unit
  
  def andError(options: JasmineAjaxRequestStubErrorOptions): Unit
  
  def andReturn(options: JasmineAjaxResponse): Unit
  
  def andTimeout(): Unit
  
  var data: String
  
  def matches(fullUrl: String, data: String, method: String): Boolean
  
  var method: String
  
  var query: String
  
  var url: js.RegExp | String
}
object JasmineAjaxRequestStub {
  
  inline def apply(
    andCallFunction: js.Function1[/* request */ JasmineAjaxRequest, Unit] => Callback,
    andError: JasmineAjaxRequestStubErrorOptions => Callback,
    andReturn: JasmineAjaxResponse => Callback,
    andTimeout: Callback,
    data: String,
    matches: (String, String, String) => Boolean,
    method: String,
    query: String,
    url: js.RegExp | String
  ): JasmineAjaxRequestStub = {
    val __obj = js.Dynamic.literal(andCallFunction = js.Any.fromFunction1((t0: js.Function1[/* request */ JasmineAjaxRequest, Unit]) => andCallFunction(t0).runNow()), andError = js.Any.fromFunction1((t0: JasmineAjaxRequestStubErrorOptions) => andError(t0).runNow()), andReturn = js.Any.fromFunction1((t0: JasmineAjaxResponse) => andReturn(t0).runNow()), andTimeout = andTimeout.toJsFn, data = data.asInstanceOf[js.Any], matches = js.Any.fromFunction3(matches), method = method.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[JasmineAjaxRequestStub]
  }
  
  extension [Self <: JasmineAjaxRequestStub](x: Self) {
    
    inline def setAndCallFunction(value: js.Function1[/* request */ JasmineAjaxRequest, Unit] => Callback): Self = StObject.set(x, "andCallFunction", js.Any.fromFunction1((t0: js.Function1[/* request */ JasmineAjaxRequest, Unit]) => value(t0).runNow()))
    
    inline def setAndError(value: JasmineAjaxRequestStubErrorOptions => Callback): Self = StObject.set(x, "andError", js.Any.fromFunction1((t0: JasmineAjaxRequestStubErrorOptions) => value(t0).runNow()))
    
    inline def setAndReturn(value: JasmineAjaxResponse => Callback): Self = StObject.set(x, "andReturn", js.Any.fromFunction1((t0: JasmineAjaxResponse) => value(t0).runNow()))
    
    inline def setAndTimeout(value: Callback): Self = StObject.set(x, "andTimeout", value.toJsFn)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMatches(value: (String, String, String) => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction3(value))
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: js.RegExp | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
