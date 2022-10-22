package typingsJapgolly.createTestServer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Get extends StObject {
    
    def get(url: String, response: String): Unit
  }
  object Get {
    
    inline def apply(get: (String, String) => Callback): Get = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2((t0: String, t1: String) => (get(t0, t1)).runNow()))
      __obj.asInstanceOf[Get]
    }
    
    extension [Self <: Get](x: Self) {
      
      inline def setGet(value: (String, String) => Callback): Self = StObject.set(x, "get", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    }
  }
}
