package typingsJapgolly.forgeViewer.THREE

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path extends StObject {
  
  def lineTo(x: Double, y: Double): Unit
  
  def moveTo(x: Double, y: Double): Unit
}
object Path {
  
  inline def apply(lineTo: (Double, Double) => Callback, moveTo: (Double, Double) => Callback): Path = {
    val __obj = js.Dynamic.literal(lineTo = js.Any.fromFunction2((t0: Double, t1: Double) => (lineTo(t0, t1)).runNow()), moveTo = js.Any.fromFunction2((t0: Double, t1: Double) => (moveTo(t0, t1)).runNow()))
    __obj.asInstanceOf[Path]
  }
  
  extension [Self <: Path](x: Self) {
    
    inline def setLineTo(value: (Double, Double) => Callback): Self = StObject.set(x, "lineTo", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setMoveTo(value: (Double, Double) => Callback): Self = StObject.set(x, "moveTo", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
  }
}
