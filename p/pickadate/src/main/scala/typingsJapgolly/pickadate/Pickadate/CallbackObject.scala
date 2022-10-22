package typingsJapgolly.pickadate.Pickadate

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackObject extends StObject {
  
  var close: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var open: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var render: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var set: js.UndefOr[js.Function1[/* thingSet */ Any, Unit]] = js.undefined
  
  var start: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var stop: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object CallbackObject {
  
  inline def apply(): CallbackObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackObject]
  }
  
  extension [Self <: CallbackObject](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setRender(value: Callback): Self = StObject.set(x, "render", value.toJsFn)
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setSet(value: /* thingSet */ Any => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: /* thingSet */ Any) => value(t0).runNow()))
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
