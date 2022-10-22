package typingsJapgolly.ahooks.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.ahooks.libUseEventTargetMod.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChange[U] extends StObject {
  
  def onChange(e: EventTarget[U]): Unit
  
  def reset(): Unit
}
object OnChange {
  
  inline def apply[U](onChange: EventTarget[U] => Callback, reset: Callback): OnChange[U] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: EventTarget[U]) => onChange(t0).runNow()), reset = reset.toJsFn)
    __obj.asInstanceOf[OnChange[U]]
  }
  
  extension [Self <: OnChange[?], U](x: Self & OnChange[U]) {
    
    inline def setOnChange(value: EventTarget[U] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: EventTarget[U]) => value(t0).runNow()))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
  }
}
