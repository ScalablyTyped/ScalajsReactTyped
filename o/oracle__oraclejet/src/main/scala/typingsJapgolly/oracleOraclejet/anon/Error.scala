package typingsJapgolly.oracleOraclejet.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var error: js.UndefOr[
    js.Function3[/* model */ this.type, /* xhr */ Any, /* options */ js.Object, Unit]
  ] = js.undefined
  
  var success: js.UndefOr[
    js.Function3[/* model */ this.type, /* response */ Any, /* options */ js.Object, Unit]
  ] = js.undefined
}
object Error {
  
  inline def apply(): Error = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: (Error, /* xhr */ Any, /* options */ js.Object) => Callback): Self = StObject.set(x, "error", js.Any.fromFunction3((t0: Error, t1: /* xhr */ Any, t2: /* options */ js.Object) => (value(t0, t1, t2)).runNow()))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setSuccess(value: (Error, /* response */ Any, /* options */ js.Object) => Callback): Self = StObject.set(x, "success", js.Any.fromFunction3((t0: Error, t1: /* response */ Any, t2: /* options */ js.Object) => (value(t0, t1, t2)).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
