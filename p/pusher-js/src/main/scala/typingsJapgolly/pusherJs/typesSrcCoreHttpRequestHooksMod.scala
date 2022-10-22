package typingsJapgolly.pusherJs

import japgolly.scalajs.react.Callback
import typingsJapgolly.pusherJs.typesSrcCoreHttpAjaxMod.Ajax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreHttpRequestHooksMod {
  
  trait RequestHooks extends StObject {
    
    def abortRequest(HTTPRequest: Any): Unit
    
    def getRequest(HTTPRequest: Any): Ajax
  }
  object RequestHooks {
    
    inline def apply(abortRequest: Any => Callback, getRequest: Any => Ajax): RequestHooks = {
      val __obj = js.Dynamic.literal(abortRequest = js.Any.fromFunction1((t0: Any) => abortRequest(t0).runNow()), getRequest = js.Any.fromFunction1(getRequest))
      __obj.asInstanceOf[RequestHooks]
    }
    
    extension [Self <: RequestHooks](x: Self) {
      
      inline def setAbortRequest(value: Any => Callback): Self = StObject.set(x, "abortRequest", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setGetRequest(value: Any => Ajax): Self = StObject.set(x, "getRequest", js.Any.fromFunction1(value))
    }
  }
}
