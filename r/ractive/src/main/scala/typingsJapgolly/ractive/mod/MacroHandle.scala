package typingsJapgolly.ractive.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MacroHandle extends StObject {
  
  var invalidate: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var render: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var teardown: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var update: js.UndefOr[js.Function1[/* attributes */ ValueMap, Unit]] = js.undefined
}
object MacroHandle {
  
  inline def apply(): MacroHandle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacroHandle]
  }
  
  extension [Self <: MacroHandle](x: Self) {
    
    inline def setInvalidate(value: Callback): Self = StObject.set(x, "invalidate", value.toJsFn)
    
    inline def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
    
    inline def setRender(value: Callback): Self = StObject.set(x, "render", value.toJsFn)
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setTeardown(value: Callback): Self = StObject.set(x, "teardown", value.toJsFn)
    
    inline def setTeardownUndefined: Self = StObject.set(x, "teardown", js.undefined)
    
    inline def setUpdate(value: /* attributes */ ValueMap => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: /* attributes */ ValueMap) => value(t0).runNow()))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
