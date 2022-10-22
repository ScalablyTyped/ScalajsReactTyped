package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.GPUDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPUQuerySet")
@js.native
open class WebGPUQuerySet protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebGPUQuerySet {
  def this(
    count: Double,
    `type`: typingsJapgolly.babylonjs.BABYLON.QueryType,
    device: GPUDevice,
    bufferManager: typingsJapgolly.babylonjs.BABYLON.WebGPUBufferManager
  ) = this()
  def this(
    count: Double,
    `type`: typingsJapgolly.babylonjs.BABYLON.QueryType,
    device: GPUDevice,
    bufferManager: typingsJapgolly.babylonjs.BABYLON.WebGPUBufferManager,
    canUseMultipleBuffers: Boolean
  ) = this()
}
