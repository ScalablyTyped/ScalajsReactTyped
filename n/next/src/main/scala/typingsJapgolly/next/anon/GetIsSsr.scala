package typingsJapgolly.next.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIsSsr extends StObject {
  
  var getIsSsr: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var mountedInstances: js.UndefOr[Any] = js.undefined
  
  var scripts: js.UndefOr[Any] = js.undefined
  
  var updateHead: js.UndefOr[js.Function1[/* state */ Any, Unit]] = js.undefined
  
  var updateScripts: js.UndefOr[js.Function1[/* state */ Any, Unit]] = js.undefined
}
object GetIsSsr {
  
  inline def apply(): GetIsSsr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIsSsr]
  }
  
  extension [Self <: GetIsSsr](x: Self) {
    
    inline def setGetIsSsr(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsSsr", value.toJsFn)
    
    inline def setGetIsSsrUndefined: Self = StObject.set(x, "getIsSsr", js.undefined)
    
    inline def setMountedInstances(value: Any): Self = StObject.set(x, "mountedInstances", value.asInstanceOf[js.Any])
    
    inline def setMountedInstancesUndefined: Self = StObject.set(x, "mountedInstances", js.undefined)
    
    inline def setScripts(value: Any): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    inline def setUpdateHead(value: /* state */ Any => Callback): Self = StObject.set(x, "updateHead", js.Any.fromFunction1((t0: /* state */ Any) => value(t0).runNow()))
    
    inline def setUpdateHeadUndefined: Self = StObject.set(x, "updateHead", js.undefined)
    
    inline def setUpdateScripts(value: /* state */ Any => Callback): Self = StObject.set(x, "updateScripts", js.Any.fromFunction1((t0: /* state */ Any) => value(t0).runNow()))
    
    inline def setUpdateScriptsUndefined: Self = StObject.set(x, "updateScripts", js.undefined)
  }
}
