package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import typingsJapgolly.babylonjs.GPURenderPassEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGPURenderItemBlendColor
  extends StObject
     with IWebGPURenderItem {
  
  var color: js.Array[Nullable[Double]]
}
object WebGPURenderItemBlendColor {
  
  inline def apply(color: js.Array[Nullable[Double]], run: GPURenderPassEncoder => Callback): WebGPURenderItemBlendColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], run = js.Any.fromFunction1((t0: GPURenderPassEncoder) => run(t0).runNow()))
    __obj.asInstanceOf[WebGPURenderItemBlendColor]
  }
  
  extension [Self <: WebGPURenderItemBlendColor](x: Self) {
    
    inline def setColor(value: js.Array[Nullable[Double]]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorVarargs(value: Nullable[Double]*): Self = StObject.set(x, "color", js.Array(value*))
  }
}
