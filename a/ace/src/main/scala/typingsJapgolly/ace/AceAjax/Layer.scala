package typingsJapgolly.ace.AceAjax

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Layer {
  
  trait Cursor extends StObject {
    
    def hideCursor(): Unit
    
    def setBlinkInterval(blinkInterval: Double): Unit
    
    def setBlinking(blinking: Boolean): Unit
    
    def showCursor(): Unit
  }
  object Cursor {
    
    inline def apply(
      hideCursor: Callback,
      setBlinkInterval: Double => Callback,
      setBlinking: Boolean => Callback,
      showCursor: Callback
    ): Cursor = {
      val __obj = js.Dynamic.literal(hideCursor = hideCursor.toJsFn, setBlinkInterval = js.Any.fromFunction1((t0: Double) => setBlinkInterval(t0).runNow()), setBlinking = js.Any.fromFunction1((t0: Boolean) => setBlinking(t0).runNow()), showCursor = showCursor.toJsFn)
      __obj.asInstanceOf[Cursor]
    }
    
    extension [Self <: Cursor](x: Self) {
      
      inline def setHideCursor(value: Callback): Self = StObject.set(x, "hideCursor", value.toJsFn)
      
      inline def setSetBlinkInterval(value: Double => Callback): Self = StObject.set(x, "setBlinkInterval", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetBlinking(value: Boolean => Callback): Self = StObject.set(x, "setBlinking", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setShowCursor(value: Callback): Self = StObject.set(x, "showCursor", value.toJsFn)
    }
  }
}
