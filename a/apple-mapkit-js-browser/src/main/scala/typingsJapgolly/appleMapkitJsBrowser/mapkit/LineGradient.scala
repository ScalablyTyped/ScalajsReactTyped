package typingsJapgolly.appleMapkitJsBrowser.mapkit

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A line that displays with a gradient along the length of the line.
  */
trait LineGradient extends StObject {
  
  /**
    * Adds a color transition point to the gradient.
    *
    * @param offset The unit distance at which to add the color.
    * @param color The CSS color at the transition point.
    */
  def addColorStop(offset: Double, color: String): Unit
  
  /**
    * Adds a color transition at the index point in the list of points within a polyline.
    *
    * @param index A valid index into a polyline’s points.
    * @param color The CSS color at the index point.
    */
  def addColorStopAtIndex(index: Double, color: String): Unit
}
object LineGradient {
  
  inline def apply(addColorStop: (Double, String) => Callback, addColorStopAtIndex: (Double, String) => Callback): LineGradient = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2((t0: Double, t1: String) => (addColorStop(t0, t1)).runNow()), addColorStopAtIndex = js.Any.fromFunction2((t0: Double, t1: String) => (addColorStopAtIndex(t0, t1)).runNow()))
    __obj.asInstanceOf[LineGradient]
  }
  
  extension [Self <: LineGradient](x: Self) {
    
    inline def setAddColorStop(value: (Double, String) => Callback): Self = StObject.set(x, "addColorStop", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setAddColorStopAtIndex(value: (Double, String) => Callback): Self = StObject.set(x, "addColorStopAtIndex", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
  }
}
