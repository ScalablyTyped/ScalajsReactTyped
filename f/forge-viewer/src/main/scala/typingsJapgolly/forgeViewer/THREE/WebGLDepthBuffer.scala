package typingsJapgolly.forgeViewer.THREE

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLDepthBuffer extends StObject {
  
  def reset(): Unit
  
  def setClear(depth: Any): Unit
  
  def setFunc(depthFunc: Any): Unit
  
  def setLocked(lock: Boolean): Unit
  
  def setMask(depthMask: Double): Unit
  
  def setTest(depthTest: Boolean): Unit
}
object WebGLDepthBuffer {
  
  inline def apply(
    reset: Callback,
    setClear: Any => Callback,
    setFunc: Any => Callback,
    setLocked: Boolean => Callback,
    setMask: Double => Callback,
    setTest: Boolean => Callback
  ): WebGLDepthBuffer = {
    val __obj = js.Dynamic.literal(reset = reset.toJsFn, setClear = js.Any.fromFunction1((t0: Any) => setClear(t0).runNow()), setFunc = js.Any.fromFunction1((t0: Any) => setFunc(t0).runNow()), setLocked = js.Any.fromFunction1((t0: Boolean) => setLocked(t0).runNow()), setMask = js.Any.fromFunction1((t0: Double) => setMask(t0).runNow()), setTest = js.Any.fromFunction1((t0: Boolean) => setTest(t0).runNow()))
    __obj.asInstanceOf[WebGLDepthBuffer]
  }
  
  extension [Self <: WebGLDepthBuffer](x: Self) {
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSetClear(value: Any => Callback): Self = StObject.set(x, "setClear", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetFunc(value: Any => Callback): Self = StObject.set(x, "setFunc", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetLocked(value: Boolean => Callback): Self = StObject.set(x, "setLocked", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetMask(value: Double => Callback): Self = StObject.set(x, "setMask", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetTest(value: Boolean => Callback): Self = StObject.set(x, "setTest", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
