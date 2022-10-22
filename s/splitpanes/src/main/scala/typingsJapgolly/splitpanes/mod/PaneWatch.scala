package typingsJapgolly.splitpanes.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaneWatch extends StObject {
  
  def maxSizeNumber(max: Double): Unit
  
  def minSizeNumber(min: Double): Unit
  
  def sizeNumber(size: Double): Unit
}
object PaneWatch {
  
  inline def apply(
    maxSizeNumber: Double => Callback,
    minSizeNumber: Double => Callback,
    sizeNumber: Double => Callback
  ): PaneWatch = {
    val __obj = js.Dynamic.literal(maxSizeNumber = js.Any.fromFunction1((t0: Double) => maxSizeNumber(t0).runNow()), minSizeNumber = js.Any.fromFunction1((t0: Double) => minSizeNumber(t0).runNow()), sizeNumber = js.Any.fromFunction1((t0: Double) => sizeNumber(t0).runNow()))
    __obj.asInstanceOf[PaneWatch]
  }
  
  extension [Self <: PaneWatch](x: Self) {
    
    inline def setMaxSizeNumber(value: Double => Callback): Self = StObject.set(x, "maxSizeNumber", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setMinSizeNumber(value: Double => Callback): Self = StObject.set(x, "minSizeNumber", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSizeNumber(value: Double => Callback): Self = StObject.set(x, "sizeNumber", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
