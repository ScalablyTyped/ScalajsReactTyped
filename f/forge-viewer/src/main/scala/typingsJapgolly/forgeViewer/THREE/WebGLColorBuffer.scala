package typingsJapgolly.forgeViewer.THREE

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLColorBuffer extends StObject {
  
  def reset(): Unit
  
  def setClear(r: Double, g: Double, b: Double, a: Double): Unit
  
  def setLocked(lock: Boolean): Unit
  
  def setMask(colorMask: Double): Unit
}
object WebGLColorBuffer {
  
  inline def apply(
    reset: Callback,
    setClear: (Double, Double, Double, Double) => Callback,
    setLocked: Boolean => Callback,
    setMask: Double => Callback
  ): WebGLColorBuffer = {
    val __obj = js.Dynamic.literal(reset = reset.toJsFn, setClear = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (setClear(t0, t1, t2, t3)).runNow()), setLocked = js.Any.fromFunction1((t0: Boolean) => setLocked(t0).runNow()), setMask = js.Any.fromFunction1((t0: Double) => setMask(t0).runNow()))
    __obj.asInstanceOf[WebGLColorBuffer]
  }
  
  extension [Self <: WebGLColorBuffer](x: Self) {
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSetClear(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "setClear", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setSetLocked(value: Boolean => Callback): Self = StObject.set(x, "setLocked", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetMask(value: Double => Callback): Self = StObject.set(x, "setMask", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
