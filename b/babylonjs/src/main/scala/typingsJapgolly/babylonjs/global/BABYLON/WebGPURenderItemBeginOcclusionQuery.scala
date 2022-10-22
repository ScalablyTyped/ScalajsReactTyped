package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.GPURenderPassEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPURenderItemBeginOcclusionQuery")
@js.native
open class WebGPURenderItemBeginOcclusionQuery protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebGPURenderItemBeginOcclusionQuery {
  def this(query: Double) = this()
  
  /* CompleteClass */
  var query: Double = js.native
  
  /* CompleteClass */
  override def run(renderPass: GPURenderPassEncoder): Unit = js.native
}
