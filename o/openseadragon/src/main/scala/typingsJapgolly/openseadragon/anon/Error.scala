package typingsJapgolly.openseadragon.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  def error(obj: js.Object): Unit
  
  var headers: js.Object
  
  var responseType: String
  
  def success(obj: js.Object): Unit
  
  var url: String
  
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object Error {
  
  inline def apply(
    error: js.Object => Callback,
    headers: js.Object,
    responseType: String,
    success: js.Object => Callback,
    url: String
  ): Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: js.Object) => error(t0).runNow()), headers = headers.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: js.Object) => success(t0).runNow()), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: js.Object => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: js.Object => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
