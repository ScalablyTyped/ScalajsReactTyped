package typingsJapgolly.arangodb.Foxx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionTransport extends StObject {
  
  var clear: js.UndefOr[js.Function1[/* res */ Response, Unit]] = js.undefined
  
  var get: js.UndefOr[js.Function1[/* req */ Request, String | Null]] = js.undefined
  
  var set: js.UndefOr[js.Function2[/* res */ Response, /* sid */ String, Unit]] = js.undefined
}
object SessionTransport {
  
  inline def apply(): SessionTransport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionTransport]
  }
  
  extension [Self <: SessionTransport](x: Self) {
    
    inline def setClear(value: /* res */ Response => Callback): Self = StObject.set(x, "clear", js.Any.fromFunction1((t0: /* res */ Response) => value(t0).runNow()))
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setGet(value: /* req */ Request => String | Null): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setSet(value: (/* res */ Response, /* sid */ String) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: /* res */ Response, t1: /* sid */ String) => (value(t0, t1)).runNow()))
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
  }
}
