package typingsJapgolly.servicenow.servicenow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RESTAPIResponse extends StObject {
  
  def getStreamWriter(): RESTAPIResponseStream
  
  def setBody(body: Any): Unit
  
  def setContentType(contentType: String): Unit
  
  def setError(error: Any): Unit
  
  def setHeader(header: String, value: String): Unit
  
  def setHeaders(headers: Any): Unit
  
  def setLocation(location: String): Unit
  
  def setStatus(status: Double): Unit
}
object RESTAPIResponse {
  
  inline def apply(
    getStreamWriter: CallbackTo[RESTAPIResponseStream],
    setBody: Any => Callback,
    setContentType: String => Callback,
    setError: Any => Callback,
    setHeader: (String, String) => Callback,
    setHeaders: Any => Callback,
    setLocation: String => Callback,
    setStatus: Double => Callback
  ): RESTAPIResponse = {
    val __obj = js.Dynamic.literal(getStreamWriter = getStreamWriter.toJsFn, setBody = js.Any.fromFunction1((t0: Any) => setBody(t0).runNow()), setContentType = js.Any.fromFunction1((t0: String) => setContentType(t0).runNow()), setError = js.Any.fromFunction1((t0: Any) => setError(t0).runNow()), setHeader = js.Any.fromFunction2((t0: String, t1: String) => (setHeader(t0, t1)).runNow()), setHeaders = js.Any.fromFunction1((t0: Any) => setHeaders(t0).runNow()), setLocation = js.Any.fromFunction1((t0: String) => setLocation(t0).runNow()), setStatus = js.Any.fromFunction1((t0: Double) => setStatus(t0).runNow()))
    __obj.asInstanceOf[RESTAPIResponse]
  }
  
  extension [Self <: RESTAPIResponse](x: Self) {
    
    inline def setGetStreamWriter(value: CallbackTo[RESTAPIResponseStream]): Self = StObject.set(x, "getStreamWriter", value.toJsFn)
    
    inline def setSetBody(value: Any => Callback): Self = StObject.set(x, "setBody", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetContentType(value: String => Callback): Self = StObject.set(x, "setContentType", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetError(value: Any => Callback): Self = StObject.set(x, "setError", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetHeader(value: (String, String) => Callback): Self = StObject.set(x, "setHeader", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetHeaders(value: Any => Callback): Self = StObject.set(x, "setHeaders", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetLocation(value: String => Callback): Self = StObject.set(x, "setLocation", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetStatus(value: Double => Callback): Self = StObject.set(x, "setStatus", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
