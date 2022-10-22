package typingsJapgolly.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babylonjs.GPUSampler
  - typingsJapgolly.babylonjs.GPUTextureView
  - typingsJapgolly.babylonjs.GPUBufferBinding
  - typingsJapgolly.babylonjs.GPUExternalTexture
*/
trait GPUBindingResource extends StObject
object GPUBindingResource {
  
  inline def GPUBufferBinding(buffer: GPUBuffer): typingsJapgolly.babylonjs.GPUBufferBinding = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.babylonjs.GPUBufferBinding]
  }
  
  inline def GPUExternalTexture(): typingsJapgolly.babylonjs.GPUExternalTexture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.babylonjs.GPUExternalTexture]
  }
  
  inline def GPUSampler(): typingsJapgolly.babylonjs.GPUSampler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.babylonjs.GPUSampler]
  }
  
  inline def GPUTextureView(): typingsJapgolly.babylonjs.GPUTextureView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.babylonjs.GPUTextureView]
  }
}
