package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasRect extends StObject {
  
  /* standard dom */
  def clearRect(x: Double, y: Double, w: Double, h: Double): Unit
  
  /* standard dom */
  def fillRect(x: Double, y: Double, w: Double, h: Double): Unit
  
  /* standard dom */
  def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit
}
object CanvasRect {
  
  inline def apply(
    clearRect: (Double, Double, Double, Double) => Callback,
    fillRect: (Double, Double, Double, Double) => Callback,
    strokeRect: (Double, Double, Double, Double) => Callback
  ): CanvasRect = {
    val __obj = js.Dynamic.literal(clearRect = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (clearRect(t0, t1, t2, t3)).runNow()), fillRect = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (fillRect(t0, t1, t2, t3)).runNow()), strokeRect = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (strokeRect(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[CanvasRect]
  }
  
  extension [Self <: CanvasRect](x: Self) {
    
    inline def setClearRect(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "clearRect", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setFillRect(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "fillRect", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setStrokeRect(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "strokeRect", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
  }
}
