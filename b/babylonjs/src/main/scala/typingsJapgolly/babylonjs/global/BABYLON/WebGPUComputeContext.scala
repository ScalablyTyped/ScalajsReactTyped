package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.GPUDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPUComputeContext")
@js.native
open class WebGPUComputeContext protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebGPUComputeContext {
  def this(device: GPUDevice, cacheSampler: typingsJapgolly.babylonjs.BABYLON.WebGPUCacheSampler) = this()
  
  /* CompleteClass */
  override def clear(): Unit = js.native
}
/* static members */
object WebGPUComputeContext {
  
  @JSGlobal("BABYLON.WebGPUComputeContext")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.WebGPUComputeContext._Counter")
  @js.native
  def _Counter: Any = js.native
  inline def _Counter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Counter")(x.asInstanceOf[js.Any])
}
