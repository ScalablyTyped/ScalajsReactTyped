package typingsJapgolly.slickgrid.Slick

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plugin[T /* <: SlickData */] extends StObject {
  
  def destroy(): Unit
  
  def init(grid: Grid[T]): Unit
}
object Plugin {
  
  inline def apply[T /* <: SlickData */](destroy: Callback, init: Grid[T] => Callback): Plugin[T] = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, init = js.Any.fromFunction1((t0: Grid[T]) => init(t0).runNow()))
    __obj.asInstanceOf[Plugin[T]]
  }
  
  extension [Self <: Plugin[?], T /* <: SlickData */](x: Self & Plugin[T]) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setInit(value: Grid[T] => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: Grid[T]) => value(t0).runNow()))
  }
}
