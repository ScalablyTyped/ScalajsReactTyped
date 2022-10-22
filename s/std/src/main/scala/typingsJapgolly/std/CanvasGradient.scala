package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An opaque object describing a gradient. It is returned by the methods CanvasRenderingContext2D.createLinearGradient() or CanvasRenderingContext2D.createRadialGradient(). */
trait CanvasGradient extends StObject {
  
  /**
    * Adds a color stop with the given color to the gradient at the given offset. 0.0 is the offset at one end of the gradient, 1.0 is the offset at the other end.
    *
    * Throws an "IndexSizeError" DOMException if the offset is out of range. Throws a "SyntaxError" DOMException if the color cannot be parsed.
    */
  /* standard dom */
  def addColorStop(offset: Double, color: java.lang.String): Unit
}
object CanvasGradient {
  
  inline def apply(addColorStop: (Double, java.lang.String) => Callback): CanvasGradient = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2((t0: Double, t1: java.lang.String) => (addColorStop(t0, t1)).runNow()))
    __obj.asInstanceOf[CanvasGradient]
  }
  
  extension [Self <: CanvasGradient](x: Self) {
    
    inline def setAddColorStop(value: (Double, java.lang.String) => Callback): Self = StObject.set(x, "addColorStop", js.Any.fromFunction2((t0: Double, t1: java.lang.String) => (value(t0, t1)).runNow()))
  }
}
