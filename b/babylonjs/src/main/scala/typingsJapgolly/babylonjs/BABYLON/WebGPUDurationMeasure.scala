package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import typingsJapgolly.babylonjs.GPUCommandEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGPUDurationMeasure extends StObject {
  
  /* private */ var _querySet: Any
  
  def dispose(): Unit
  
  def start(encoder: GPUCommandEncoder): Unit
  
  def stop(encoder: GPUCommandEncoder): js.Promise[Double | Null]
}
object WebGPUDurationMeasure {
  
  inline def apply(
    _querySet: Any,
    dispose: Callback,
    start: GPUCommandEncoder => Callback,
    stop: GPUCommandEncoder => js.Promise[Double | Null]
  ): WebGPUDurationMeasure = {
    val __obj = js.Dynamic.literal(_querySet = _querySet.asInstanceOf[js.Any], dispose = dispose.toJsFn, start = js.Any.fromFunction1((t0: GPUCommandEncoder) => start(t0).runNow()), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[WebGPUDurationMeasure]
  }
  
  extension [Self <: WebGPUDurationMeasure](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setStart(value: GPUCommandEncoder => Callback): Self = StObject.set(x, "start", js.Any.fromFunction1((t0: GPUCommandEncoder) => value(t0).runNow()))
    
    inline def setStop(value: GPUCommandEncoder => js.Promise[Double | Null]): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
    
    inline def set_querySet(value: Any): Self = StObject.set(x, "_querySet", value.asInstanceOf[js.Any])
  }
}
