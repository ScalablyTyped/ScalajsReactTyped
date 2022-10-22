package typingsJapgolly.cornerstoneCore.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.cornerstoneCore.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transform extends StObject {
  
  def invert(): Unit
  
  var m: js.Array[Double]
  
  def multiply(matrix: Any): Unit
  
  def reset(): Unit
  
  def rotate(rad: Any): Unit
  
  def scale(sx: Any, sy: Any): Unit
  
  def transformPoint(px: Any, py: Any): X
  
  def translate(x: Any, y: Any): Unit
}
object Transform {
  
  inline def apply(
    invert: Callback,
    m: js.Array[Double],
    multiply: Any => Callback,
    reset: Callback,
    rotate: Any => Callback,
    scale: (Any, Any) => Callback,
    transformPoint: (Any, Any) => X,
    translate: (Any, Any) => Callback
  ): Transform = {
    val __obj = js.Dynamic.literal(invert = invert.toJsFn, m = m.asInstanceOf[js.Any], multiply = js.Any.fromFunction1((t0: Any) => multiply(t0).runNow()), reset = reset.toJsFn, rotate = js.Any.fromFunction1((t0: Any) => rotate(t0).runNow()), scale = js.Any.fromFunction2((t0: Any, t1: Any) => (scale(t0, t1)).runNow()), transformPoint = js.Any.fromFunction2(transformPoint), translate = js.Any.fromFunction2((t0: Any, t1: Any) => (translate(t0, t1)).runNow()))
    __obj.asInstanceOf[Transform]
  }
  
  extension [Self <: Transform](x: Self) {
    
    inline def setInvert(value: Callback): Self = StObject.set(x, "invert", value.toJsFn)
    
    inline def setM(value: js.Array[Double]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    inline def setMVarargs(value: Double*): Self = StObject.set(x, "m", js.Array(value*))
    
    inline def setMultiply(value: Any => Callback): Self = StObject.set(x, "multiply", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setRotate(value: Any => Callback): Self = StObject.set(x, "rotate", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setScale(value: (Any, Any) => Callback): Self = StObject.set(x, "scale", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setTransformPoint(value: (Any, Any) => X): Self = StObject.set(x, "transformPoint", js.Any.fromFunction2(value))
    
    inline def setTranslate(value: (Any, Any) => Callback): Self = StObject.set(x, "translate", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
  }
}
