package typingsJapgolly.jqueryColorpicker

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryColorpickerInstance extends StObject {
  
  def close(): Unit
  
  def destroy(): Unit
  
  def open(): Unit
  
  def setColor(color: Any): Unit
}
object JQueryColorpickerInstance {
  
  inline def apply(close: Callback, destroy: Callback, open: Callback, setColor: Any => Callback): JQueryColorpickerInstance = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, destroy = destroy.toJsFn, open = open.toJsFn, setColor = js.Any.fromFunction1((t0: Any) => setColor(t0).runNow()))
    __obj.asInstanceOf[JQueryColorpickerInstance]
  }
  
  extension [Self <: JQueryColorpickerInstance](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
    
    inline def setSetColor(value: Any => Callback): Self = StObject.set(x, "setColor", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
