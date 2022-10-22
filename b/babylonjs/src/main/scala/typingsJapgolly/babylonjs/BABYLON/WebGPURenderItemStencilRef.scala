package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import typingsJapgolly.babylonjs.GPURenderPassEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGPURenderItemStencilRef
  extends StObject
     with IWebGPURenderItem {
  
  var ref: Double
}
object WebGPURenderItemStencilRef {
  
  inline def apply(ref: Double, run: GPURenderPassEncoder => Callback): WebGPURenderItemStencilRef = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], run = js.Any.fromFunction1((t0: GPURenderPassEncoder) => run(t0).runNow()))
    __obj.asInstanceOf[WebGPURenderItemStencilRef]
  }
  
  extension [Self <: WebGPURenderItemStencilRef](x: Self) {
    
    inline def setRef(value: Double): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
