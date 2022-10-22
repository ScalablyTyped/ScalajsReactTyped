package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import typingsJapgolly.babylonjs.GPURenderPassEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGPURenderItemScissor
  extends StObject
     with IWebGPURenderItem {
  
  var h: Double
  
  var w: Double
  
  var x: Double
  
  var y: Double
}
object WebGPURenderItemScissor {
  
  inline def apply(h: Double, run: GPURenderPassEncoder => Callback, w: Double, x: Double, y: Double): WebGPURenderItemScissor = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], run = js.Any.fromFunction1((t0: GPURenderPassEncoder) => run(t0).runNow()), w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGPURenderItemScissor]
  }
  
  extension [Self <: WebGPURenderItemScissor](x: Self) {
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
