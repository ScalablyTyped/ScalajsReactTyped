package typingsJapgolly.axel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait cursorInterface extends StObject {
  
  def off(): Unit
  
  def on(): Unit
  
  def reset(): Unit
  
  def restore(): Unit
}
object cursorInterface {
  
  inline def apply(off: Callback, on: Callback, reset: Callback, restore: Callback): cursorInterface = {
    val __obj = js.Dynamic.literal(off = off.toJsFn, on = on.toJsFn, reset = reset.toJsFn, restore = restore.toJsFn)
    __obj.asInstanceOf[cursorInterface]
  }
  
  extension [Self <: cursorInterface](x: Self) {
    
    inline def setOff(value: Callback): Self = StObject.set(x, "off", value.toJsFn)
    
    inline def setOn(value: Callback): Self = StObject.set(x, "on", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setRestore(value: Callback): Self = StObject.set(x, "restore", value.toJsFn)
  }
}
