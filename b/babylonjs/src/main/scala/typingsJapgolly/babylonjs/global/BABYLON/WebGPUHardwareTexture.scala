package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import typingsJapgolly.babylonjs.GPUTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPUHardwareTexture")
@js.native
open class WebGPUHardwareTexture ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebGPUHardwareTexture {
  def this(existingTexture: Nullable[GPUTexture]) = this()
  
  /* CompleteClass */
  override def release(): Unit = js.native
  
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /* CompleteClass */
  override def set(hardwareTexture: Any): Unit = js.native
  
  /* CompleteClass */
  override def setUsage(textureSource: Double, generateMipMaps: Boolean, isCube: Boolean, width: Double, height: Double): Unit = js.native
  
  /* CompleteClass */
  var underlyingResource: Any = js.native
}
