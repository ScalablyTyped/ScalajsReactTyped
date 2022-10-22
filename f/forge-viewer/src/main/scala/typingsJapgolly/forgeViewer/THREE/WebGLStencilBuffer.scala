package typingsJapgolly.forgeViewer.THREE

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLStencilBuffer extends StObject {
  
  def reset(): Unit
  
  def setClear(stencil: Any): Unit
  
  def setFunc(stencilFunc: Any, stencilRef: Any, stencilMask: Double): Unit
  
  def setLocked(lock: Boolean): Unit
  
  def setMask(stencilMask: Double): Unit
  
  def setOp(stencilFail: Any, stencilZFail: Any, stencilZPass: Any): Unit
  
  def setTest(stencilTest: Boolean): Unit
}
object WebGLStencilBuffer {
  
  inline def apply(
    reset: Callback,
    setClear: Any => Callback,
    setFunc: (Any, Any, Double) => Callback,
    setLocked: Boolean => Callback,
    setMask: Double => Callback,
    setOp: (Any, Any, Any) => Callback,
    setTest: Boolean => Callback
  ): WebGLStencilBuffer = {
    val __obj = js.Dynamic.literal(reset = reset.toJsFn, setClear = js.Any.fromFunction1((t0: Any) => setClear(t0).runNow()), setFunc = js.Any.fromFunction3((t0: Any, t1: Any, t2: Double) => (setFunc(t0, t1, t2)).runNow()), setLocked = js.Any.fromFunction1((t0: Boolean) => setLocked(t0).runNow()), setMask = js.Any.fromFunction1((t0: Double) => setMask(t0).runNow()), setOp = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (setOp(t0, t1, t2)).runNow()), setTest = js.Any.fromFunction1((t0: Boolean) => setTest(t0).runNow()))
    __obj.asInstanceOf[WebGLStencilBuffer]
  }
  
  extension [Self <: WebGLStencilBuffer](x: Self) {
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSetClear(value: Any => Callback): Self = StObject.set(x, "setClear", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetFunc(value: (Any, Any, Double) => Callback): Self = StObject.set(x, "setFunc", js.Any.fromFunction3((t0: Any, t1: Any, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetLocked(value: Boolean => Callback): Self = StObject.set(x, "setLocked", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetMask(value: Double => Callback): Self = StObject.set(x, "setMask", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetOp(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "setOp", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetTest(value: Boolean => Callback): Self = StObject.set(x, "setTest", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
