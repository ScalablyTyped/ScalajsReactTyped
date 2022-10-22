package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesKeyboardControlTypesMod {
  
  trait IKeyboardControl extends StObject {
    
    def addKeyControl(key: Double, callback: EventListener): Unit
    
    def destroy(): Unit
  }
  object IKeyboardControl {
    
    inline def apply(addKeyControl: (Double, EventListener) => Callback, destroy: Callback): IKeyboardControl = {
      val __obj = js.Dynamic.literal(addKeyControl = js.Any.fromFunction2((t0: Double, t1: EventListener) => (addKeyControl(t0, t1)).runNow()), destroy = destroy.toJsFn)
      __obj.asInstanceOf[IKeyboardControl]
    }
    
    extension [Self <: IKeyboardControl](x: Self) {
      
      inline def setAddKeyControl(value: (Double, EventListener) => Callback): Self = StObject.set(x, "addKeyControl", js.Any.fromFunction2((t0: Double, t1: EventListener) => (value(t0, t1)).runNow()))
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    }
  }
}
