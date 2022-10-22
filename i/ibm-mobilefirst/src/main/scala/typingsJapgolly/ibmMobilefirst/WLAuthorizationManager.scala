package typingsJapgolly.ibmMobilefirst

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WLAuthorizationManager {
  
  trait RequestObject extends StObject {
    
    def setRequestHeader(header: String, value: String): Unit
  }
  object RequestObject {
    
    inline def apply(setRequestHeader: (String, String) => Callback): RequestObject = {
      val __obj = js.Dynamic.literal(setRequestHeader = js.Any.fromFunction2((t0: String, t1: String) => (setRequestHeader(t0, t1)).runNow()))
      __obj.asInstanceOf[RequestObject]
    }
    
    extension [Self <: RequestObject](x: Self) {
      
      inline def setSetRequestHeader(value: (String, String) => Callback): Self = StObject.set(x, "setRequestHeader", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    }
  }
}
