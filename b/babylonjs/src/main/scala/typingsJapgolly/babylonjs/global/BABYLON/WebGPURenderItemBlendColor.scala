package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import typingsJapgolly.babylonjs.GPURenderPassEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPURenderItemBlendColor")
@js.native
open class WebGPURenderItemBlendColor protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebGPURenderItemBlendColor {
  def this(color: js.Array[Nullable[Double]]) = this()
  
  /* CompleteClass */
  var color: js.Array[Nullable[Double]] = js.native
  
  /* CompleteClass */
  override def run(renderPass: GPURenderPassEncoder): Unit = js.native
}
