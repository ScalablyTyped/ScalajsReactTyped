package typingsJapgolly.cannon.CANNON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayCollisionMatrix extends StObject {
  
  def get(i: Double, j: Double): Double
  
  var matrix: js.Array[Mat3]
  
  def reset(): Unit
  
  def set(i: Double, j: Double, value: Double): Unit
  
  def setNumObjects(n: Double): Unit
}
object ArrayCollisionMatrix {
  
  inline def apply(
    get: (Double, Double) => Double,
    matrix: js.Array[Mat3],
    reset: Callback,
    set: (Double, Double, Double) => Callback,
    setNumObjects: Double => Callback
  ): ArrayCollisionMatrix = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), matrix = matrix.asInstanceOf[js.Any], reset = reset.toJsFn, set = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (set(t0, t1, t2)).runNow()), setNumObjects = js.Any.fromFunction1((t0: Double) => setNumObjects(t0).runNow()))
    __obj.asInstanceOf[ArrayCollisionMatrix]
  }
  
  extension [Self <: ArrayCollisionMatrix](x: Self) {
    
    inline def setGet(value: (Double, Double) => Double): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setMatrix(value: js.Array[Mat3]): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixVarargs(value: Mat3*): Self = StObject.set(x, "matrix", js.Array(value*))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSet(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetNumObjects(value: Double => Callback): Self = StObject.set(x, "setNumObjects", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
