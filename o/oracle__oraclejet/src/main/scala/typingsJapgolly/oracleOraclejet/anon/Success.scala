package typingsJapgolly.oracleOraclejet.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Success
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var error: js.UndefOr[js.Function3[/* xhr */ Any, /* status */ Any, /* error */ Any, Unit]] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* json */ js.UndefOr[js.Array[Any]], Unit]] = js.undefined
}
object Success {
  
  inline def apply(): Success = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Success]
  }
  
  extension [Self <: Success](x: Self) {
    
    inline def setError(value: (/* xhr */ Any, /* status */ Any, /* error */ Any) => Callback): Self = StObject.set(x, "error", js.Any.fromFunction3((t0: /* xhr */ Any, t1: /* status */ Any, t2: /* error */ Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setSuccess(value: /* json */ js.UndefOr[js.Array[Any]] => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* json */ js.UndefOr[js.Array[Any]]) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
