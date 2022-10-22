package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.GPUDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPUOcclusionQuery")
@js.native
open class WebGPUOcclusionQuery protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebGPUOcclusionQuery {
  def this(
    engine: typingsJapgolly.babylonjs.BABYLON.WebGPUEngine,
    device: GPUDevice,
    bufferManager: typingsJapgolly.babylonjs.BABYLON.WebGPUBufferManager
  ) = this()
  def this(
    engine: typingsJapgolly.babylonjs.BABYLON.WebGPUEngine,
    device: GPUDevice,
    bufferManager: typingsJapgolly.babylonjs.BABYLON.WebGPUBufferManager,
    startCount: Double
  ) = this()
  def this(
    engine: typingsJapgolly.babylonjs.BABYLON.WebGPUEngine,
    device: GPUDevice,
    bufferManager: typingsJapgolly.babylonjs.BABYLON.WebGPUBufferManager,
    startCount: Double,
    incrementCount: Double
  ) = this()
  def this(
    engine: typingsJapgolly.babylonjs.BABYLON.WebGPUEngine,
    device: GPUDevice,
    bufferManager: typingsJapgolly.babylonjs.BABYLON.WebGPUBufferManager,
    startCount: Unit,
    incrementCount: Double
  ) = this()
}
