package typingsJapgolly.cssTree.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DSWalkOptions extends StObject {
  
  var enter: js.UndefOr[DSWalkEnterOrLeaveFn] = js.undefined
  
  var leave: js.UndefOr[DSWalkEnterOrLeaveFn] = js.undefined
}
object DSWalkOptions {
  
  inline def apply(): DSWalkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DSWalkOptions]
  }
  
  extension [Self <: DSWalkOptions](x: Self) {
    
    inline def setEnter(value: /* node */ DSNode => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction1((t0: /* node */ DSNode) => value(t0).runNow()))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setLeave(value: /* node */ DSNode => Callback): Self = StObject.set(x, "leave", js.Any.fromFunction1((t0: /* node */ DSNode) => value(t0).runNow()))
    
    inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
  }
}
