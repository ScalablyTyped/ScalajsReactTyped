package typingsJapgolly.gridstack

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDdResizableHandleMod {
  
  @JSImport("gridstack/dist/dd-resizable-handle", "DDResizableHandle")
  @js.native
  open class DDResizableHandle protected () extends StObject {
    def this(host: HTMLElement, direction: String, option: DDResizableHandleOpt) = this()
    
    /** call this when resize handle needs to be removed and cleaned up */
    def destroy(): DDResizableHandle = js.native
  }
  
  trait DDResizableHandleOpt extends StObject {
    
    var move: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var start: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var stop: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
  }
  object DDResizableHandleOpt {
    
    inline def apply(): DDResizableHandleOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DDResizableHandleOpt]
    }
    
    extension [Self <: DDResizableHandleOpt](x: Self) {
      
      inline def setMove(value: /* event */ Any => Callback): Self = StObject.set(x, "move", js.Any.fromFunction1((t0: /* event */ Any) => value(t0).runNow()))
      
      inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
      
      inline def setStart(value: /* event */ Any => Callback): Self = StObject.set(x, "start", js.Any.fromFunction1((t0: /* event */ Any) => value(t0).runNow()))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStop(value: /* event */ Any => Callback): Self = StObject.set(x, "stop", js.Any.fromFunction1((t0: /* event */ Any) => value(t0).runNow()))
      
      inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    }
  }
}
