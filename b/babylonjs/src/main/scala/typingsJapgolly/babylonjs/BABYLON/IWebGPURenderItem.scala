package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import typingsJapgolly.babylonjs.GPURenderPassEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @internal */
trait IWebGPURenderItem extends StObject {
  
  def run(renderPass: GPURenderPassEncoder): Unit
}
object IWebGPURenderItem {
  
  inline def apply(run: GPURenderPassEncoder => Callback): IWebGPURenderItem = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1((t0: GPURenderPassEncoder) => run(t0).runNow()))
    __obj.asInstanceOf[IWebGPURenderItem]
  }
  
  extension [Self <: IWebGPURenderItem](x: Self) {
    
    inline def setRun(value: GPURenderPassEncoder => Callback): Self = StObject.set(x, "run", js.Any.fromFunction1((t0: GPURenderPassEncoder) => value(t0).runNow()))
  }
}
