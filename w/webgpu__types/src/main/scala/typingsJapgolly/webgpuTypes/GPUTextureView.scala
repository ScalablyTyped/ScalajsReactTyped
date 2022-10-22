package typingsJapgolly.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUTextureView
  extends StObject
     with GPUObjectBase
     with GPUBindingResource {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typingsJapgolly.webgpuTypes.webgpuTypesStrings.GPUTextureView
}
object GPUTextureView {
  
  inline def apply(label: String): GPUTextureView = {
    val __obj = js.Dynamic.literal(__brand = "GPUTextureView", label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUTextureView]
  }
  
  extension [Self <: GPUTextureView](x: Self) {
    
    inline def set__brand(value: typingsJapgolly.webgpuTypes.webgpuTypesStrings.GPUTextureView): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
