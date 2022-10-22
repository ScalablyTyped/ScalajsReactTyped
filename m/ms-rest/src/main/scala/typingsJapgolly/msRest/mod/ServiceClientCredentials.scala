package typingsJapgolly.msRest.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceClientCredentials extends StObject {
  
  /**
    * Signs a request with the Authentication header.
    *
    * @param {WebResource} The WebResource to be signed.
    * @param {function(error)}  callback  The callback function.
    */
  def signRequest(webResource: WebResource, callback: js.Function1[/* err */ js.Error, Unit]): Unit
}
object ServiceClientCredentials {
  
  inline def apply(signRequest: (WebResource, js.Function1[/* err */ js.Error, Unit]) => Callback): ServiceClientCredentials = {
    val __obj = js.Dynamic.literal(signRequest = js.Any.fromFunction2((t0: WebResource, t1: js.Function1[/* err */ js.Error, Unit]) => (signRequest(t0, t1)).runNow()))
    __obj.asInstanceOf[ServiceClientCredentials]
  }
  
  extension [Self <: ServiceClientCredentials](x: Self) {
    
    inline def setSignRequest(value: (WebResource, js.Function1[/* err */ js.Error, Unit]) => Callback): Self = StObject.set(x, "signRequest", js.Any.fromFunction2((t0: WebResource, t1: js.Function1[/* err */ js.Error, Unit]) => (value(t0, t1)).runNow()))
  }
}
