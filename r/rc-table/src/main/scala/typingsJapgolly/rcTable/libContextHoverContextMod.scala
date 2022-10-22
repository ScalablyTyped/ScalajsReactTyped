package typingsJapgolly.rcTable

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcTable.libContextSelectorMod.ReturnCreateContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextHoverContextMod extends Shortcut {
  
  @JSImport("rc-table/lib/context/HoverContext", JSImport.Default)
  @js.native
  val default: ReturnCreateContext[HoverContextProps] = js.native
  
  trait HoverContextProps extends StObject {
    
    var endRow: Double
    
    def onHover(start: Double, end: Double): Unit
    
    var startRow: Double
  }
  object HoverContextProps {
    
    inline def apply(endRow: Double, onHover: (Double, Double) => Callback, startRow: Double): HoverContextProps = {
      val __obj = js.Dynamic.literal(endRow = endRow.asInstanceOf[js.Any], onHover = js.Any.fromFunction2((t0: Double, t1: Double) => (onHover(t0, t1)).runNow()), startRow = startRow.asInstanceOf[js.Any])
      __obj.asInstanceOf[HoverContextProps]
    }
    
    extension [Self <: HoverContextProps](x: Self) {
      
      inline def setEndRow(value: Double): Self = StObject.set(x, "endRow", value.asInstanceOf[js.Any])
      
      inline def setOnHover(value: (Double, Double) => Callback): Self = StObject.set(x, "onHover", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReturnCreateContext[HoverContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `libContextHoverContextMod.foo` */
  override def _to: ReturnCreateContext[HoverContextProps] = default
}
