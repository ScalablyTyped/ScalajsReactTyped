package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import typingsJapgolly.babylonjs.GPURenderPassEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGPURenderItemEndOcclusionQuery
  extends StObject
     with IWebGPURenderItem
object WebGPURenderItemEndOcclusionQuery {
  
  inline def apply(run: GPURenderPassEncoder => Callback): WebGPURenderItemEndOcclusionQuery = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1((t0: GPURenderPassEncoder) => run(t0).runNow()))
    __obj.asInstanceOf[WebGPURenderItemEndOcclusionQuery]
  }
}
