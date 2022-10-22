package typingsJapgolly.autobahn.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInvocation extends StObject {
  
  var caller: js.UndefOr[Double] = js.undefined
  
  var procedure: String
  
  var progress: js.UndefOr[js.Function2[/* args */ js.Array[Any], /* kwargs */ Any, Unit]] = js.undefined
}
object IInvocation {
  
  inline def apply(procedure: String): IInvocation = {
    val __obj = js.Dynamic.literal(procedure = procedure.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvocation]
  }
  
  extension [Self <: IInvocation](x: Self) {
    
    inline def setCaller(value: Double): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
    
    inline def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
    
    inline def setProcedure(value: String): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: (/* args */ js.Array[Any], /* kwargs */ Any) => Callback): Self = StObject.set(x, "progress", js.Any.fromFunction2((t0: /* args */ js.Array[Any], t1: /* kwargs */ Any) => (value(t0, t1)).runNow()))
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
