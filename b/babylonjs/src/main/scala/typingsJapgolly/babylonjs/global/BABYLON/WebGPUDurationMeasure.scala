package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.GPUCommandEncoder
import typingsJapgolly.babylonjs.GPUDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPUDurationMeasure")
@js.native
open class WebGPUDurationMeasure protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebGPUDurationMeasure {
  def this(device: GPUDevice, bufferManager: typingsJapgolly.babylonjs.BABYLON.WebGPUBufferManager) = this()
  
  /* private */ /* CompleteClass */
  var _querySet: Any = js.native
  
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /* CompleteClass */
  override def start(encoder: GPUCommandEncoder): Unit = js.native
  
  /* CompleteClass */
  override def stop(encoder: GPUCommandEncoder): js.Promise[Double | Null] = js.native
}
