package typingsJapgolly.nginstackEngine.anon

import typingsJapgolly.nginstackEngine.libRouterBrokerMod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  var request: js.UndefOr[typingsJapgolly.nginstackEngine.libRouterBrokerMod.Request] = js.undefined
  
  var response: js.UndefOr[Response] = js.undefined
}
object Request {
  
  inline def apply(): Request = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Request]
  }
  
  extension [Self <: Request](x: Self) {
    
    inline def setRequest(value: typingsJapgolly.nginstackEngine.libRouterBrokerMod.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
