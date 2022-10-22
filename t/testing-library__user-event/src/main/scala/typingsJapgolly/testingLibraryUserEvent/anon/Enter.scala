package typingsJapgolly.testingLibraryUserEvent.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enter extends StObject {
  
  def enter(): Unit
  
  def leave(): Unit
  
  def move(): Unit
}
object Enter {
  
  inline def apply(enter: Callback, leave: Callback, move: Callback): Enter = {
    val __obj = js.Dynamic.literal(enter = enter.toJsFn, leave = leave.toJsFn, move = move.toJsFn)
    __obj.asInstanceOf[Enter]
  }
  
  extension [Self <: Enter](x: Self) {
    
    inline def setEnter(value: Callback): Self = StObject.set(x, "enter", value.toJsFn)
    
    inline def setLeave(value: Callback): Self = StObject.set(x, "leave", value.toJsFn)
    
    inline def setMove(value: Callback): Self = StObject.set(x, "move", value.toJsFn)
  }
}
