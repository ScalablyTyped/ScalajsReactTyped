package typingsJapgolly.reactStackGrid

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Appear extends StObject {
    
    def appear(): Unit
    
    def appeared(): Unit
    
    def enter(): Unit
    
    def entered(): Unit
    
    def leaved(): Unit
  }
  object Appear {
    
    inline def apply(appear: Callback, appeared: Callback, enter: Callback, entered: Callback, leaved: Callback): Appear = {
      val __obj = js.Dynamic.literal(appear = appear.toJsFn, appeared = appeared.toJsFn, enter = enter.toJsFn, entered = entered.toJsFn, leaved = leaved.toJsFn)
      __obj.asInstanceOf[Appear]
    }
    
    extension [Self <: Appear](x: Self) {
      
      inline def setAppear(value: Callback): Self = StObject.set(x, "appear", value.toJsFn)
      
      inline def setAppeared(value: Callback): Self = StObject.set(x, "appeared", value.toJsFn)
      
      inline def setEnter(value: Callback): Self = StObject.set(x, "enter", value.toJsFn)
      
      inline def setEntered(value: Callback): Self = StObject.set(x, "entered", value.toJsFn)
      
      inline def setLeaved(value: Callback): Self = StObject.set(x, "leaved", value.toJsFn)
    }
  }
}
