package typingsJapgolly.phaser.MatterJS

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxesFactory extends StObject {
  
  /**
    * Creates a new set of axes from the given vertices.
    * @method fromVertices
    * @param {vertices} vertices
    * @return {axes} A new axes from the given vertices
    */
  def fromVertices(vertices: js.Array[Vector]): js.Array[Vector]
  
  /**
    * Rotates a set of axes by the given angle.
    * @method rotate
    * @param {axes} axes
    * @param {number} angle
    */
  def rotate(axes: js.Array[Vector], angle: Double): Unit
}
object AxesFactory {
  
  inline def apply(fromVertices: js.Array[Vector] => js.Array[Vector], rotate: (js.Array[Vector], Double) => Callback): AxesFactory = {
    val __obj = js.Dynamic.literal(fromVertices = js.Any.fromFunction1(fromVertices), rotate = js.Any.fromFunction2((t0: js.Array[Vector], t1: Double) => (rotate(t0, t1)).runNow()))
    __obj.asInstanceOf[AxesFactory]
  }
  
  extension [Self <: AxesFactory](x: Self) {
    
    inline def setFromVertices(value: js.Array[Vector] => js.Array[Vector]): Self = StObject.set(x, "fromVertices", js.Any.fromFunction1(value))
    
    inline def setRotate(value: (js.Array[Vector], Double) => Callback): Self = StObject.set(x, "rotate", js.Any.fromFunction2((t0: js.Array[Vector], t1: Double) => (value(t0, t1)).runNow()))
  }
}
