package typingsJapgolly.vkOpenapi.vk.OpenAPI

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Api {
  
  trait API extends StObject {
    
    def call(method: String, params: ApiParams, cb: js.Function1[/* response */ Any, Unit]): Unit
  }
  object API {
    
    inline def apply(call: (String, ApiParams, js.Function1[/* response */ Any, Unit]) => Callback): API = {
      val __obj = js.Dynamic.literal(call = js.Any.fromFunction3((t0: String, t1: ApiParams, t2: js.Function1[/* response */ Any, Unit]) => (call(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[API]
    }
    
    extension [Self <: API](x: Self) {
      
      inline def setCall(value: (String, ApiParams, js.Function1[/* response */ Any, Unit]) => Callback): Self = StObject.set(x, "call", js.Any.fromFunction3((t0: String, t1: ApiParams, t2: js.Function1[/* response */ Any, Unit]) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  trait ApiParams
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var v: String
  }
  object ApiParams {
    
    inline def apply(v: String): ApiParams = {
      val __obj = js.Dynamic.literal(v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiParams]
    }
    
    extension [Self <: ApiParams](x: Self) {
      
      inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
}
