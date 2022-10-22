package typingsJapgolly.rcTable

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcTable.libContextSelectorMod.ReturnCreateContext
import typingsJapgolly.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextResizeContextMod extends Shortcut {
  
  @JSImport("rc-table/lib/context/ResizeContext", JSImport.Default)
  @js.native
  val default: ReturnCreateContext[ResizeContextProps] = js.native
  
  trait ResizeContextProps extends StObject {
    
    def onColumnResize(columnKey: Key, width: Double): Unit
  }
  object ResizeContextProps {
    
    inline def apply(onColumnResize: (Key, Double) => Callback): ResizeContextProps = {
      val __obj = js.Dynamic.literal(onColumnResize = js.Any.fromFunction2((t0: Key, t1: Double) => (onColumnResize(t0, t1)).runNow()))
      __obj.asInstanceOf[ResizeContextProps]
    }
    
    extension [Self <: ResizeContextProps](x: Self) {
      
      inline def setOnColumnResize(value: (Key, Double) => Callback): Self = StObject.set(x, "onColumnResize", js.Any.fromFunction2((t0: Key, t1: Double) => (value(t0, t1)).runNow()))
    }
  }
  
  type _To = ReturnCreateContext[ResizeContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `libContextResizeContextMod.foo` */
  override def _to: ReturnCreateContext[ResizeContextProps] = default
}
