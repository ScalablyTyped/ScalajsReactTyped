package typingsJapgolly.firebaseFunctions

import org.scalajs.dom.RequestInit
import org.scalajs.dom.Response
import org.scalajs.dom.URL
import typingsJapgolly.std.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Details extends StObject {
    
    var details: js.UndefOr[Any] = js.undefined
    
    var message: js.UndefOr[Any] = js.undefined
    
    var status: js.UndefOr[Any] = js.undefined
  }
  object Details {
    
    inline def apply(): Details = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Details]
    }
    
    extension [Self <: Details](x: Self) {
      
      inline def setDetails(value: Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setStatus(value: Any): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(input: URL): js.Promise[Response] = js.native
    def apply(input: URL, init: RequestInit): js.Promise[Response] = js.native
    def apply(input: RequestInfo): js.Promise[Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
}
