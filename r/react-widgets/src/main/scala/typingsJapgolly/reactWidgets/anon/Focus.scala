package typingsJapgolly.reactWidgets.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Focus extends StObject {
  
  def focus(): Unit
  
  def start(): Unit
  
  def stop(): Unit
}
object Focus {
  
  inline def apply(focus: Callback, start: Callback, stop: Callback): Focus = {
    val __obj = js.Dynamic.literal(focus = focus.toJsFn, start = start.toJsFn, stop = stop.toJsFn)
    __obj.asInstanceOf[Focus]
  }
  
  extension [Self <: Focus](x: Self) {
    
    inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
    
    inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
