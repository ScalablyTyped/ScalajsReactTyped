package typingsJapgolly.kendoUi.kendo

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ RouterChangeEvent, Unit]] = js.undefined
  
  var hashBang: js.UndefOr[Boolean] = js.undefined
  
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  
  var init: js.UndefOr[js.Function1[/* e */ RouterEvent, Unit]] = js.undefined
  
  var pushState: js.UndefOr[Boolean] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
  
  var routeMissing: js.UndefOr[js.Function1[/* e */ RouterRouteMissingEvent, Unit]] = js.undefined
  
  var same: js.UndefOr[js.Function1[/* e */ RouterEvent, Unit]] = js.undefined
}
object RouterOptions {
  
  inline def apply(): RouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterOptions]
  }
  
  extension [Self <: RouterOptions](x: Self) {
    
    inline def setChange(value: /* e */ RouterChangeEvent => Callback): Self = StObject.set(x, "change", js.Any.fromFunction1((t0: /* e */ RouterChangeEvent) => value(t0).runNow()))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setHashBang(value: Boolean): Self = StObject.set(x, "hashBang", value.asInstanceOf[js.Any])
    
    inline def setHashBangUndefined: Self = StObject.set(x, "hashBang", js.undefined)
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    inline def setInit(value: /* e */ RouterEvent => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: /* e */ RouterEvent) => value(t0).runNow()))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setPushState(value: Boolean): Self = StObject.set(x, "pushState", value.asInstanceOf[js.Any])
    
    inline def setPushStateUndefined: Self = StObject.set(x, "pushState", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setRouteMissing(value: /* e */ RouterRouteMissingEvent => Callback): Self = StObject.set(x, "routeMissing", js.Any.fromFunction1((t0: /* e */ RouterRouteMissingEvent) => value(t0).runNow()))
    
    inline def setRouteMissingUndefined: Self = StObject.set(x, "routeMissing", js.undefined)
    
    inline def setSame(value: /* e */ RouterEvent => Callback): Self = StObject.set(x, "same", js.Any.fromFunction1((t0: /* e */ RouterEvent) => value(t0).runNow()))
    
    inline def setSameUndefined: Self = StObject.set(x, "same", js.undefined)
  }
}
